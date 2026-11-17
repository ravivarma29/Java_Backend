package com.arfoods.service.impl;

import com.arfoods.dao.OrderRepository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arfoods.dao.ItemRepository;
import com.arfoods.dto.AddItemRequestDTO;
import com.arfoods.dto.ItemResponseDTO;
import com.arfoods.dto.OrderItemRequestDTO;
import com.arfoods.dto.OrderItemResponseDTO;
import com.arfoods.dto.OrderResponseDTO;
import com.arfoods.dto.PlaceOrderRequestDTO;
import com.arfoods.dto.UpdateItemRequestDTO;
import com.arfoods.model.Item;
import com.arfoods.model.Order;
import com.arfoods.model.OrderItem;
import com.arfoods.service.ItemService;
import com.arfoods.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	ItemRepository itemRepository;

	@Autowired
	OrderRepository orderRepository;
	
	
	@Override
	public OrderResponseDTO placeOrder(PlaceOrderRequestDTO orderRequestDTO) {
		
		
		
		List<OrderItemRequestDTO> orderItemRequestList = orderRequestDTO.getOrderItemRequestList();
		
		Order order = new Order();
		List<OrderItem> orderItemsList = new ArrayList<OrderItem>();
		
		double finalOrderPrice = 0;
		
		for(OrderItemRequestDTO orderItemDTO : orderItemRequestList)
		{
			Item item = itemRepository.findById(orderItemDTO.getItemId()).get();
			
			OrderItem orderItem = new OrderItem();
			
			orderItem.setItem(item);
			orderItem.setQuantity(orderItemDTO.getQuantity());
			double itemprice = item.getPrice() *  orderItemDTO.getQuantity();
			
			finalOrderPrice += itemprice;
			
			orderItem.setPrice(itemprice);
			orderItem.setOrder(order);
			
			orderItemsList.add(orderItem);
		}
		
		order.setOrderitems(orderItemsList);
		order.setPrice(finalOrderPrice);
		
		Order savedOrder = orderRepository.save(order);
		
		OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
		
		List<OrderItemResponseDTO> orderItemResponseDTOs = new ArrayList<OrderItemResponseDTO>();
		
		List<OrderItem> orderItems = savedOrder.getOrderitems();
		
		for(OrderItem orderItem : orderItems)
		{
			
			OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();
			
			orderItemResponseDTO.setItemName(orderItem.getItem().getItemName());
			orderItemResponseDTO.setPrice(orderItem.getItem().getPrice());
			orderItemResponseDTO.setQuantity(orderItem.getQuantity());
			orderItemResponseDTO.setSubTotal(orderItem.getPrice());
			
			orderItemResponseDTOs.add(orderItemResponseDTO);	
			 
		}
		
		orderResponseDTO.setOrderId(order.getOrderId());
		orderResponseDTO.setOrderItemsResponse(orderItemResponseDTOs);
		orderResponseDTO.setTotalPrice(order.getPrice());
		
		return orderResponseDTO;
	}

	

	
	
	}
  