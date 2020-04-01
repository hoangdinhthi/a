/**
 * Copyright(C) 2018 MTA
 * JDBCConnection.java Mar 31, 2020  HoangDinhThi
 */
package com.learnbasicstrust.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author HoangDinhThi
 *	
 */
public class JDBCConnection {
	public static Connection getJDBCConnection() {
		final String url = "jdbc:mysql://localhost:3306/2_hoangdinhthi_pro_manageuser";
		final String user = "root";
		final String pass = "root";
		final String driver ="com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url,user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
