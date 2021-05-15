package com.example.onlinesportshopee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IOrderRepository;
import com.example.onlinesportshopee.entities.OrderEntity;
import com.example.onlinesportshopee.model.Order;
import com.example.onlinesportshopee.util.OrderUtils;

@Service
public class OrderServiceImpl {

	@Autowired 
	private IOrderRepository ordrepo; 
	
	@Override
	public Order addOrder(OrderEntity orderEntity) {
		OrderEntity ordEntity;
		if(orderEntity==null)
			ordEntity=null;
		else {
			ordEntity=ordrepo.save(orderEntity);
			
		}
		return OrderUtils.(ordEntity);
	}
}
