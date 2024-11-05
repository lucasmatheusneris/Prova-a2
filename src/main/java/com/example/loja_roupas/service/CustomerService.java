package com.example.loja_roupas.service;

import com.example.loja_roupas.model.Customer;
import com.example.loja_roupas.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Transactional
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Transactional
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Transactional
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
