package com.shashwat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashwat.dao.OrderDao;
import com.shashwat.entity.OrderDetails;
@Service
public class OrderService {
	
	@Autowired
	OrderDao dao;
	
	public void saveOder(OrderDetails order) {
		System.out.println("Order service");
		dao.saveOder(order);
	}
	public OrderDetails findOrderById (Long id) {
		return dao.findOrderById(id);
	}
}
