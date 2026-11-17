<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> add Employee</h2>

<form action="addEmployee" method="post">

<label for="name">Name :</label>
 <input type="text" name="name" placeholder="Enter Name"><br>
 <label for="name">Email :</label>
 <input type="email" name="email" placeholder="Enter Email"><br>
 <label for="PhoneNum">Phone Number : </label>
 <input type="text" name="phoeNum" placeholder="Enter PhoneNum"><br>
 <label for="salary">Salary :</label>
 <input type="text" name="salary" placeholder="Enter salary"><br><br>

<input type="submit" value="Add Employee">
</form>

</body>
</html>