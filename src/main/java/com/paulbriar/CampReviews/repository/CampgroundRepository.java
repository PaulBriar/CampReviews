package com.paulbriar.CampReviews.repository;

import com.paulbriar.CampReviews.model.Campground;
import org.springframework.data.repository.CrudRepository;

public interface CampgroundRepository extends CrudRepository<Campground, Long> {
}
