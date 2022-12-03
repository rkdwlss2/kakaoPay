package com.example.kakaopay.web;

import com.example.kakaopay.domain.product.Product;
import com.example.kakaopay.service.ProductService;
import com.example.kakaopay.web.dto.CMRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("get/product")
    public ResponseEntity<?> getProductList(){
        return new ResponseEntity<>(new CMRespDto<>(1,"커피 리스트 제공",productService.getProductList()), HttpStatus.OK);
    }

    @PostMapping("update/product")
    public ResponseEntity<?> updateProduct(@RequestBody Product product){
        return new ResponseEntity<>(new CMRespDto<>(1,"커피 제품 등록",null),HttpStatus.OK);
    }
}
