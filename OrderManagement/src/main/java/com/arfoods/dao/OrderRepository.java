package com.arfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arfoods.model.Item;
import com.arfoods.model.Order;


@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer>{
	
	

}
 	