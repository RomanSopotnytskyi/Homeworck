package com.lits.homework11.ui;

import com.lits.homework11.models.User;
import com.lits.homework11.service.UserService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
public class UserConsoleController {

    @Autowired
    private UserService userService;

    public void addUser(User user){
        userService.addUser(user);
    }

    public User getUserById(Long id){
        return userService.getById(id);
    }

    public List<User> getAll(){
        return userService.getAll();
    }

    public List<User> getByLastname(String lastname) {
        return userService.getByLastname(lastname);
    }

    public User getByEmail(String email) {
        return userService.getByEmail(email);
    }

    public List<User> getByAge(int age) {
        return userService.getByAge(age);
    }

    public List<User> getWhereEmailIsGmail(){
        return userService.getWhereEmailIsGmail();
    }

}
