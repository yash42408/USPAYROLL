package in.sterling.ctl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import in.sterling.dto.EmployeeDetailsDTO;
import in.sterling.model.EmployeeDashboard;

@WebServlet("/EmployeeAdd")
public class EmployeeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeDetailsDTO ed= new EmployeeDetailsDTO();
    EmployeeDashboard edash=new EmployeeDashboard();
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emp_id=request.getParameter("emp_id");
		String emp_first_name=request.getParameter("emp_first_name");
		String emp_last_name=request.getParameter("emp_last_name");
		String emp_mobile=request.getParameter("emp_mobile");
		String emp_email=request.getParameter("emp_email");
		String emp_designation=request.getParameter("emp_designation");
		String emp_salary=request.getParameter("emp_salary");
        ed.setEmp_id(emp_id);
        ed.setEmp_first_name(emp_first_name);
        ed.setEmp_last_name(emp_last_name);
        ed.setEmp_mob(emp_mobile);
        ed.setEmp_email(emp_email);
        ed.setEmp_designation(emp_designation);
        ed.setEmp_salary(emp_salary);
        try {
			edash.addEmployee(ed);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
