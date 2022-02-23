package com.kbtg.bootcamp.product.mapper;

import com.kbtg.bootcamp.product.entity.Product;
import com.kbtg.bootcamp.product.response.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse toProductResponse(Product product);
}
