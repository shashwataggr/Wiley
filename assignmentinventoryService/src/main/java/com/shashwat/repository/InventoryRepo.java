package com.shashwat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashwat.entity.InventoryEntity;

@Repository
public interface InventoryRepo extends JpaRepository<InventoryEntity, Long> {

	InventoryEntity getByProductCode(String productCode);

}
