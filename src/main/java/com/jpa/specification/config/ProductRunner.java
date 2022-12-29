package com.jpa.specification.config;

import com.jpa.specification.models.*;
import com.jpa.specification.repository.AddressRepository;
import com.jpa.specification.repository.DistributorRepository;
import com.jpa.specification.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private DistributorRepository distributorRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Address address=Address.builder().state(State.CHITTAGONG).city("Borishal").pincode("1212").build();
        Address address1=Address.builder().state(State.DHAKA).city("Khilgaon").pincode("1213").build();

        List<Address> addresses= new ArrayList<>();
        addresses.add(address);
        addresses.add(address1);
        addressRepository.saveAll(addresses);

        List<Distributor> distributors= List.of(
                Distributor.builder().name("ABC").address(address).build(),
                Distributor.builder().name("BCD").address(address1).build()
        );

        distributorRepository.saveAll(distributors);


        List<Product> lists = List.of(
                Product
                        .builder()
                        .name("Shampoo")
                        .price(500.0)
                        .manufacturingPlace(address)
                        .weight(120.0)
                        .category(Category.BEAUTY)
                        .distributor(distributors.get(0))
                        .build(),
                Product
                        .builder()
                        .name("Shirt")
                        .price(1500.0)
                        .manufacturingPlace(address1)
                        .weight(120.0)
                        .category(Category.MEN_FASHION)
                        .distributor(distributors.get(1))
                        .build(),
                Product
                        .builder()
                        .name("Iphone")
                        .price(3500.0)
                        .manufacturingPlace(address1)
                        .weight(120.0)
                        .category(Category.MOBILE)
                        .distributor(distributors.get(1))
                        .build(),
                Product
                        .builder()
                        .name("Black Shoe")
                        .price(200.0)
                        .manufacturingPlace(address)
                        .weight(120.0)
                        .category(Category.MEN_FASHION)
                        .distributor(distributors.get(1))
                        .build()
        );

        productRepository.saveAll(lists);


    }
}
