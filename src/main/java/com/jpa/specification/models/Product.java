package com.jpa.specification.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double price;

    @ManyToOne
    private Address manufacturingPlace;

    private Double weight;

    @ManyToOne
    private Distributor distributor;

    @Enumerated(EnumType.STRING)
    private Category category;
}
