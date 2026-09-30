package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetRecordByPreparedStmt 
{
    public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/btm?user=root&password=YOUR_PASSWORD";
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        
        try
        {
        	con=DriverManager.getConnection(url);
        	//pstmt=con.prepareStatement("select * from student where ID=?");
           // pstmt.setInt(1,2);
        	
        	pstmt=con.prepareStatement("select * from student where Name like '%R%'");
            
            rs=pstmt.executeQuery();
           
            while(rs.next())
            {
            	int id=rs.getInt("ID");
            	String name=rs.getString("NAME");
            	int age=rs.getInt("AGE");
            	String course=rs.getString("COURSE");
            	
            	System.out.println(id+" "+name+" "+age+" "+course);
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
        	  {
        		con.close();
        	  }
           }
           catch(SQLException e)
           {
        	   e.printStackTrace();
           }
           
           try
           {
        	  if(pstmt!=null)
        	  {
        		pstmt.close();
        	  }
           }
           catch(SQLException e)
           {
        	   e.printStackTrace();
           }
           
           try
           {
        	  if(rs!=null)
        	  {
        		rs.close();
        	  }
           }
           catch(SQLException e)
           {
        	   e.printStackTrace();
           }
        }
	}
}
