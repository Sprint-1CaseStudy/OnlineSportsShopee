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

import com.example.onlinesportshopee.entities.CardEntity;

import com.example.onlinesportshopee.exception.CardNotFoundException;

import com.example.onlinesportshopee.model.Card;

import com.example.onlinesportshopee.services.CardServiceImpl;

@RestController
@RequestMapping("/cards")
public class CardController {
	
	@Autowired
	private CardServiceImpl cardServiceImpl;
	
	@PostMapping("/add-card")
	public ResponseEntity<Object> addCard(@RequestBody CardEntity card) throws CardNotFoundException
	{
		Card cardDto = null;
		ResponseEntity<Object> cardResponse = null;
		cardDto = cardServiceImpl.addCard(card);
		cardResponse = new ResponseEntity<>(cardDto, HttpStatus.ACCEPTED);
		return cardResponse;
	}

	@DeleteMapping("/remove-card/card/{id}")
	public ResponseEntity<Object> removeCard(@PathVariable long id) throws CardNotFoundException
	{
		Card cardDto = null;
		ResponseEntity<Object> cardResponse = null;
		cardDto = cardServiceImpl.removeCard(id);
		cardResponse = new ResponseEntity<>(cardDto, HttpStatus.ACCEPTED);
		return cardResponse;
	 
	}
	
	@PutMapping("/update-card/{id}")
	public ResponseEntity<Object> updateCard(@PathVariable long id, @RequestBody CardEntity card)
	{
		Card cardDto = null;
		ResponseEntity<Object> cardResponse = null;
		cardDto = cardServiceImpl.updateCard(id, card);
		cardResponse = new ResponseEntity<>(cardDto, HttpStatus.ACCEPTED);
		return cardResponse;
		
	}
	@GetMapping("/get-card-details/{id}")
	public ResponseEntity<Object> getCardDetails(@PathVariable long id)
	{
		Card cardDto = null;
		ResponseEntity<Object> cardResponse = null;
		cardDto = cardServiceImpl.getCardDetails(id);
		cardResponse = new ResponseEntity<>(cardDto, HttpStatus.ACCEPTED);
		return cardResponse;
	}
	
	@GetMapping("/get-all-cards")
	public List<Card> getAllCards()
	{
		return cardServiceImpl.getAllCards();
	}
	
}