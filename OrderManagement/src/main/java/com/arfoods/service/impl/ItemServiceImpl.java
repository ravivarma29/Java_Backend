package com.arfoods.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arfoods.controller.ItemController;
import com.arfoods.dao.ItemRepository;
import com.arfoods.dto.AddItemRequestDTO;
import com.arfoods.dto.ItemResponseDTO;
import com.arfoods.dto.UpdateItemRequestDTO;
import com.arfoods.dto.UpdateRatingDTO;
import com.arfoods.exceptions.ItemNotFoundException;
import com.arfoods.model.Item;
import com.arfoods.service.ItemService;

import lombok.extern.java.Log;

@Service
public class ItemServiceImpl implements ItemService{

	
	@Autowired
	ItemRepository itemRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
	
	@Override
	public ItemResponseDTO addItem(AddItemRequestDTO addItemRequestDTO) {
		logger.trace("Entered into add Item method in ItemService");
		Item item = new Item();
		
	
		logger.trace("Strted copying in ItemService");
		item.setItemName(addItemRequestDTO.getItemName());
		item.setPrice(addItemRequestDTO.getPrice());
		item.setStockQuantity(addItemRequestDTO.getStockQuantity());
		item.setDiscount(addItemRequestDTO.getDiscount());
		item.setRating(0);
		
		logger.debug("Built Item object from item request dto, Item - {}",item);
	
		logger.trace("Saving item Repository");
		Item savedItem = itemRepository.save(item);
		
		logger.info("saved Item : {}", savedItem);
		
	ItemResponseDTO response = new ItemResponseDTO();
		BeanUtils.copyProperties(savedItem, response);
		
		return response ;
	}
	

	@Override
	public List<ItemResponseDTO> getAllItems() {

		List<Item> allItems = itemRepository.findAll();
		
				List<ItemResponseDTO> list	=	allItems.stream().map(item -> {
														ItemResponseDTO dto = new ItemResponseDTO();
														BeanUtils.copyProperties(item, dto);
														return dto;
													}).toList();
				return list;	
	}


	@Override
	public ItemResponseDTO getItemById(int id) {
		
		Item item = itemRepository.findById(id).
				orElseThrow(() -> new ItemNotFoundException("Item Not Found with Id : "+id));
				
		ItemResponseDTO dto= new ItemResponseDTO();
		BeanUtils.copyProperties(item, dto); 
		
		return dto;
	}


	@Override
	public List<ItemResponseDTO> getDiscountByItems(double discount) {
		
		List<Item> itemsList = itemRepository.findAll();
		
		List<ItemResponseDTO> dtoList = itemsList
		.stream()
		.filter(item->item.getDiscount() > discount)
		.map(item->
		{
			ItemResponseDTO dto= new ItemResponseDTO();
			BeanUtils.copyProperties(item, dto);
			
			return dto;
		}).toList();
		
		return dtoList;
	}


	@Override
	public String deleteItem(int id) {
		itemRepository.deleteById(id);
		return "deleted item with Id:" +id;
	}


	@Override
	public ItemResponseDTO updateItem(int id, UpdateItemRequestDTO updateItemRequestDTO) {
		Item item = itemRepository.findById(id).get();
		
		BeanUtils.copyProperties(updateItemRequestDTO, item);
		Item savedItem = itemRepository.save(item);
		
		ItemResponseDTO itemResponseDTO = new ItemResponseDTO();
		BeanUtils.copyProperties(savedItem, itemResponseDTO);

		
		return itemResponseDTO;
	}


	@Override
	public ItemResponseDTO updateRating(UpdateRatingDTO updateRatingDTO) {
		int itemId= itemRepository.updateRating(updateRatingDTO.getItemId(),updateRatingDTO.getRating());
		Item item = itemRepository.findById(itemId).get();
		ItemResponseDTO itemResponseDTO = new ItemResponseDTO();
		BeanUtils.copyProperties(item, itemResponseDTO);
		
		return itemResponseDTO;
	}
	
	
	
	}
