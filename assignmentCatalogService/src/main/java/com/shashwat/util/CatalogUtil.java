package com.shashwat.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CatalogUtil {
	
	public static Connection connection;
	
	public static Connection getConnection() {
		return connection;
	}

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","Sa@aggarwal21");  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		
	}
}
