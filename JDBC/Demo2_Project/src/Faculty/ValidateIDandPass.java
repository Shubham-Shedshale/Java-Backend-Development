package Faculty;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ValidateIDandPass 
{
   public static void main(String[] args) {
	   
	String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
	Connection con=null;
	CallableStatement cs=null;
	ResultSet rs=null;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the ID");
	int id=sc.nextInt();
	System.out.println("Enter the password");
	String pass=sc.next();
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url);
        cs=con.prepareCall("{call Validateidpass(?,?)}");
        cs.setInt(1, id);
        cs.setString(2, pass);
        
        rs=cs.executeQuery();
        
        if(rs.next())
        {
         int id1=rs.getInt("ID");
   		 String uname=rs.getString("UNAME");
   		 int phone1=rs.getInt("PHONE"); 
   		 String email1=rs.getString("EMAIL");
   		 String pass1=rs.getString("PASS");
   		 
   		 System.out.println(id1+" "+uname+" "+phone1+" "+email1+" "+pass1);
        }
		
	}
	catch(SQLException | ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			if(rs!=null)
				rs.close();
			if(cs!=null)
				cs.close();
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
