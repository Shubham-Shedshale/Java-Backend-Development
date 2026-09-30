package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class deleteStudent
{
    public static void main(String[] args) {
    	String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
    	Connection con=null;
    	CallableStatement cstmt=null;
    	
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection(url);
   		   cstmt=con.prepareCall("{call deleteStudent(?,?,?,?)}");
   		   cstmt.setInt(1, 2);
   		   cstmt.setString(2, "Sam");
   		   cstmt.setInt(3, 21);
   		   cstmt.setString(4, "Python full stack");
   		   
   		   int il=cstmt.executeUpdate();
   		   
   		   System.out.println(il+"record deleted");
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


