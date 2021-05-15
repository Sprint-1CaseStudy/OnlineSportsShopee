package com.example.onlinesportshopee.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinesportshopee.entities.CustomerEntity;

@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, String> {
	
}