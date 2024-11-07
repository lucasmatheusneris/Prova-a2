package com.example.loja_roupas.repository;

import com.example.loja_roupas.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findByCustomerId(Long customerId); // Método customizado para buscar compras por ID de cliente
}
