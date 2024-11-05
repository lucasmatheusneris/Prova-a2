package com.example.loja_roupas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.loja_roupas.model")
@EnableJpaRepositories(basePackages = "com.example.loja_roupas.repository")
public class LojaRoupasApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaRoupasApplication.class, args);
    }
}
