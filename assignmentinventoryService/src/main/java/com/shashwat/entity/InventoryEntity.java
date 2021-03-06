package com.shashwat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryEntity {
	@Id
	private Long id;
    private String productCode;
    private Integer availableQuantity ;
}
