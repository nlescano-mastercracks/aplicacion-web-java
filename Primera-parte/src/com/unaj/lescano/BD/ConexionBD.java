package com.unaj.lescano.BD;

import java.sql.*;

public class ConexionBD {

	public static Connection mysqlConexion() {
		Connection connection = null;
		try {
			String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
		}
		return connection;

	}
	
	
	public static void H2Conexionc() {
		
	}
	public static void HSQLDB() {
		
	}
}
