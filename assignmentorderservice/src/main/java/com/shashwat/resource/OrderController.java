package com.shashwat.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shashwat.entity.OrderDetails;
import com.shashwat.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping(path = "/orders")
	public void saveOder(@RequestBody OrderDetails order) {
		System.out.println("called order controller");
		System.out.println(order);
		orderService.saveOder(order);
	}
	@GetMapping(path = "/orders/{id}")
	public OrderDetails findOrderById(@PathVariable Long id) {
		return orderService.findOrderById(id);	
	}

}
