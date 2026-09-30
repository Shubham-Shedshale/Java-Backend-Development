package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 
{
     public static void main(String[] args) {
       String url="jdbc:mysql://localhost:3306/btm?user=root&passwor d=YOUR_PASSWORD";
  	   Connection con=null;
  	   CallableStatement cstmt=null;
  	  
  	   
  	   try
  	   {
  		   Class.forName("com.mysql.cj.jdbc.Driver");
  		   con=DriverManager.getConnection(url);
  		   cstmt=con.prepareCall("{call addStudent(?,?,?,?)}");
  		   cstmt.setInt(1, 2);
  		   cstmt.setString(2, "John");
  		   cstmt.setInt(3, 23);
  		   cstmt.setString(4, "PythonFullStack");
  		   
  		   int il=cstmt.executeUpdate();
  		   
  		   System.out.println(il+"record inserted");
  	    }  
  		 
  	   catch(ClassNotFoundException | SQLException e)
  		{
  	        e.printStackTrace();
  	    }
  	   
  	   finally
  	   {
  		   if(cstmt!=null)
  		   {
  			   try
  			   {
  				   cstmt.close();
  			   }
  			   catch(SQLException e)
  			   {
  				   e.printStackTrace();
  			   }
  		   }
  		   
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
