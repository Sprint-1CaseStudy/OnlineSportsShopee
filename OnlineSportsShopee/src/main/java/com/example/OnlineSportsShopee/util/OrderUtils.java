package com.example.OnlineSportsShopee.util;

import java.util.ArrayList;
import java.util.List;
import com.example.OnlineSportsShopee.Entities.OrderEntity;
import com.example.OnlineSportsShopee.Model.Order;


public class OrderUtils {
private OrderUtils() {
		
	}
	
	public static List<Order> convertToOrderDtoList(List<Order> list){
		List<Order> dtolist = new ArrayList<>();
		for(Order order : list) 
			dtolist.add(convertToOrderDto(order));
		return dtolist;
	}
	
	public static OrderEntity convertToOrder(Order dto) {
		Order order = new Order();
		tenant.setTenantId(dto.getTenantId());
		tenant.setTenantName(dto.getTenantName());
		tenant.setTenantAge(dto.getTenantAge());
		tenant.setTenantAddress(dto.getTenantAddress());
		return tenant;
	}		
	
	public static OrderEntity convertToOrderDto(Order order) {
		OrderEntity dto = new OrderEntity();
		dto.setOrderID(order.getOrderID());
		dto.setAmount(order.getAmount());
		dto.setBillingDate(order.getBillingDate());
		dto.setCustomer(order.getCustomer());
		dto.setPaymentMethod(order.getPaymentMethod());
		

		
		return dto;
	}
}
