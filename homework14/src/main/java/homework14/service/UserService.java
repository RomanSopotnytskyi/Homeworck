package homework14.service;

import homework14.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserDTO addUser(UserDTO User);

    List<UserDTO> getAll();

    List<UserDTO> getByAge(int age);

    void delete(Long id);

    UserDTO getByUserName(String username);

    UserDTO getUserById(Long id);

    UserDTO updateUser(UserDTO user, Long id);
}

