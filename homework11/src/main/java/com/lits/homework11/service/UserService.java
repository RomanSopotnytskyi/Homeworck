package com.lits.homework11.service;

import com.lits.homework11.models.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void addUser(User User);

    User getById(Long id);

    List<User> getAll();

    List<User> getByLastname(String lastname);

    User getByEmail(String email);

    List<User> getByAge(int age);

    List<User> getWhereEmailIsGmail();
}
