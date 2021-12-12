package com.lits.homework12.service.impl;

import com.lits.homework12.models.User;
import com.lits.homework12.repository.UserRepository;
import com.lits.homework12.service.UserService;
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
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<User> getByFirstName(String firstname) {
        return userRepository.findByFirstname(firstname);
    }

    @Override
    public Iterable<User> getByAge(int age) {
        return userRepository.findByAgeGreaterThan(age);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User newUser, Long id) {
        return userRepository.findById(id).map(user -> {
                    user.setFirstname(newUser.getFirstname());
                    user.setLastname(newUser.getLastname());
                    user.setAge(newUser.getAge());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }
}
