package com.shashwat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shashwat.entity.Product;
import com.shashwat.util.CatalogUtil;

@Repository
public class CatalogDao {
	
	Connection connection = CatalogUtil.getConnection();
	
	public List<Product> listAllProducts(){
		String query = "select * from products";
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				products.add(new Product(resultSet.getLong(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getDouble(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products; 
	}
	
	public Product getProductByCode(String productCode){
		String query = "select * from products where code =?";
		System.out.println("Uqery = "+query);
		Product product = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, productCode);
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				product = new Product(resultSet.getLong(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getDouble(5));
			}
		}
		catch (Exception e) {
		}
		return product;
	}
}
