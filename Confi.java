package Com.confi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Com.Student.ss;

public class Confi {

	public static Connection conn() {

		System.out.println("Step-1");
		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("Step-2");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soma", "root", "root");

			System.out.println("connection sucess.....!");
			
		} catch (Exception e) {
			
			System.out.println("gadbad re baba");

		}

		return con;

	}

}
