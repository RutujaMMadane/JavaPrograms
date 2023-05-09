package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
		java.sql.Statement st=con.createStatement();
		String sql="create table empnew(id int,ename varchar(677))";
		st.execute(sql);
		con.close();
		System.out.println("created successfully");
		

	}

}
