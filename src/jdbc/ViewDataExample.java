package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewDataExample {

	public static void main(String[] args)   throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
		//PreparedStatement statement=con.prepareStatement("insert into empnew values(?,?)");
		//PreparedStatement statement=con.prepareStatement("update empnew set ename=? where id=?");
		PreparedStatement statement=con.prepareStatement("select * from empnew");
		ResultSet rs=statement.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
		}
	    
		con.close();
		System.out.println("insert successfully");
		
	}

}
