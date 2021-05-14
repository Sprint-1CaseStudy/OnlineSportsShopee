package com.example.OnlineSportsShopee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineSportsShopee.Model.Cart;

@CrossOrigin(origins="http://localhost:8085")
@RestController
@RequestMapping("/api/sports")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/add-cart")
	public ResponseEntity<Object> addFlat(@RequestBody Cart cart)  {
		
		CartDTO cartDTO = null;
		ResponseEntity<Object> cartResponse = null;
		cartDTO = cartService.addCart(cart);
		cartResponse = new ResponseEntity<>(cartDTO, HttpStatus.ACCEPTED);
		
		return cartResponse;
	}
	@DeleteMapping("/delete-cart")
	public ResponseEntity<Object> deleteCart(@RequestBody Cart cart){
		
		CartDTO cartDTO = null;
		ResponseEntity<Object> cartResponse = null;
		cartDTO = cartService.deleteCart();
		cartResponse = new ResponseEntity<>(cartDTO, HttpStatus.ACCEPTED);
		
		return cartResponse;
	}
	@GetMapping("/view-all-cart-items")
	public List<CartDTO> getAllCartItems() {
		
		return cartService.viewAllCartItems();
	}
	
	
}
