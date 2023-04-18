package Com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import Com.Student.ss;
import Com.confi.Confi;

public class Dao {

	Confi co = new Confi();

	public ArrayList<ss> alldata() throws SQLException {
		Connection con = co.conn();
		Statement stmt = con.createStatement();
		String sql = "select * from ss";
		ResultSet rs = stmt.executeQuery(sql);
		
		ArrayList<ss> al = new ArrayList<ss>();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			
			System.out.println(id+" "+ name);
			ss s = new ss(id, name);
			al.add(s);
			
		}
  return al;
	}

	public ArrayList<ss> daodata(int id , String name) throws SQLException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Connection con = co.conn();
		PreparedStatement ps =con.prepareStatement("insert into ss values (?,?)");
	
		
		ArrayList<ss> al = new ArrayList<ss>();
	
		
			ss s = new ss(id, name);
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.executeUpdate();
			System.out.println("data inserted.....");
			al.add(s);
			System.out.println(al);
			
		
		return al;
			
		}

	public ArrayList<ss> daodatadelet(int id, String name) throws SQLException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Connection con = co.conn();
		PreparedStatement ps =con.prepareStatement(" delete from ss where id =?");
	
		
		ArrayList<ss> al = new ArrayList<ss>();
	
		
			ss s = new ss(id, name);
			ps.setInt(1,id);
//			ps.setString(2,name);
			ps.executeUpdate();
			System.out.println("data deleted.....");
			al.add(s);
			System.out.println(al);
			
		
		return al;
			
		
	}
	
	
	public ArrayList<ss> dataupdate(int id, String name) throws SQLException {
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Connection con = co.conn();
		
		PreparedStatement ps =con.prepareStatement(" update ss set name = ? where id =?");
	
		
		ArrayList<ss> al = new ArrayList<ss>();		
		
		   
			
			ps.setString(1,name);
			
			ps.setInt(2,id);
			
			int i =ps.executeUpdate();
			
			System.out.println(i+" " + "data updated....");
		
		
		
			
			
		
		return al;
			
		
	}
	
	
		
	}



