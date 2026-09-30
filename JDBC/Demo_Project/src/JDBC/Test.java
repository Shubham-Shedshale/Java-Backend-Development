package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test 
{
   public static void main(String[] args)
   {
	   String url="jdbc:mysql://localhost:3306?user=root&password=YOUR_PASSWORD";
	   Connection con=null;
	  // Statement stmt=null;
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con=DriverManager.getConnection(url);
		   //stmt=con.createStatement();
		   //int li1=stmt.executeUpdate("insert into btm.student values(1,'Ram',20,'Java full stack')");
		   //int li2=stmt.executeUpdate("insert into btm.student values(2,'Sham',21,'Python full stack')");
		  // int li2=stmt.executeUpdate("insert into btm.student values(3,'Raj',22,'MERN stack')");
		   //int li2=stmt.executeUpdate("update btm.student set name='Sam' where id=2");
		   //System.out.println(li2);
		   //int li2=stmt.executeUpdate("delete from btm.student where id=3");
		   //int li2=stmt.executeUpdate("insert into btm.student values(4,'John',26,'MERN stack')");
		   
		   

		   System.out.println("Connection Established");
	     }
	   
	   catch(ClassNotFoundException | SQLException e)
	   {
		   e.printStackTrace();
	   }
	   
	   finally
	   {
		   if(con!=null)
		   {
			   try
			   {
				   con.close();
			   }
			   catch(SQLException e)
			   {
				   e.printStackTrace();
			   }
		   }
	   }
   }
}
