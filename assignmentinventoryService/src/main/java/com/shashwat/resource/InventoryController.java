package com.shashwat.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shashwat.entity.InventoryEntity;
import com.shashwat.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping(path = "/code/{productCode}")
	public InventoryEntity getInventoryItemByProductCode(@PathVariable String productCode) {
		return inventoryService.getInventoryItemByProductCode(productCode);
	}

	@PutMapping(path = "/code/{productCode}/{availableQuantity}")
	public void updateInventoryItemQuantityByProductCode(@PathVariable String productCode, @PathVariable int availableQuantity) {
		inventoryService.updateInventoryItemQuantityByProductCode(productCode, availableQuantity);
	}

}
