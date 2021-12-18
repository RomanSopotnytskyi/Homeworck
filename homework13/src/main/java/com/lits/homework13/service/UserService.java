package com.lits.homework13.service;

import com.lits.homework13.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void addUser(UserDTO User);

    List<UserDTO> getAll();

    List<UserDTO> getByAge(int age);

    void delete(Long id);

    UserDTO getByUserName(String username);

    UserDTO getById(Long id);

    UserDTO updateUser(UserDTO user, Long id);
}

