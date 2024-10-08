package com.ijse.hellospring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String name;
    private Double price;
    private Integer quantity;
    private Long categoryId;
}