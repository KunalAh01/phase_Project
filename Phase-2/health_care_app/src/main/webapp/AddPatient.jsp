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
<form action="patientController" method="post"class="form-group">
<input type="hidden" name="operation" value="add">
<label>Name</label>
<input type="text" name="name" class="form-control"><br/>
<label>EmailId</label>
<input type="email" name="email"class="form-control"><br/>
<label>Phone</label>
<input type="number" name="phone" class="form-control"><br/>
<label>Age</label>
<input type="number" name="age" class="form-control"><br/>
<label>Diagnosis</label>
<input type="text" name="diagnosis" class="form-control"><br/>
<label>Remarks</label>
<input type="text" name="remarks" class="form-control"><br/>

<input type="radio" name="gender" value="male"> Male
<input type="radio" name="gender" value="female"> Female
<input type="submit" name="submit" class="btn btn-success">
<input type="reset" name="reset" class="btn btn-info">
</form>
</div>
</body>
</html>