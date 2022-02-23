package com.kbtg.bootcamp.product.service.impl;

import com.kbtg.bootcamp.product.entity.Product;
import com.kbtg.bootcamp.product.exception.CategoryNotFoundException;
import com.kbtg.bootcamp.product.mapper.ProductMapper;
import com.kbtg.bootcamp.product.repository.ProductRepository;
import com.kbtg.bootcamp.product.response.ProductResponse;
import com.kbtg.bootcamp.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public ProductResponse getCategory(Long id) {
        Optional<Product> result = productRepository.findByCategoryId(id);
        return result.map(productMapper::toProductResponse).orElseThrow(() -> new CategoryNotFoundException(id));
    }
}
