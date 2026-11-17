package com.flm.delivery.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.flm.products.dto.response.OrderResponse;

@FeignClient(name = "ProductManagement")
public interface OrderClient {
	
	@GetMapping("orders/{orderId}")
	public OrderResponse getOrderById(@PathVariable long orderId);

}
