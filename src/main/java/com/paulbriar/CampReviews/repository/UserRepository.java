package com.paulbriar.CampReviews.repository;

import com.paulbriar.CampReviews.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
