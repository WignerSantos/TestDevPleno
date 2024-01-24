package com.wigner.TestDevPleno.services;

import com.wigner.TestDevPleno.model.User;
import com.wigner.TestDevPleno.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User readByEmail(String email) {
        return userRepository.readByEmail(email);
    }

}
