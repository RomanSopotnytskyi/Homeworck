package com.lits.homework11.ui;

import com.lits.homework11.models.User;
import com.lits.homework11.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserConsoleController {

    @Autowired
    private UserService userService;

    public User getUserById(Long id){
        return userService.getById(id);
    }

    public Iterable<User> getAll(){
        return userService.getAll();
    }

    public void addUser(User user){
        userService.addUser(user);
    }

    public Iterable<User> getByLastname(String lastname) {
        return userService.getByLastname(lastname);
    }

    public User getByEmail(String email) {
        return userService.getByEmail(email);
    }

    public Iterable<User> getByAge(int age) {
        return userService.getByAge(age);
    }

    public Iterable<User> getWhereEmailIsGmail(){
        return userService.getWhereEmailIsGmail();
    }

}
