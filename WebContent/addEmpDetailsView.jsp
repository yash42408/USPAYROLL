<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Add Employee</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="css/stylesheet.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@include file="header.jsp" %>
<br>
<div class="container blur">
<div class="row bg-primary">
	<div class="col-lg-12 col-md-12 col-sm-12">
		<br>
	</div>
		<div class="col-lg-2 col-md-2 col-sm-12">
			<img src="img/user.png" class="img-fluid profile_image">
		</div>
		<div class="col-lg-10 col-md-10 col-sm-12">
			<br>
			<h1>Greeting + Name</h1>
		</div>
	</div>	
	<div class="row">
		<div class="col-lg-2 col-md-2 col-sm-12 bg-primary sidding">
		<br>
			<div class="btn-group btn-group-vertical btn-size">
						 <button type="button" onClick="window.location.href='employerDashboardView.jsp';" class="btn btn-primary">Profile</button>
						  <button type="button" onClick="window.location.href='viewEmpTimesheetView.jsp';" class="btn btn-primary">Employee Timesheet</button>
						  <button type="button" onClick="window.location.href='generatePayrollView.jsp';" class="btn btn-primary">Generate Payroll</button>
						  <button type="button" onClick="window.location.href='addEmpDetailsView.jsp';" class="btn btn-primary">Add Employee</button>
						  <button type="button" onClick="window.location.href='viewEmpDetailsView.jsp';" class="btn btn-primary">View Employee</button>
						  <button type="button" class="btn btn-primary">Logout</button>
			</div>
		</div>
		<div class="col-lg-10 col-md-10 col-sm-12 bg-light">
					<h2>Add Employee</h2>
				      <form action="">
						<table class="table">
							<tr>
								<td>ID </td>
								<td>emp_id</td>
							</tr>
							
							<tr>
								<td>Mobile Number</td>
								<td><input type="text" class="form-control-sm" value="emp_mobile"></td>
							</tr>
							<tr>
								<td>Email Address</td>
								<td><input type="email" class="form-control-sm" value="emp_email"></td>
							</tr>
							<tr>
								<td>Designation</td>
								<td><input type="email" class="form-control-sm" value="emp_designation"></td>
							</tr>
							<tr>
								<td>Salary</td>
								<td><input type="email" class="form-control-sm" value="emp_salary"></td>
							</tr>				
							<tr>
							<td></td>
								<td><input type="submit" value="Add" class="btn btn-primary"></td>
							</tr>
						</table>
					</form>
		</div>			
	</div>		
	</div>
</div>
<br><br>
<%@include file="footer.jsp" %>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
