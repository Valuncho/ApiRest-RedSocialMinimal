package com.example.demo.Services;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("El correo electronico ya esta en uso"); // IllegalArgumentException ya esta implementada y no es necesario personalizar nada
        }
        return userRepository.save(user);
    }
    /*public User getById(int UserId)
    {
        return userRepository.getById(UserId);
    }*/
    public User updateUser(User user)
    {
        return userRepository.save(user);
    }

    public User findUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
