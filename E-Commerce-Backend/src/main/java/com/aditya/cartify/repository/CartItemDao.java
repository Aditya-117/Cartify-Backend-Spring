package com.aditya.cartify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.cartify.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
