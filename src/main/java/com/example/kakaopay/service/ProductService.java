package com.example.kakaopay.service;

import com.example.kakaopay.domain.product.Product;
import com.example.kakaopay.domain.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional
    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    @Transactional
    public void updateProduct(Product product){
        productRepository.save(product);
    }
}
