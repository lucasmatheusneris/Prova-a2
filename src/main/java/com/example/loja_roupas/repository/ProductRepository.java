package com.example.loja_roupas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loja_roupas.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
}
