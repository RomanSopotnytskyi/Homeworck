package com.lits.homework12.rest;

import com.lits.homework12.models.User;
import com.lits.homework12.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@Component
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> getAll(){
        return userService.getAll();
    }

    /*
    public User getUserById(Long id){
        return userService.getById(id);
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
*/
}
