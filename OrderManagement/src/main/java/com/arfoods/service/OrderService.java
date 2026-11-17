package com.arfoods.service;

import java.util.List;

import com.arfoods.dto.AddItemRequestDTO;
import com.arfoods.dto.ItemResponseDTO;
import com.arfoods.dto.OrderResponseDTO;
import com.arfoods.dto.PlaceOrderRequestDTO;
import com.arfoods.dto.UpdateItemRequestDTO;

public interface OrderService {
	
	public OrderResponseDTO placeOrder(PlaceOrderRequestDTO orderRequestDTO);
	
}
