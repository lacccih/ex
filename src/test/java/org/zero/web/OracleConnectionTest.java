package org.zero.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {

	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@mydb.cquswsks2m4w.ap-northeast-2.rds.amazonaws.com:1521:ORCL";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		final String USER = "admin";
		final String PW = "vkdlsdovmf";
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
