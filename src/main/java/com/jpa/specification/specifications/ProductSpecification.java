package com.jpa.specification.specifications;


import com.jpa.specification.models.Product;
import com.jpa.specification.models.Product_;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {

    public static Specification<Product> nameLike(String name){
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(Product_.name),"%"+name+"%"));
    }

    public static Specification<Product> priceGreaterThanOrEqualTo(double price){
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get(Product_.price),price);
    }
}
