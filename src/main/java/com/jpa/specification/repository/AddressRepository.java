package com.jpa.specification.repository;

import com.jpa.specification.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address,Long> {
}
