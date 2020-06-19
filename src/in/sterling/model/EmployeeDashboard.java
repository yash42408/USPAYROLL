package in.sterling.model;

import in.sterling.dto.EmployeeDetailsDTO;
import in.sterling.util.MyConnection;

import java.sql.*;
public class EmployeeDashboard {
	
	public void addEmployee(EmployeeDetailsDTO ed) throws SQLException
	{
		Connection con=null;
    	PreparedStatement ps=null;
    	ResultSet rs=null;
    	MyConnection mycon=new MyConnection();
    	con=mycon.getConnection();
    	String query="insert into emp_basic_details values(?,?,?,?,?)";
    	ps=con.prepareStatement(query);
    	ps.setString(1, ed.getEmp_id());
    	ps.setString(2, ed.getEmp_mob());
    	ps.setString(3, ed.getEmp_email());
    	ps.setString(4, ed.getEmp_designation());
    	ps.setString(5, ed.getEmp_salary());
    	if(ps.executeUpdate()==1)
    	{
    		System.out.println("Record Inserted");
    	}
    	else
    	{
    		System.out.println("Recird Not Inserted");
    	}
    	
	}
	
}
