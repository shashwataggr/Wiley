package com.shashwat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashwat.dao.InventoryDao;
import com.shashwat.entity.InventoryEntity;

@Service
public class InventoryService {
	
	@Autowired
	InventoryDao dao;
	
	public InventoryEntity getInventoryItemByProductCode (String productCode) {
		return dao.getInventoryItemByProductCode(productCode);
	}

	public void updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity) {
		dao.updateInventoryItemQuantityByProductCode(productCode, availableQuantity);
	}

}
