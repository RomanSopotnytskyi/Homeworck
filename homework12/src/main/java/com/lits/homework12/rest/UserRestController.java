package com.lits.homework12.rest;

import com.lits.homework12.models.User;
import com.lits.homework12.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    //1. Написати ендпоінт щоб отримати всіх Юзерів
    @GetMapping
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    //2. Написати ендпоінт для того видалити по ід
    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    //3. Написати ендпоніт щоб створити Юзера
    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    //4. Написати ендпоніт щоб отримати юзера по firstname
    @GetMapping("/user/{firstname}")
    public Iterable<User> getByFirstName(@PathVariable String firstname) {
        return userService.getByFirstName(firstname);
    }

    //5. Написати всіх юзерів які старші 18 років
    @GetMapping("/{age}")
    public Iterable<User> getByAge(@PathVariable int age) {
        return userService.getByAge(age);
    }

    //6. Написати ендпоінт для оновлення юзера
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        return userService.updateUser(user, id);
    }
}
