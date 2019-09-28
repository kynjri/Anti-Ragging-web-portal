<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Admin portal</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />

 <style> 
      p {
        width: 100%;
        padding: 50px 50;
        background-color:lightblue;
        text-align: center;
      }
     .heading{
      text-align: center;
      }
                body{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
    </style>
</head>

<body background="image/background.png">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
   
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="http://localhost:8081/Antiragging/home.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>    
       <li><a href="FacultyDisplayController"><span class="glyphicon glyphicon-user"></span> Faculty</a></li>
       <li><a href="StudentDisplayController"><span class="glyphicon glyphicon-user"></span> Student</a></li>
          <li><a href="AdminComplainController"><span class="glyphicon glyphicon-file"></span> Complains</a></li>
   
    </ul>

  </div>
</nav>
<div class="heading">
<font size="10" color=" #00284d"><b>Welcome Back</b></font>
</div>



</body>
</html>