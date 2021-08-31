package dataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseItem {
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

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public int getReviewScore() {
        return reviewScore;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
}