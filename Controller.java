package Com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import Com.Service.Service;
import Com.Student.ss;

public class Controller {

	ArrayList<ss> data() throws SQLException {
		Service ss = new Service();
		ArrayList<ss> al = ss.logic();
		return al;
	}

	ArrayList<ss> setdata(int id, String name) throws SQLException {
		Service ss = new Service();
		ArrayList<ss> se = ss.datainsert(id, name);
		return se;
	}

	ArrayList<ss> delet(int id, String name) throws SQLException {
		Service ss = new Service();
		ArrayList<ss> se = ss.datadelet(id, name);
		return se;
	}

	ArrayList<ss> controldelet(int id, String name) throws SQLException {
		Service ss = new Service();
		ArrayList<ss> se = ss.updatelogic(id, name);
		return se;
	}

	public static void main(String[] args) throws SQLException {
		Controller co = new Controller();
		 co.data();
		// co.setdata(105, "Nitian");
		// co.delet(102, "Nitian");
		//co.controldelet(1, "soma");
	}
}
