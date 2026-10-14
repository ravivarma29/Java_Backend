package com.arfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfoods.dto.OrderResponseDTO;
import com.arfoods.dto.PlaceOrderRequestDTO;
import com.arfoods.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping
	public OrderResponseDTO placOrder(@RequestBody PlaceOrderRequestDTO orderRequestDTO)

	{

		return orderService.placeOrder(orderRequestDTO);
	}

}
