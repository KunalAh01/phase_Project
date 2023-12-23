<%@page import="java.util.Iterator"%>
<%@page import="com.healthcare.entity.Patient"%>
<%@page import="java.util.List"%>
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
<table border="1" class="table">

<tr>
<th>SNo</th>
<th>name</th>
<th>age</th>
<th>diagnosis</th>
<th>email</th>
<th>gender</th>
<th>phone</th>
<th>remarks</th>
<th>Action</th>



</tr>

		<%
	
		Object obj=session.getAttribute("patient");
		Patient p=(Patient)obj;
			%>
			
			<tr>
			<td><%=p.getSNo()%></td>
			<td><%=p.getName() %></td>
			<td><%=p.getAge() %></td>
			<td><%=p.getDiagnosis() %></td>
			<td><%=p.getEmail() %></td>
			<td><%=p.getGender() %></td>
			<td><%=p.getPhone() %></td>
			<td><%=p.getRemarks() %></td>
			<td>
			
			<form action="patientController" method="post" >
	<input type="hidden" name="operation" value="delete">
	<input type ="hidden" name="SNo" value="<%=p.getSNo()%>">
	<input type="submit" value="Delete"> 

	</form>
		<br/>
	<form action="patientController" method="post">
	<input type="hidden" name="operation" value="update">
	<input type ="hidden" name="SNo" value="<%=p.getSNo()%>">
	<input type="submit" value="Update"> 
	
	</form>
		<br/>
	<form action="patientController" method="post">
	<input type="hidden" name="operation" value="manageVital">
	<input type ="hidden" name="SNo" value="<%=p.getSNo()%>">
	<input type="submit" value="Manage Vitals"> 
	
	</form>
		 	<br/>		
			</td>
			</tr>

</table>

</body>
</html>