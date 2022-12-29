package com.jpa.specification;

import com.jpa.specification.models.Product;
import com.jpa.specification.repository.ProductRepository;
import com.jpa.specification.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpecificationApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductService productService;

	@Test
	void contextLoads() {

		List<Product> list= productService.findAllByNameAndPriceGreaterThanOrEqualTo("Iphone",2000.0);

		System.out.println(list);
	}

}
