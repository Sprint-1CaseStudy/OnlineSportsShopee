package com.example.onlinesportshopee.services;

import com.example.onlinesportshopee.entities.OrderEntity;
import com.example.onlinesportshopee.model.Order;
import java.util.List;

public interface IOrderService {
public Order addOrder(OrderEntity orderEntity);
public Order updateOrder(long id,OrderEntity orderEntity);
public Order deleteOrder(long id);
public Order getOrderDetails(long id);
public List<Order> getAllOrders();

}
