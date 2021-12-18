package homework14.service.impl;

import homework14.service.UserService;
import homework14.dto.UserDTO;
import homework14.exception.UserNotFoundException;
import homework14.models.User;
import homework14.repository.UserRepository;
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
    public UserDTO addUser(UserDTO userDTO) {
        User user = userRepository.save(modelMapper.map(userDTO, User.class));
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = (List<User>) userRepository.findAll();
        return users.stream().map(user -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO getByUserName(String username) {
        return modelMapper.map(userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("user username "+username+" not found")), UserDTO.class);
    }

    @Override
    public UserDTO getUserById(Long id) {
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
        return userRepository.findById(id).map(user -> {
                    user.setUsername(userDTO.getUsername());
                    user.setAge(userDTO.getAge());
                    user.setEmail(userDTO.getEmail());
                    user.setSalary(userDTO.getSalary());
                    userRepository.save(user);
                    return modelMapper.map(user, UserDTO.class);
                }).orElseThrow(() -> new UserNotFoundException("user id "+id+" not found"));

    }
}
