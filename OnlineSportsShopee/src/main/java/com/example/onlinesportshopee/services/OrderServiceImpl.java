package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IOrderRepository;
import com.example.onlinesportshopee.entities.OrderEntity;
import com.example.onlinesportshopee.exception.InvalidOrderIdException;
import com.example.onlinesportshopee.exception.OrderNotFoundException;
import com.example.onlinesportshopee.model.Order;
import com.example.onlinesportshopee.util.OrderUtils;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired 
	private IOrderRepository ordrepo; 
	
	@Override
	public Order addOrder(OrderEntity orderEntity) throws OrderNotFoundException,InvalidOrderIdException{
		OrderEntity ordEntity;
		if(orderEntity==null)
			ordEntity=null;
		else {
			ordEntity=ordrepo.save(orderEntity);
			
		}
		return OrderUtils.convertToOrder(ordEntity);
	}
	@Override
	public Order updateOrder(long id,OrderEntity orderEntity)throws OrderNotFoundException,InvalidOrderIdException{
		OrderEntity ordEntity;
		OrderEntity existOrd= ordrepo.findById(id).orElse(null);
		if (existOrd == null)
			throw new InvalidOrderIdException("orderIdNotAvailable");
		else {
			
			ordEntity = ordrepo.save(orderEntity);
		}
		
		return OrderUtils.convertToOrder(ordEntity);
	}
	@Override
	public Order deleteOrder(long id) throws InvalidOrderIdException{
		OrderEntity ordEntity = ordrepo.findById(id).orElse(null);
		if (ordEntity == null)
			throw new InvalidOrderIdException("orderNotFound");
		else
			ordrepo.delete(ordEntity);
		return OrderUtils.convertToOrder(ordEntity);
	}
	@Override
	public Order getOrderDetails(long id)throws InvalidOrderIdException {
		OrderEntity ordEntity = ordrepo.findById(id).orElse(null);
		if (ordEntity == null)
			throw new InvalidOrderIdException("orderNotFound");
		
		return OrderUtils.convertToOrder(ordEntity);
	}
	@Override
	public List<Order> getAllOrders(){
		List<OrderEntity> orderList = ordrepo.findAll();
		return OrderUtils.convertToOrderDtoList(orderList);
	}
	

}
