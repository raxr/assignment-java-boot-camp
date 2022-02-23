package com.kbtg.bootcamp.product.repository;

import com.kbtg.bootcamp.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
