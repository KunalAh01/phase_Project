<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<h2>Doctor Home Page</h2>
	<form action="adminHome.jsp" class="form-group">
	<label>Home</label>
	<input type="submit" value="Home" class="btn btn-outline-info">
	</form action="login.jsp">
	<form action="AddPatient.jsp" class="form-group">
	<label>Add Patient</label>
	<input type="submit" value="Add Patient" class="btn btn-outline-info">
	</form>
	<form action="patientController" method="post">
	<input type="hidden" name="operation" value="search">
	<label>Search Patient</label>
	<input type="text" name="SNo">
	<input type="submit" value="Search">
	
	
	</form>
	
</body>
</html>