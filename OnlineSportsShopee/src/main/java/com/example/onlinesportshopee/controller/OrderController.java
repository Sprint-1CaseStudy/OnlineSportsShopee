package com.example.onlinesportshopee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinesportshopee.Exception.InvalidOrderIdException;
import com.example.onlinesportshopee.Exception.OrderNotFoundException;
import com.example.onlinesportshopee.entities.OrderEntity;
import com.example.onlinesportshopee.model.Order;
import com.example.onlinesportshopee.services.IOrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@PostMapping("/add-order")
	public  ResponseEntity<Object> addProduct(@RequestBody OrderEntity orderEntity)throws OrderNotFoundException,InvalidOrderIdException{
		System.out.println(orderEntity);
		Order orderDTO = null;
		ResponseEntity<Object> orderResponse = null;
		orderDTO = orderService.addOrder(orderEntity);
		orderResponse = new ResponseEntity<>(orderDTO, HttpStatus.ACCEPTED);
		return orderResponse;
	}
	@PutMapping("/update-order/{orderID}")
	public ResponseEntity<Object> updateOrder(@PathVariable long orderID, @RequestBody OrderEntity orderEntity)throws OrderNotFoundException,InvalidOrderIdException{
		
		Order orderDTO = null;
		ResponseEntity<Object> orderResponse = null;
		orderDTO = orderService.updateOrder(orderID,orderEntity);
		orderResponse = new ResponseEntity<>(orderDTO, HttpStatus.ACCEPTED);
		
		return orderResponse;
	}
	@DeleteMapping("/remove-order/{orderID}")
	public ResponseEntity<Object> deleteOrder(@PathVariable long orderID)throws InvalidOrderIdException{
		
		Order orderDTO = orderService.deleteOrder(orderID);
		return new ResponseEntity<>(orderDTO, HttpStatus.ACCEPTED);

	}
	@GetMapping("/get-order/{orderID}")
	public ResponseEntity<Object> getOrder(@PathVariable long orderID)throws InvalidOrderIdException{
	
		Order orderDTO = null;
		orderDTO = orderService.getOrderDetails(orderID);
		
		return new ResponseEntity<>(orderDTO, HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/get-all-order/")
	public List<Order> getAllOrder(){
	
		return orderService.getAllOrders();

	}
	
}
	
	
