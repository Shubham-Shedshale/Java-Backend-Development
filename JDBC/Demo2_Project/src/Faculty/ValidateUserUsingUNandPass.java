package Faculty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ValidateUserUsingUNandPass 
{
         public static void main(String[] args) {
        	 String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
             Connection con=null;
             PreparedStatement ps=null;
             ResultSet rs=null;
             Scanner sc=new Scanner(System.in);
             
             System.out.println("Enter the username");
             String username=sc.next();
             System.out.println("Enter the password");
             String password=sc.next();
             
             try
             {
            	//Class.forName("com.mysql.cj.jdbc.Driver");
             	con=DriverManager.getConnection(url);
             	
             	ps=con.prepareStatement("select * from faculty where uname=? and pass=?");
             	ps.setString(1, username);
             	ps.setString(2, password);
             	
             	rs=ps.executeQuery();
             	
             	if(rs.next())
             	{
             		System.out.println("Login Successfull");
             	}
             	else
             	{
             		System.out.println("Invalid username or password");
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
            		 if(con!=null)
            			 con.close();
            		 if(ps!=null)
            			 ps.close();
            		 if(rs!=null)
            			 rs.close();
            	 }
            	 catch(SQLException e)
            	 {
            		 e.printStackTrace();
            	 }
            	 
             }
		}
}
