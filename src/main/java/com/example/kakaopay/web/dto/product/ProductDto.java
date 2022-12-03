package com.example.kakaopay.web.dto.product;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductDto {
    private String name;
    @NotNull
    private int price;
}
