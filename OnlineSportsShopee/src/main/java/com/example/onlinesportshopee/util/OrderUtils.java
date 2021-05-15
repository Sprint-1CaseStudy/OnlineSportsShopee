package com.example.onlinesportshopee.util;

import java.util.ArrayList;
import java.util.List;

import com.example.onlinesportshopee.entities.OrderEntity;
import com.example.onlinesportshopee.model.Order;

 public class OrderUtils {
private OrderUtils() {
        
    }
    
    public static List<Order> convertToOrderDtoList(List<Order> list){
        List<Order> dtolist = new ArrayList<>();
        for(Order order : list) 
            dtolist.add(convertToOrder(order));
        return dtolist;
    }
    
    public static OrderEntity convertToOrderEntity(Order dto) {
        OrderEntity order = new OrderEntity();
        order.setOrderID(dto.getOrderID());
        order.setAmount(dto.getAmount());
        order.setBillingDate(dto.getBillingDate());
        order.setCustomer(dto.getCustomer());
        order.setPaymentMethod(dto.getPaymentMethod());
        return order;
    }        
    
    public static Order convertToOrder(Order order) {
        Order dto = new Order();
        dto.setOrderID(order.getOrderID());
        dto.setAmount(order.getAmount());
        dto.setBillingDate(order.getBillingDate());
        dto.setCustomer(order.getCustomer());
        dto.setPaymentMethod(order.getPaymentMethod());
        

 

        
        return dto;
    }
}
