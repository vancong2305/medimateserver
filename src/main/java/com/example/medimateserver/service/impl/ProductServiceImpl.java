package com.example.medimateserver.service.impl;

import com.example.medimateserver.model.Product;
import com.example.medimateserver.service.ProductService;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(BigInteger id) {
        return null;
    }

    @Override
    public Product findByEmail(String email) {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product update(BigInteger id, Product product) {
        return null;
    }

    @Override
    public void deleteById(BigInteger id) {

    }


}
