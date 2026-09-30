package Faculty;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertRecord 
{
    public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
        Connection con=null;
        CallableStatement cs=null;
        
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	con = DriverManager.getConnection(url);
        	cs=con.prepareCall("{call addFaculty(?,?,?,?,?)}");
        	cs.setInt(1,1);
        	cs.setString(2,"Aditya");
        	cs.setInt(3, 875648892);
        	cs.setString(4, "adi@email.com");
        	cs.setString(5, "aditya");
        	//cs.executeUpdate();
            int il=cs.executeUpdate();
   		    System.out.println(il+"record inserted");
        	
        	cs.setInt(1,2);
        	cs.setString(2,"Ram");
        	cs.setInt(3, 925648892);
        	cs.setString(4, "ram@email.com");
        	cs.setString(5, "ramm");
        	int il2=cs.executeUpdate();
    		System.out.println(il2+"record inserted");
        	
        	cs.setInt(1,3);
        	cs.setString(2,"Sham");
        	cs.setInt(3, 775648123);
        	cs.setString(4, "shamdi@email.com");
        	cs.setString(5, "sham");
        	int il3=cs.executeUpdate();
    		System.out.println(il3+"record inserted");
        	
        	cs.setInt(1,4);
        	cs.setString(2,"Naman");
        	cs.setInt(3, 999648892);
        	cs.setString(4, "naman@email.com");
        	cs.setString(5, "naman");
        	//cs.executeUpdate();
        	int il4=cs.executeUpdate();
    		System.out.println(il4+"record inserted");
        	
        	cs.setInt(1,5);
        	cs.setString(2,"Virat");
        	cs.setInt(3, 777648892);
        	cs.setString(4, "virat@email.com");
        	cs.setString(5, "virat");
        	int il5=cs.executeUpdate();
    		System.out.println(il5+"record inserted");
        }
        catch(ClassNotFoundException | SQLException e)
  		{
  	        e.printStackTrace();
  	    }
        
        finally
        {
        	try
        	{
        		if(con!=null)
        			con.close();
        	}
        	catch(SQLException e)
        	{
        		e.printStackTrace();
        	}
        	
        	try
        	{
        		if(cs!=null)
        			cs.close();
        	}
        	catch(SQLException e)
        	{
        		e.printStackTrace();
        	}
        }
	}
}
