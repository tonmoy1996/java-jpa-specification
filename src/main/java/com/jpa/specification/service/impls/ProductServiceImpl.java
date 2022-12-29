package com.jpa.specification.service.impls;

import com.jpa.specification.models.Product;
import com.jpa.specification.repository.ProductRepository;
import com.jpa.specification.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.jpa.specification.specifications.ProductSpecification.nameLike;
import static com.jpa.specification.specifications.ProductSpecification.priceGreaterThanOrEqualTo;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllByNameLike(String name) {
        return productRepository.findAll(nameLike(name));
    }

    @Override
    public List<Product> findAllByNameAndPriceGreaterThanOrEqualTo(String name, double price) {
        return productRepository.findAll(nameLike(name).and(priceGreaterThanOrEqualTo(price)));
    }
}
