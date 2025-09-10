package com.aditya.cartify.service;

import java.util.List;

import com.aditya.cartify.controller.ProductNotFound;
import com.aditya.cartify.exception.CartItemNotFound;
import com.aditya.cartify.models.Cart;
import com.aditya.cartify.models.CartDTO;
import com.aditya.cartify.models.CartItem;




public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
