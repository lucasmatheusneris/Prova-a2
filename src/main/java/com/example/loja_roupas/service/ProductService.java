package com.example.loja_roupas.service;

import com.example.loja_roupas.model.Product;
import com.example.loja_roupas.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Transactional
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
