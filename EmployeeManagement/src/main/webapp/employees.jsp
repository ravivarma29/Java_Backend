<%@ page language="java"  import = "java.util.* , com.model.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
	<marquee>
    Hi <%= session.getAttribute("username") %> Welcome to Employee Dashboard
</marquee>
<hr>
<a href="addEmployee.jsp">Add Employee</a>

<h2> Employees !!!!</h2>
	<table border="1">
		<tr>
			<th> Employee Id </th>
			<th> Employee Name </th>
			<th> Employee Email </th>
			<th> Employee PhoneNum </th>
			<th> Employee Salary </th>
			<th> Employee isActive </th>

		</tr> 	
		
		<%  List<Employee> employeesList   = (List<Employee>) request.getAttribute("empList");
		
		for(Employee emp :  employeesList) {
		
		%>
		
		<tr>
			<td> <%= emp.getEmpId() %> </td>
			<td> <%= emp.getName() %> </td> 
			<td> <%= emp.getEmail() %> </td>
			<td> <%= emp.getPhoneNum() %> </td>
			<td> <%= emp.getSalary() %> </td>
			<td> <%= emp.isActive()  %> </td>

		</tr> 	
		
		<%  }  %>
	</table>


</body>
</html>