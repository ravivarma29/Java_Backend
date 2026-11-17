package com.flm.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.delivery.builder.DeliveryBuilder;
import com.flm.delivery.client.OrderClient;
import com.flm.delivery.dao.DeliveryRepository;
import com.flm.delivery.dto.request.DeliveryCreateRequest;
import com.flm.delivery.dto.response.DeliveryResponse;
import com.flm.delivery.model.Delivery;
import com.flm.products.dto.response.OrderResponse;


@Service
public class DeliveryService {
	
	@Autowired
	DeliveryRepository deliveryRepository;
	
	@Autowired
	OrderClient orderClient;
	
	public DeliveryResponse assign(DeliveryCreateRequest deliveryCreateRequest) {
		
		Delivery delivery = DeliveryBuilder.buildDeliveryFromDeliveryDto(deliveryCreateRequest);
		
		deliveryRepository.save(delivery);
		
		DeliveryResponse deliveryResponse = DeliveryBuilder.buildDeliveryDtoFromDelivery(delivery);
		
		return deliveryResponse;
		
	}

	public DeliveryResponse findById(long id) {
		 Delivery delivery = deliveryRepository.findById(id).get();
		 
		 DeliveryResponse deliveryDtoFromDelivery = DeliveryBuilder.buildDeliveryDtoFromDelivery(delivery);
		OrderResponse orderResponse = orderClient.getOrderById(deliveryDtoFromDelivery.getOrderId());
		deliveryDtoFromDelivery.setOrderPrice(orderResponse.getTotalPrice());
		 return deliveryDtoFromDelivery;
		//return DeliveryBuilder.buildDeliveryDtoFromDelivery(delivery);
	} 	
	
	
//	public DeliveryResponse getDeliveryById(long productId) {
//
//		Product product = productRepository
//			.findById(productId)
//			.orElseThrow(() -> new RuntimeException("Product not found with id : " + productId));
//
//		return ProductBuilder.buildProductResponseFromProduct(product);
//
//	}
//

}
