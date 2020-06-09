<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="css/stylesheet.css" rel="stylesheet" type="text/css">
</head>
<body style="background-image: url(img/content.png);background-repeat: repeat;">
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
<button type="button" onClick="window.location.href='searchEmpView.jsp';" class="btn btn-primary">View Employee</button>
<button type="button" class="btn btn-primary">Logout</button>
</div>
</div>
<div class="col-lg-10 col-md-10 col-sm-12 bg-light">
<h2>Employee Details</h2>
<table class="table">
 <div class="container-fluid">
    <br/>
 <div class="row justify-content-center">
  <div class="col-12 col-md-10 col-lg-8">
    <form class="card card-sm">
       <div class="card-body row no-gutters align-items-center">
             <div class="col-auto">
                <i class="fas fa-search h4 text-body"></i>
             </div>
            <div class="col">
             <input class="form-control form-control form-control-borderless" type="search" placeholder="Search Employee by Id or Name">
            </div>                                    
           <div class="col-auto">
            <button class="btn btn-primary" type="submit">Search</button>
            <button type="button" onClick="window.location.href='viewAllEmpDetailsView.jsp';" class="btn btn-primary">View All Employee</button>                                        
          </div>                             
        </div>
    </form>
    <!--condition check then execute part of table view-->
   <div class="container-fluid">
   <thead class="col-lg-10 bg-primary">
    <tr>
    <th scope="col">Id</th>
    <th scope="col">Name</th>
    <th scope="col">Mobile No.</th>
    <th scope="col">Salary</th>
    <th scope="col">Designation</th> 
    </tr>
    </thead>
    <tbody class="col-lg-10">
    <tr>
    <td>emp_id</td>
    <td>emp_name</td>
    <td>emp_mobileNo.</td>
    <td>emp_salary</td>
    <td>emp_designation</td>
    <td><button class="btn btn-primary" type="submit">edit</button>
    </tr>
    </tbody>
    </div>                                     
  </div>
 </div>				
</table>
</div>			
</div>		
</div>
</div>
<br><br>
<%@include file="footer.jsp"%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
