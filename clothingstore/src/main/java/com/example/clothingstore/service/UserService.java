package com.example.clothingstore.service;

import com.example.clothingstore.entity.User;
import com.example.clothingstore.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        // 👇 Prima controlliamo se l'email è già registrata
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email già registrata.");
        }
    
        // 👇 Cifriamo la password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRuolo("USER"); // default ruolo USER, puoi personalizzare
        return userRepository.save(user);
    }
    
}
