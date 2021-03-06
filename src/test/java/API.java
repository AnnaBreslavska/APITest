import dataEntity.GamePost;
import dataEntity.ResponseItem;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.apache.http.HttpStatus.SC_OK;


public class API {

    @BeforeMethod
    public void requestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://localhost:8080/app/")
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .build();
    }

    @BeforeMethod
    public void responseSpecification() {
        responseSpecification = new ResponseSpecBuilder()
                .expectResponseTime(Matchers.lessThan(9000L))
                .build();
    }

    @Test
    public void getAllGames() {
        given()
                .spec(requestSpecification)
                .when().get("videogames")
                .then()
                .assertThat()
                .spec(responseSpecification)
                .log()
                .all();
    }

    @Test
    public void createGame() {
        GamePost gamePost = new GamePost
                (79, "The Sims4", "2014", 150, "Strategy", "Best");
        given()
                .body(gamePost)
                .when()
                .post("http://localhost:8080/app/videogames/")
                .then()
                .assertThat()
                .statusCode(SC_OK)
                .log()
                .body();
    }

    @Test
    public void getGameById() {
        int gameId = 1;
        Response response = given()
                .spec(requestSpecification)
                .when().get("videogames/" + gameId);
        ResponseItem gameResponse = response.as(ResponseItem.class);
        System.out.println("Id:" + gameResponse.getId());
        System.out.println("Game Name:" + gameResponse.getName());
    }

    @Test
    public void updateGameById() {
        int gameId = 1;
        Response response = given()
                .spec(requestSpecification)
                .when().get("videogames/" + gameId);
        ResponseItem gameResponse = response.as(ResponseItem.class);
        gameResponse.setName("Killing Machine");
        gameResponse.setCategory("Shooting game");
        given()
                .body(gameResponse)
                .when()
                .put("http://localhost:8080/app/videogames/" + gameId)
                .then()
                .assertThat()
                .statusCode(SC_OK)
                .log()
                .body();
    }
}
