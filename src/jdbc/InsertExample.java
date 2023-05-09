package jdbc;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertExample {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
		//PreparedStatement statement=con.prepareStatement("insert into empnew values(?,?)");
		//PreparedStatement statement=con.prepareStatement("update empnew set ename=? where id=?");
		PreparedStatement statement=con.prepareStatement("delete from empnew where id=?");
		statement.setInt(1,12);
		//statement.setString(2, "Rutuja");
		statement.executeUpdate();
		con.close();
		System.out.println("insert successfully");
		
	}

}
