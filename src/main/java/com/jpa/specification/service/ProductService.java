package com.jpa.specification.service;

import com.jpa.specification.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> findAllByNameLike(String name);
    List<Product> findAllByNameAndPriceGreaterThanOrEqualTo(String name, double price);
}
