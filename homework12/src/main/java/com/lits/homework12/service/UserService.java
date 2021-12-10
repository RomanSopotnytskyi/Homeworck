package com.lits.homework12.service;

import com.lits.homework12.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void addUser(User User);

    User getById(Long id);

    Iterable<User> getAll();

    User getByEmail(String email);

    Iterable<User> getByLastname(String lastname);

    Iterable<User> getByAge(int age);

    Iterable<User> getWhereEmailIsGmail();
}

