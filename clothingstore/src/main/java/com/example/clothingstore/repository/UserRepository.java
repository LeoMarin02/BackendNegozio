package com.example.clothingstore.repository;

import com.example.clothingstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email); // Controlla se l'email esiste già nel database
    User findByEmail(String email); // Trova l'utente per email
}
