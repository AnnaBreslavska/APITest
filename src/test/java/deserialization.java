import io.restassured.response.Response;
import org.testng.annotations.Test;
import deserialization.ResponseDeserializationItem;

import static io.restassured.RestAssured.given;

public class deserialization {

    @Test
    public void deserializationMethod() {
        Response response =
                given()
                .when()
                .get("http://jsonplaceholder.typicode.com/users");
        ResponseDeserializationItem[] responseForDeserialization = response.as(ResponseDeserializationItem[].class);
        System.out.println("Name: " + responseForDeserialization[0].getName());
        System.out.println("User Name: " + responseForDeserialization[0].getUsername());
        System.out.println("Company Nam: " + responseForDeserialization[0].getCompany().getName());
        System.out.println("User Address Lat: " + responseForDeserialization[0].getAddress().getGeo().getLat());
    }
}
