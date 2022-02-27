package com.kbtg.bootcamp.product.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(Long id) {
        super(String.valueOf(id));
    }
}
