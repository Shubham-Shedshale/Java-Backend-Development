package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetRecordBySession {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
		   Connection con=null;
		   Statement stmt=null;
		   ResultSet rs = null;
		  try
		  {
		   con = DriverManager.getConnection(url);
		   stmt=con.createStatement(); 
			rs = stmt.executeQuery("select * from student");
		 
			while(rs.next())
			   {
				   int id=rs.getInt("ID");
				   String name=rs.getNString("NAME");
				   int age=rs.getInt("AGE");
				   String course=rs.getNString("COURSE");
				   
				   System.err.println(id+" "+name+" "+age+" "+course);
				   
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
