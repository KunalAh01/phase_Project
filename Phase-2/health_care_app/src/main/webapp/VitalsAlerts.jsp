<%@page import="java.util.Iterator"%>
<%@page import="com.healthcare.entity.Vitals"%>
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
<h2 align="center">Doctor Home Page</h2><br/>
<div>
	<h4>Vitals</h4>
 <form action="MangePatient.jsp" class="form-group" >
<input type="submit" value="Manage Patient" class="btn btn-success" >
</form>
 <form action="Vitals.jsp" class="form-group">
<input type="submit" value="Record new Vital" class="btn btn-info">
</form>
</div>
<table border="1" class="table">

<tr>
<th>SNo</th>
<th>Patient Id</th>
<th>BP High</th>
<th>BP Low</th>
<th>SPO2</th>
<th>Recorded On</th>
<th>Action</th>



</tr>

		<%
	
		Object obj=session.getAttribute("vitals");
		List<Vitals> listOfVitals=(List<Vitals>)obj;
		
		Iterator<Vitals> li=listOfVitals.iterator();
		while(li.hasNext()){
			Vitals p=li.next();
		
			%>
			<tr>		
			<td><%=p.getSNo()%></td>
			<td><%=p.getPid() %></td>
			<td><%=(p.getBPHigh()> 140 ? "High BP ":"Normal " ) %>  </td>
			<td><%=(p.getBPLow()<80 ? "Low BP> ":"Normal" ) %>  </td>
			<td><%=p.getSPO2() <80 ? "Less then 90,Not Normal!!":"Normal Oxygen level"%></td>
			<td><%=p.getRecordedOn() %></td>

			
	<td/>		
	<form action="VitalsController" method="post">
	<input type="hidden" name="operation" value="delete">
	<input type ="hidden" name="SNo" value="<%=p.getSNo()%>">
	<input type="submit" value="Delete"> 
	
	</form>
	
	<form action="patientController" method="post">
	<input type="hidden" name="operation" value="search">
	<input type ="hidden" name="SNo" value="<%=p.getPid()%>">
	<input type="submit" value="View Patient Details"> 
	
	</form>
	
				
			</td>
			</tr>
			<%
		}

		%>
</table>
</body>
</html>