package com.lits.homework13.rest;

import com.lits.homework13.dto.UserDTO;
import com.lits.homework13.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAll() {
        return userService.getAll();
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@Validated @RequestBody UserDTO user) {
        userService.addUser(user);
    }

    @GetMapping("/user")
    public UserDTO getByUsername(@RequestParam String username) {
        return userService.getByUserName(username);
    }

    @GetMapping("/user/{id}")
    public UserDTO getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/{age}")
    public List<UserDTO> getByAge(@PathVariable int age) {
        return userService.getByAge(age);
    }

    @PutMapping("/user/{id}")
    public UserDTO updateUser(@PathVariable("id") Long id,@Validated @RequestBody UserDTO user) {
        return userService.updateUser(user, id);
    }
}
