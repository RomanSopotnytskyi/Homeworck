package com.lits.homework11.repository;

import com.lits.homework11.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    @Override
    List<User> findAll();

    List<User> findByLastname(String lastname);

    User findByEmail(String email);

    @Query("select u from User u where u.age > ?1")
    List<User> findByAgeGreaterThan(int ids);

    @Query("select u from User u where u.email like '%@gmail.com'")
    List<User> findUsersWithGmailAddress();
}