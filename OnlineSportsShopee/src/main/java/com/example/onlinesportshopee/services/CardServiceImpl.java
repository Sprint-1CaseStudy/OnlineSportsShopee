package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.ICardRepository;
import com.example.onlinesportshopee.entities.CardEntity;
import com.example.onlinesportshopee.model.Card;
import com.example.onlinesportshopee.util.CardUtils;

@Service
public class CardServiceImpl implements ICardService{

	@Autowired
	private ICardRepository cardRepository;
	
	@Override
	public Card addCard(CardEntity card) {
		CardEntity addCard = cardRepository.save(card);
		
		return CardUtils.convertToCard(addCard);
	}

	@Override
	public Card removeCard(long id) {
	CardEntity deleteCard = cardRepository.findById(id).get();
	cardRepository.delete(deleteCard);
	return CardUtils.convertToCard(deleteCard);
	}

	@Override
	public Card updateCard(long id, CardEntity card) {
		CardEntity updateCard = cardRepository.findById(id).get();
		updateCard = cardRepository.save(card);
		return CardUtils.convertToCard(updateCard);
	}

	@Override
	public Card getCardDetails(long id) {
		CardEntity getCardDetails = cardRepository.findById(id).get();
		return CardUtils.convertToCard(getCardDetails);
	}

	@Override
	public List<Card> getAllCards() {
		List<CardEntity> getAllCards = cardRepository.findAll();
		return CardUtils.convertToCardList(getAllCards);
	}
	
	
	
	

}
