package in.sterling.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.sterling.dto.EmployerDetailsDTO;
import in.sterling.util.MyConnection;

public class EmployerDashboard {
    public EmployerDetailsDTO getEmprDetails() throws SQLException
    {
    	Connection con=null;
    	PreparedStatement ps=null;
    	ResultSet rs=null;
    	MyConnection mycon=new MyConnection();
    	con=mycon.getConnection();
        String query="select *from employer_details";
    	ps=con.prepareStatement(query);
    	rs=ps.executeQuery();
    	EmployerDetailsDTO emd=new EmployerDetailsDTO();
    	while(rs.next())
    	{
    		emd.setEmpr_id(rs.getString(1));
    		emd.setEmpr_mobile(rs.getString(2));
    		emd.setEmpr_email(rs.getString(3));
    		emd.setEmpr_name(rs.getString(5));
            
    	}
		return emd;
		
    }
    public boolean EmployerLogin() {
		return false;
    	
    	
    }
    
    
}
