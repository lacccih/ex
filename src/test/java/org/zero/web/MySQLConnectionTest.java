package org.zero.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/book_ex?useSSL=false&serverTimezone=UTC";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		final String USER = "zerock";
		final String PW = "qwe123$%^";
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
