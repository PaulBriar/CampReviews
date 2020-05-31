package com.paulbriar.CampReviews.error;

import com.paulbriar.CampReviews.model.User;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(User user) {
        super("User id not found " + user);
    }
}
