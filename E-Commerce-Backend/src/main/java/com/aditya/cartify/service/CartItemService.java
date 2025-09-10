package com.aditya.cartify.service;

import com.aditya.cartify.models.CartDTO;
import com.aditya.cartify.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
