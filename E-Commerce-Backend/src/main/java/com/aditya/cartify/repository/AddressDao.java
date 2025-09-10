package com.aditya.cartify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aditya.cartify.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}
