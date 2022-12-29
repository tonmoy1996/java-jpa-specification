package com.jpa.specification.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "distributor")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Distributor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne
    private Address address;

}

