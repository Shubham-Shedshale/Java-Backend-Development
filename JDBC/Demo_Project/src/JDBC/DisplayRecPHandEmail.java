
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayRecPHandEmail {
	public static void main(String[] args) {
   	 String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter phone number");
     int phone=sc.nextInt();
     System.out.println("Enter Email");
     String email=sc.next();
     
     try
     {
    	 con=DriverManager.getConnection(url);
    	 ps=con.prepareStatement("select * from faculty where phone=? and email=?");
    	 ps.setInt(1, phone);
    	 ps.setString(2, email);
    	 
    	 rs=ps.executeQuery();
    	 
    	 if(rs.next())
    	 {
    		 int id=rs.getInt("ID");
    		 String uname=rs.getString("UNAME");
    		 int phone1=rs.getInt("PHONE"); 
    		 String email1=rs.getString("EMAIL");
    		 String pass=rs.getString("PASS");
    		 
    		 System.out.println(id+" "+uname+" "+phone1+" "+email1+" "+pass);
    			 
    	 }
    	 else
    	 {
    		 System.out.println("User not Found or wrong id,pass");
    	 }
     }
    	 catch(SQLException e)
    	 {
    		 e.printStackTrace();
    	 }
     
         finally
         {
        	 try
        	 {
        		 
        		 if(rs!=null)
        			 rs.close();
        		 if(ps!=null)
        			 ps.close();
        		 if(con!=null)
        			 con.close();
        		
        	 }
        	 catch(SQLException e)
        	 {
        		 e.printStackTrace();
        	 }
         }
	}

}
