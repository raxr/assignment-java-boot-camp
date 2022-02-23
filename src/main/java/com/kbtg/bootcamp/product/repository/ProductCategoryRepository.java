package com.kbtg.bootcamp.product.repository;

import com.kbtg.bootcamp.product.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
