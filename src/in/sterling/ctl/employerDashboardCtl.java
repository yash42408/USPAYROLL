
package in.sterling.ctl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sterling.dto.EmployerDetailsDTO;
import in.sterling.model.EmployerDashboard;


@WebServlet("/employerDashboardCtl")
public class employerDashboardCtl extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployerDashboard ed=new EmployerDashboard();
		EmployerDetailsDTO emd;
		try {
			
			emd=ed.getEmprDetails();
			request.setAttribute("empr_id",emd.getEmpr_id());
			request.setAttribute("empr_mail", emd.getEmpr_email());
			request.setAttribute("empr_mobile",emd.getEmpr_mobile());
			request.setAttribute("empr_name", emd.getEmpr_name());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	}

}
