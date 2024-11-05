package com.example.loja_roupas.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToMany
    @JoinTable(
        name = "purchase_products",
        joinColumns = @JoinColumn(name = "purchase_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    // Construtor padrão
    public Purchase() {
        this.purchaseDate = LocalDateTime.now(); // Define a data da compra como a data atual
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    // Override toString, equals e hashCode (opcional, mas recomendado)
    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", customer=" + customer +
                ", products=" + products +
                ", purchaseDate=" + purchaseDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return id != null && id.equals(purchase.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
