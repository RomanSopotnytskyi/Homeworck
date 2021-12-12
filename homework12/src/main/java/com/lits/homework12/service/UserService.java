package com.lits.homework12.service;

import com.lits.homework12.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void addUser(User User);

    Iterable<User> getAll();

    Iterable<User> getByAge(int age);

    void delete(Long id);

    Iterable<User> getByFirstName(String firstname);

    User updateUser(User user, Long id);
}

