package com.kbtg.bootcamp.product.advice;

import com.kbtg.bootcamp.product.exception.CategoryNotFoundException;
import com.kbtg.bootcamp.product.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductControllerAdvice {

    @ExceptionHandler(CategoryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ApiResponse categoryNotFound(CategoryNotFoundException exception) {
        return new ApiResponse("category = %s not found".formatted(exception.getMessage()));
    }

}
