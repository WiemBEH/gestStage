package com.application.DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionMysql {
	private static Connection connexion = null;
	private ConnexionMysql() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (connexion == null) {
				connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/geststage","root","");
			}

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		/*finally {
			if(connexion !=null)
				try {
					connexion.close();
				} catch (SQLException e) {
				}
		}*/
	}

	public static Connection getConnection() {
		new ConnexionMysql();
		return connexion;
	}


}
