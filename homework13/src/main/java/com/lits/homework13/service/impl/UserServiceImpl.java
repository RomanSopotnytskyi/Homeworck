package com.lits.homework13.service.impl;

import com.lits.homework13.dto.UserDTO;
import com.lits.homework13.exception.UserNotFoundException;
import com.lits.homework13.models.User;
import com.lits.homework13.repository.UserRepository;
import com.lits.homework13.service.UserService;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addUser(UserDTO userDTO) {
        userRepository.save(modelMapper.map(userDTO, User.class));
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = (List<User>) userRepository.findAll();
        return users.stream().map(user -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO getByUserName(String username) {
        return modelMapper.map(userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("user id "+username+" not found")), UserDTO.class);
    }

    @Override
    public UserDTO getById(Long id) {
        return modelMapper.map(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("user id "+id+" not found")), UserDTO.class);
    }

    @Override
    public List<UserDTO> getByAge(int age) {
        List<User> users = (List<User>) userRepository.findByAgeGreaterThan(age);
        return users.stream().map(user -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Long id) {
        if (userRepository.findById(id).isPresent()){
            User newUser = userRepository.findById(id).get();

            newUser.setUsername(userDTO.getUsername());
            newUser.setEmail(userDTO.getEmail());
            newUser.setAge(userDTO.getAge());
            newUser.setSalary(userDTO.getSalary());

            userRepository.save(newUser);

            return modelMapper.map(newUser, UserDTO.class);
        }else{
            //new UserNotFoundException("user id "+id+" not found");
            return null;
        }
    }
}
