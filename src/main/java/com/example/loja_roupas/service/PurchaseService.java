package com.example.loja_roupas.service;

import com.example.loja_roupas.model.Purchase;
import com.example.loja_roupas.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    // Construtor para injeção de dependência do repositório
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    // Criar uma nova compra
    public Purchase create(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    // Atualizar uma compra existente
    public Purchase update(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    // Buscar uma compra por ID
    public Optional<Purchase> findById(Long id) {
        return purchaseRepository.findById(id);
    }

    // Deletar uma compra por ID
    public void delete(Long id) {
        purchaseRepository.deleteById(id);
    }

    // Buscar todas as compras de um cliente específico
    public List<Purchase> getPurchasesByCustomerId(Long customerId) {
        return purchaseRepository.findByCustomerId(customerId);
    }
}
