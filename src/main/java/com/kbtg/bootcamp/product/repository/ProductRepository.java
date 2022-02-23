package com.kbtg.bootcamp.product.repository;

import com.kbtg.bootcamp.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCategoryId(@RequestParam("id") Long id);
}
