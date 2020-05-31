package com.paulbriar.CampReviews.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Campground {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String streetAddress;
    private String town;
    private String stateOrProvince;
    private int ratingOutOfFive;

    @OneToMany
    private Set<Campground> campgrounds = new HashSet<>();

    public Campground(){}

    public Campground(String name, String streetAddress, String town, String stateOrProvince, int ratingOutOfFive) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.town = town;
        this.stateOrProvince = stateOrProvince;
        this.ratingOutOfFive = ratingOutOfFive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Campground{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", town='" + town + '\'' +
                ", stateOrProvince='" + stateOrProvince + '\'' +
                ", ratingOutOfFive=" + ratingOutOfFive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Campground that = (Campground) o;

        if (ratingOutOfFive != that.ratingOutOfFive) return false;
        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        if (!streetAddress.equals(that.streetAddress)) return false;
        if (!town.equals(that.town)) return false;
        return stateOrProvince.equals(that.stateOrProvince);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
