package homework14.service.impl;

import homework14.dto.UserDTO;
import homework14.exception.UserNotFoundException;
import homework14.models.User;
import homework14.repository.UserRepository;
import homework14.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    private static final long USER_ID = 1L;

    private static final String USERNAME = "Roman";

    private static final int USER_AGE = 18;

    @Mock
    private UserRepository userRepositoryMock;

    @Mock
    private ModelMapper mapperMock;


    @InjectMocks
    private UserService userService = new UserServiceImpl();

    @Test
    public void whenUserIdIsPresentGetUser() {
        Optional<User> userOptional = Optional.of(new User());
        UserDTO userDTO = new UserDTO();

        when(userRepositoryMock.findById(USER_ID)).thenReturn(userOptional);
        when(mapperMock.map(userOptional.get(), UserDTO.class)).thenReturn(userDTO);
        assertEquals(userDTO, userService.getUserById(USER_ID));
    }

    @Test(expected = UserNotFoundException.class)
    public void whenUserIdIsNotPresentThrowException() {
        User user = null;

        when(userRepositoryMock.findById(USER_ID)).thenReturn(Optional.ofNullable(user));
        userService.getUserById(USER_ID);
    }

    @Test
    public void whenUserCreatedReturnIt() {
        UserDTO userDTO = new UserDTO();
        UserDTO createdUserDTO = new UserDTO();
        User user = new User();
        User createdUser = new User();

        when(mapperMock.map(userDTO, User.class)).thenReturn(user);
        when(userRepositoryMock.save(user)).thenReturn(createdUser);
        when(mapperMock.map(createdUser, UserDTO.class)).thenReturn(createdUserDTO);
        assertEquals(createdUserDTO, userService.addUser(createdUserDTO));
    }

    @Test
    public void whenCreateUserCallSave() {

        UserDTO userDTO = new UserDTO();

        UserDTO createdUserDTO = new UserDTO();
        User user = new User();
        User createdUser = new User();

        when(mapperMock.map(userDTO, User.class)).thenReturn(user);
        when(userRepositoryMock.save(user)).thenReturn(createdUser);
        when(mapperMock.map(createdUser, UserDTO.class)).thenReturn(createdUserDTO);

        userService.addUser(userDTO);

        verify(userRepositoryMock, times(1)).save(any(User.class));
    }

    @Test
    public void whenUsersIsPresentGetAll() {
        List<User> userList = new ArrayList<>();
        List<UserDTO> userDTOList = new ArrayList<>();
        User user = new User();
        UserDTO userDTO = new UserDTO();

        when(userRepositoryMock.findAll()).thenReturn(userList);
        when(mapperMock.map(user, UserDTO.class)).thenReturn(userDTO);
        assertEquals(userDTOList, userService.getAll());
    }

    @Test
    public void whenUserUsernameIsPresentGetUsername() {
        Optional<User> userOptional = Optional.of(new User());
        UserDTO userDTO = new UserDTO();

        when(userRepositoryMock.findByUsername(USERNAME)).thenReturn(userOptional);
        when(mapperMock.map(userOptional.get(), UserDTO.class)).thenReturn(userDTO);
        assertEquals(userDTO, userService.getByUserName(USERNAME));
    }

    @Test(expected = UserNotFoundException.class)
    public void whenUserUsernameIsNotPresentThrowException() {
        User user = null;

        when(userRepositoryMock.findByUsername(USERNAME)).thenReturn(Optional.ofNullable(user));
        userService.getByUserName(USERNAME);
    }

    @Test
    public void whenUsersIsPresentGetUserByAge() {
        List<User> userList = new ArrayList<>();
        List<UserDTO> userDTOList = new ArrayList<>();
        User user = new User();
        UserDTO userDTO = new UserDTO();

        when(userRepositoryMock.findByAgeGreaterThan(USER_AGE)).thenReturn(userList);
        when(mapperMock.map(user, UserDTO.class)).thenReturn(userDTO);
        assertEquals(userDTOList, userService.getByAge(USER_AGE));
    }

    @Test
    public void whenDeleteUserCallDeleteById(){
        userService.delete(USER_ID);
        verify(userRepositoryMock, times(1)).deleteById(USER_ID);
    }

    @Test
    public void whenUserUpdateIsPresentGetUser() {
        Optional<User> userOptional = Optional.of(new User());
        UserDTO userDTO = new UserDTO();

        when(userRepositoryMock.findById(USER_ID)).thenReturn(userOptional);
        when(mapperMock.map(userOptional.get(), UserDTO.class)).thenReturn(userDTO);
        assertEquals(userDTO, userService.updateUser(userDTO, USER_ID));
    }

    @Test(expected = UserNotFoundException.class)
    public void whenUserUpdateIsNotPresentThrowException1() {
        User user = null;
        UserDTO userDTO = new UserDTO();

        when(userRepositoryMock.findById(USER_ID)).thenReturn(Optional.ofNullable(user));
        userService.updateUser(userDTO, USER_ID);
    }
}