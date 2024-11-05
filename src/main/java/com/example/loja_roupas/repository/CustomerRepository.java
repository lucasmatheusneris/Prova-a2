package com.example.loja_roupas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loja_roupas.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
