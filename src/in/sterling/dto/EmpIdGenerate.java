 package in.sterling.dto;
import java.sql.*;

import in.sterling.util.MyConnection;
public class EmpIdGenerate {
	
	public String empIdGen() throws SQLException
	{  
		String id=null;
		int x=0;
		Connection con=null;
    	PreparedStatement ps=null;
    	ResultSet rs=null;
    	MyConnection mycon=new MyConnection();
    	con=mycon.getConnection();
    	String query="select emp_id from emp_basic_details";
     	ps=con.prepareStatement(query);
     	rs=ps.executeQuery();
        while(rs.next())
        {
        	id=rs.getString(1);
        }
        
        x=Integer.parseInt(id);
        x=x+1;
        id=Integer.toString(x);
		return id;
		
	}

}
