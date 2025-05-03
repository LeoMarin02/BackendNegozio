package com.example.clothingstore.service;

import java.util.List;

import com.example.clothingstore.dto.ProductDTO;

public interface ProductService {

    ProductDTO createProduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(Long id);

    void deleteProduct(Long id);

    List<String> getDistinctCategories();

    ProductDTO updateProduct(Long id, ProductDTO productDTO);
}
