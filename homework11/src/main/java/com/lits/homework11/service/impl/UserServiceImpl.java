package com.lits.homework11.service.impl;

import com.lits.homework11.models.User;
import com.lits.homework11.repository.UserRepository;
import com.lits.homework11.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<User> getByLastname(String lastname) {
        return userRepository.findByLastname(lastname);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow();
    }

    @Override
    public Iterable<User> getByAge(int age) {
        return userRepository.findByAgeGreaterThan(age);
    }

    @Override
    public Iterable<User> getWhereEmailIsGmail() {
        return userRepository.findUsersWithGmailAddress();
    }
}
