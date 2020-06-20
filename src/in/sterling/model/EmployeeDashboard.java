package in.sterling.model;

import in.sterling.dto.EmployeeDetailsDTO;
import in.sterling.util.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDashboard {
	
	public void addEmployee(EmployeeDetailsDTO ed) throws SQLException
	{
		Connection con=null;
    	PreparedStatement ps=null;
    	ResultSet rs=null;
    	MyConnection mycon=new MyConnection();
    	con=mycon.getConnection();
    	String query="insert into emp_basic_details values(?,?,?,?,?,?,?)";
    	ps=con.prepareStatement(query);
    	ps.setString(1, ed.getEmp_id());
    	ps.setString(2, ed.getEmp_first_name());
    	ps.setString(3, ed.getEmp_last_name());
    	ps.setString(4, ed.getEmp_mob());
    	ps.setString(5, ed.getEmp_email());
    	ps.setString(6, ed.getEmp_designation());
    	ps.setString(7, ed.getEmp_salary());
    	if(ps.executeUpdate()==1)
    	{
    		System.out.println("Record Inserted");
    	}
    	else
    	{
    		System.out.println("Recird Not Inserted");
    	}
    	
	}
	public List<EmployeeDetailsDTO> viewAllEmployee() throws SQLException
	{
		Connection con=null;
    	PreparedStatement ps=null;
    	ResultSet rs=null;
    	MyConnection mycon=new MyConnection();
    	con=mycon.getConnection();
    	String query="select *from emp_basic_details";
    	ps=con.prepareStatement(query);
    	rs=ps.executeQuery();
    	List<EmployeeDetailsDTO> mylist=new ArrayList<EmployeeDetailsDTO>();
    	while(rs.next())
    	{
    		EmployeeDetailsDTO ed=new EmployeeDetailsDTO();
    		ed.setEmp_id(rs.getString(1));
    		ed.setEmp_first_name(rs.getString(2));
    		ed.setEmp_last_name(rs.getString(3));
    		ed.setEmp_mob(rs.getString(4));
    		ed.setEmp_salary(rs.getString(7));
    		ed.setEmp_designation(rs.getString(6));
    		mylist.add(ed);
            ed=null;
    		
    	}
       
		return mylist;
		
	}
	public EmployeeDetailsDTO searchByEmpid(String emp_id) throws SQLException
	{
		Connection con=null;
    	PreparedStatement ps=null;
    	ResultSet rs=null;
    	MyConnection mycon=new MyConnection();
    	con=mycon.getConnection();
    	String query="select *from emp_basic_details where emp_id=?";
    	ps=con.prepareStatement(query);
    	ps.setString(1, emp_id);

    	rs=ps.executeQuery();
    	EmployeeDetailsDTO edd=new EmployeeDetailsDTO();
    	if(rs.next())
    	{
    		edd.setEmp_id(rs.getString(1));
    		edd.setEmp_first_name(rs.getString(2));
    		edd.setEmp_last_name(rs.getString(3));
    		edd.setEmp_mob(rs.getString(4));
    		edd.setEmp_salary(rs.getString(7));
    		edd.setEmp_designation(rs.getString(6));	
    	}
    	else
    		edd=null;
    	
     return edd;
		
	}
	
}




















