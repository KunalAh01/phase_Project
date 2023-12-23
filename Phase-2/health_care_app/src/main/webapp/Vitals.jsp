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
<h2>Doctor Logger</h2>
<form action="VitalsController" method="post"class="form-group">
<input type="hidden" name="operation" value="add">
<label>BPHigh</label>
<input type="number" name="BPHigh" class="form-control"><br/>
<label>BPLow</label>
<input type="number" name="BPLow"class="form-control"><br/>
<label>SPO2</label>
<input type="number" name="SPO2" class="form-control"><br/>
<label>PatientId</label>
<input type="number" name="PatientId" class="form-control"><br/>
 <label>RecordedOn</label>
<input type="datetime-local" name="RecordedOn" class="form-control"><br/>
<input type="submit" name="submit" class="btn btn-success">
<input type="reset" name="reset" class="btn btn-info">
</form>
</body>
</html>