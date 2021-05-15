package com.example.OnlineSportsShopee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineSportsShopee.Entities.OrderEntity;

 

@Repository
public interface IOrderRepository extends JpaRepository<OrderEntity,Long>{

}