package com.paulbriar.CampReviews.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Campground {

    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String streetAddress;
    @NotBlank
    private String town;
    @NotBlank
    private String stateOrProvince;
    @NotBlank
    private int ratingOutOfFive;

    public Campground(@JsonProperty("id") UUID id,
                      @JsonProperty("name") String name,
                      @JsonProperty("streetAddress") String streetAddress,
                      @JsonProperty("town") String town,
                      @JsonProperty("stateOrProvince") String stateOrProvince,
                      @JsonProperty("ratingOutOfFive") int ratingOutOfFive) {
        this.id = id;
        this.name = name;
        this.streetAddress = streetAddress;
        this.town = town;
        this.stateOrProvince = stateOrProvince;
        this.ratingOutOfFive = ratingOutOfFive;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public int getRatingOutOfFive() {
        return ratingOutOfFive;
    }

    public void setRatingOutOfFive(int ratingOutOfFive) {
        this.ratingOutOfFive = ratingOutOfFive;
    }

}
