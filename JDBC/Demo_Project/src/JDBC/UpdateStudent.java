package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateStudent
{
     public static void main(String[] args) {
       String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
  	   Connection con=null;
  	   CallableStatement cstmt=null;
  	  
  	   
  	   try
  	   {
  		   Class.forName("com.mysql.cj.jdbc.Driver");
  		   con=DriverManager.getConnection(url);
  		   cstmt=con.prepareCall("{call updateStudent(?,?,?,?)}");
  		   cstmt.setInt(1, 3);
  		   cstmt.setString(2, "Smith");
  		   cstmt.setInt(3, 20);
  		   cstmt.setString(4, "MERN Stack");
  		   
  		   int il=cstmt.executeUpdate();
  		   
  		   System.out.println(il+"record Updated");
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

