package com.shashwat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashwat.dao.CatalogDao;
import com.shashwat.entity.Product;

@Service
public class CatalogService {
	
	@Autowired
	CatalogDao catalogDao;
	
	public List<Product> listAllProducts(){
		return catalogDao.listAllProducts();
	}
	
	public Product getProductByCode(String productCode){
		return catalogDao.getProductByCode(productCode);
	}
}
