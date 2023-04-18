package Com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Com.Dao.Dao;
import Com.Student.ss;

public class Service {
	
	public ArrayList<ss> logic() throws SQLException {
		Dao dd = new Dao();
		ArrayList<ss>al =dd.alldata();
		return al;
	}

	public ArrayList<ss> datainsert(int id , String name) throws SQLException {
		Dao dd = new Dao();
		ArrayList<ss> ab=	dd.daodata(id, name);
		return ab;
	}

	public ArrayList<ss> datadelet(int id, String name) throws SQLException {
		Dao dd = new Dao();
		ArrayList<ss> ab=	dd.daodatadelet(id, name);
		return ab;
	}
	

	public ArrayList<ss> updatelogic(int id, String name) throws SQLException {
		Dao dd = new Dao();
		ArrayList<ss> ab=	dd.dataupdate(id, name);
		return ab;
	}
	
	

}
