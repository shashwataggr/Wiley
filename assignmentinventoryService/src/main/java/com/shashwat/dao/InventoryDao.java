package com.shashwat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shashwat.entity.InventoryEntity;
import com.shashwat.repository.InventoryRepo;

@Repository
public class InventoryDao {
	
	@Autowired
	InventoryRepo inventoryRepo;
	
	public InventoryEntity getInventoryItemByProductCode(String productCode) 
	{
		return inventoryRepo.getByProductCode(productCode);
	}
	
	public void updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity) {
		InventoryEntity entity = getInventoryItemByProductCode(productCode);
		entity.setAvailableQuantity(availableQuantity);
		inventoryRepo.save(entity);
	}

}
