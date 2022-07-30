package com.example.ead.service;

import com.example.ead.entity.Product;
import com.example.ead.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    final ProductRepository productRepository;

    public void save(Product product) {
        productRepository.save(product);
    }

    public Product findById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public void delete(String id) {
        productRepository.deleteById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }


}
