package com.example.clothingstore.repository;

import com.example.clothingstore.entity.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {
  
    @Query("SELECT DISTINCT p.category FROM Product p")
    List<String> findDistinctCategories();
  }
