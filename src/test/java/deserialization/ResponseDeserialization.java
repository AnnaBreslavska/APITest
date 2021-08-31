package deserialization;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDeserialization{

	@JsonProperty("ResponseDeserialization")
	private List<ResponseDeserializationItem> responseDeserialization;

	public List<ResponseDeserializationItem> getResponseDeserialization(){
		return responseDeserialization;
	}
}