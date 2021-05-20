package com.example.onlinesportshopee.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.ICartRepository;
import com.example.onlinesportshopee.entities.CartEntity;
import com.example.onlinesportshopee.exception.CartException;
import com.example.onlinesportshopee.model.Cart;
import com.example.onlinesportshopee.util.CartUtils;


@Service
public class CartServiceImpl implements ICartService {
	
	@Autowired 
	private ICartRepository iCartRepository; 
	
	@Override
	public Cart addCart(CartEntity cartEntity) throws CartException {
		CartEntity carEntity = null;
		if(cartEntity==null)
			carEntity=null;
		else {
			carEntity = iCartRepository.save(cartEntity);
		}
		return CartUtils.convertToOrder(carEntity);
	}

	@Override
	public Cart deleteCart(long id) throws CartException {
		CartEntity carEntity = iCartRepository.findById(id).orElse(null);
		if (carEntity == null)
			throw new CartException("CartNotFound");
		else
			iCartRepository.delete(carEntity);
		return CartUtils.convertToOrder(carEntity);
	}


	@Override
	public List<Cart> getallCartDetails() {
		List<CartEntity> carList = iCartRepository.findAll();
		return CartUtils.convertToOrderDtoList(carList);
	}

}
