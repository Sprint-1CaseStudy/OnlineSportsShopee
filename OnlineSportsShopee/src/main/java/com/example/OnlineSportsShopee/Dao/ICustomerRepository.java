package com.example.OnlineSportsShopee.Dao;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.example.OnlineSportsShopee.Entities.CustomerEntity;

@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, String> {
	
}
