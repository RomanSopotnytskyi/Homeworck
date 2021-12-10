package com.lits.homework12.repository;

import com.lits.homework12.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    Iterable<User> findByLastname(String lastname);

    Optional<User> findByEmail(String email);

    @Query("select u from User u where u.age > ?1")
    Iterable<User> findByAgeGreaterThan(int ids);

    @Query("select u from User u where u.email like '%@gmail.com'")
    Iterable<User> findUsersWithGmailAddress();
}