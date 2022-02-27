package com.kbtg.bootcamp.product.response;

import com.kbtg.bootcamp.product.entity.ProductCategory;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductResponse {

    private Long id;

    private ProductCategory category;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private String imageUrl;

    private boolean active;

    private int unitsInStock;

    private Date createdDate;

    private Date updatedDate;
}
