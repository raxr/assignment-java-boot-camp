package com.kbtg.bootcamp.product.service;

import com.kbtg.bootcamp.product.response.ProductResponse;

public interface ProductService {
    ProductResponse getCategory(Long id);
}
