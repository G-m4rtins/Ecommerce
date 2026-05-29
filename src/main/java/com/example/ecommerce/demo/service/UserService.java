package com.example.ecommerce.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.demo.exception.UserException;
import com.example.ecommerce.demo.model.User;
import com.example.ecommerce.demo.model.enums.Role;
import com.example.ecommerce.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(String name, String email, String password, Role Role) {
        User user = new User();

        if (userRepository.findByEmail(email) != null) {
            throw UserException.emailAlreadyExists("Email already in use", email);
        }

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(Role);

        userRepository.save(user);
    }

    

}
