package com.paulbriar.CampReviews.dao;

import com.paulbriar.CampReviews.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserDataAccessService implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUser(UUID id, User user) {
       var sql = "INSERT INTO users(id, firstName, lastName, city, stateOrProvince) VALUES (?,?,?,?,?)";
       return jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getCity(), user.getStateOrProvince());
    }

    @Override
    public List<User> selectAllUsers() {
       var sql = "SELECT id, firstName, lastName, city, stateOrProvince FROM users";
       return jdbcTemplate.query(sql, (resultSet, i) -> {
           var userId = UUID.fromString(resultSet.getString("id"));
           var firstName = resultSet.getString("firstName");
           var lastName = resultSet.getString("lastName");
           var city = resultSet.getString("city");
           var stateOrProvince = resultSet.getString("stateOrProvince");
           return new User(userId, firstName, lastName, city, stateOrProvince);
       });
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        return 0;
    }
}
