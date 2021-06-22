package memoo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {

	public static Connection getConnection() {
		Connection con=null;	
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  
		      String url = "jdbc:mysql://localhost:3306/memo";
		      String user = "younginwebstore";
		      String password = "132353";
		      con = DriverManager.getConnection(url, user, password);
		     
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return con;
}
public static void main(String args[]){
	getConnection();
}
}
