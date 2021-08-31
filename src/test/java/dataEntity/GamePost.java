package dataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GamePost{

	@JsonProperty("reviewScore")
	private int reviewScore;

	@JsonProperty("releaseDate")
	private String releaseDate;

	@JsonProperty("name")
	private String name;

	@JsonProperty("rating")
	private String rating;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private String category;

	public void setReviewScore(int reviewScore){
		this.reviewScore = reviewScore;
	}

	public int getReviewScore(){
		return reviewScore;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRating(String rating){
		this.rating = rating;
	}

	public String getRating(){
		return rating;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public GamePost( int id, String name, String releaseDate, int reviewScore, String category, String rating) {
		setId(id);
		setName(name);
		setReleaseDate(releaseDate);
		setReviewScore(reviewScore);
		setCategory(category);
		setRating(rating);
	}
}