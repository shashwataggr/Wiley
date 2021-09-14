package com.shashwat.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shashwat.entity.Product;
import com.shashwat.service.CatalogService;

@RestController
public class CatalogController {

	@Autowired
	CatalogService catalogService;
	
	@GetMapping(path = "/products")
	public List<Product> listAllProducts(){
		return catalogService.listAllProducts();
	}
	
	@GetMapping(path = "/products/code/{productCode}")
	public Product getProductByCode(@PathVariable String productCode){
		return catalogService.getProductByCode(productCode);
	}


}
