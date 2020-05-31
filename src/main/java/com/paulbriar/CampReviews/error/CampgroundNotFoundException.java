package com.paulbriar.CampReviews.error;

import com.paulbriar.CampReviews.model.Campground;

public class CampgroundNotFoundException extends RuntimeException {

    public CampgroundNotFoundException(Campground campground) {
        super("Campground id not found " + campground);
    }
}
