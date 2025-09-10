package com.aditya.cartify.service;

import com.aditya.cartify.models.CustomerDTO;
import com.aditya.cartify.models.SellerDTO;
import com.aditya.cartify.models.SessionDTO;
import com.aditya.cartify.models.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}
