package com.arfoods.service;

import java.util.List;

import com.arfoods.dto.AddItemRequestDTO;
import com.arfoods.dto.ItemResponseDTO;
import com.arfoods.dto.UpdateItemRequestDTO;
import com.arfoods.dto.UpdateRatingDTO;


public interface ItemService {
	
	public ItemResponseDTO addItem(AddItemRequestDTO addItemRequestDTO);
	
	public List<ItemResponseDTO> getAllItems();

	public ItemResponseDTO getItemById(int id);
	
	public List<ItemResponseDTO> getDiscountByItems(double discount);
	
	public String  deleteItem(int id);
	
	public ItemResponseDTO updateItem(int id,UpdateItemRequestDTO updateItemRequestDTO);
	
	public ItemResponseDTO updateRating(UpdateRatingDTO updateRatingDTO );
}
