package com.arfoods.controller;

import com.arfoods.dao.ItemRepository;
import com.arfoods.service.impl.ItemServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arfoods.dto.AddItemRequestDTO;
import com.arfoods.dto.ItemResponseDTO;
import com.arfoods.dto.UpdateItemRequestDTO;
import com.arfoods.dto.UpdateRatingDTO;
import com.arfoods.model.Item;
import com.arfoods.service.ItemService;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/items")
public class ItemController {

	private final ItemServiceImpl itemServiceImpl;
	@Autowired 		
	ItemService itemService;

	
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	
	ItemController(ItemServiceImpl itemServiceImpl) {
		this.itemServiceImpl = itemServiceImpl;
	}

	
	@PostMapping("/add")
	public ItemResponseDTO addItem(@RequestBody AddItemRequestDTO  addItemRequestDTO)
	{
		
		
		logger.debug("Received ItemRequestDTO,{}",addItemRequestDTO);		
		logger.trace("request received for add item in item Controller");
			
		logger.trace("sending resonse for add item in item Controller");
		return  itemService.addItem(addItemRequestDTO);
		
	}

	
	@GetMapping("/allItems")
	public List<ItemResponseDTO> getAllItems()
	{
		return	itemService.getAllItems();
	}

	
	@GetMapping("/{id}")
	@Cacheable("items")
	public ItemResponseDTO getItem(@PathVariable int  id)
	{
		return itemService.getItemById(id);
	}
	
	@GetMapping("/byDiscount")
	public List<ItemResponseDTO> getItemsByDiscountGreaterThan(@RequestParam(name= "discount",required = false)  int discount)
	{
		
		return itemService.getDiscountByItems(discount);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable int id)
	{ 
		return itemService.deleteItem(id);
	} 
	
	@CacheEvict(value="items" , key="#id")
	@PutMapping("/update/{id}")
	@CachePut(value="items", key="#id")
	public ItemResponseDTO updateItem(@PathVariable int id,@RequestBody UpdateItemRequestDTO updateItemRequestDTO)
	{
		return itemService.updateItem(id, updateItemRequestDTO);
	}
	
	
	@PutMapping("/rating")
	public ItemResponseDTO 	updateRating(@RequestBody UpdateRatingDTO updateRatingDTO)
	{
		return itemService.updateRating(updateRatingDTO);
	}
	
	
}
