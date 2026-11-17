package com.arfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponseDTO {
	
	
	private int ItemId;
	
	private String itemName;
	
	private double price;
	
	private int stockQuantity;
	
	private double rating;
	
	private double discount;

	

}
