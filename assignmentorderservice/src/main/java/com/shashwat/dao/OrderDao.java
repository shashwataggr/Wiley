package com.shashwat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shashwat.entity.OrderDetails;
import com.shashwat.repo.OrderRepo;

@Repository
public class OrderDao {
	
	@Autowired
	OrderRepo orderRepo;
	
	public void saveOder(OrderDetails order) {
		System.out.println("Daooo");
		orderRepo.save(order);
	}
	public OrderDetails findOrderById(Long id) {
		return orderRepo.getById(id);
	}

}
