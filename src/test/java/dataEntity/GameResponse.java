package dataEntity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GameResponse {

	@JsonProperty("Response")
	private List<ResponseItem> response;

	public List<ResponseItem> getResponse(){
		return response;
	}
}