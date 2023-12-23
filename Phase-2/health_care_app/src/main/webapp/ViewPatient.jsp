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
<h2>Doctor Home Page<br/><br/>
<div>
<form action="patientController" method="get"class="form-group">
<input  type="submit" value="Patient"class="btn btn-outline-info">
</form>
 <form action="AddPatient.jsp"  class="form-group">
<input  type="submit" value="Add Patient"class="btn btn-outline-info">
</form>
<form action="searchPatient.jsp" method="post"class="form-group">
<input  type="submit" value="Search Patient"class="btn btn-outline-info">

</form>
<form action="ViewVitals.jsp" class="form-group">
<input  type="submit" value="Manage Vitals"class="btn btn-outline-info">
</form>
</div>
</body>
</html>