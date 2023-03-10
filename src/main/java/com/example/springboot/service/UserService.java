package com.example.springboot.service;



import com.example.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    void removeUserById(int id);

    User saveUser(User user);

//    User updateUser(int id, User user); // какой смысл в update? без него же всё прекрасно работает

    User getUserById(int id);
}
