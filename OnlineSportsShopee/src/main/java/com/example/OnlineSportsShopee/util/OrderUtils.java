package com.example.OnlineSportsShopee.util;

import antlr.collections.List;

public class OrderUtils {
private OrderUtils() {
		
	}
	
	public static List<OrderDTO> convertToTenantDtoList(List<Tenant> list){
		List<TenantDTO> dtolist = new ArrayList<>();
		for(Tenant tenant : list) 
			dtolist.add(convertToTenantDto(tenant));
		return dtolist;
	}
	
	public static Order convertToOrder(OrderDTO dto) {
		Tenant tenant = new Tenant();
		tenant.setTenantId(dto.getTenantId());
		tenant.setTenantName(dto.getTenantName());
		tenant.setTenantAge(dto.getTenantAge());
		tenant.setTenantAddress(dto.getTenantAddress());
		return tenant;
	}		
	
	public static OrderDTO convertToTenantDto(Order order) {
		TenantDTO dto = new TenantDTO();
		dto.setTenantId(tenant.getTenantId());
		dto.setTenantName(tenant.getTenantName());
		dto.setTenantAge(tenant.getTenantAge());
		dto.setTenantAddress(tenant.getTenantAddress());
		return dto;
	}
}
