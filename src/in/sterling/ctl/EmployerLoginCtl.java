package in.sterling.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployerLoginCtl
 */
@WebServlet("/EmployerLoginCtl")
public class EmployerLoginCtl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    PrintWriter out=response.getWriter();
		String str=request.getParameter("empr_id");
		String str1=request.getParameter("empr_pass");
		if(str.equals("yash") && str1.equals("1234"))
		{
			response.sendRedirect("employerDashboardView.jsp");
		}
		
		else
		{
			response.sendRedirect("index.html");
		}
		
	
		
	}

	
}
