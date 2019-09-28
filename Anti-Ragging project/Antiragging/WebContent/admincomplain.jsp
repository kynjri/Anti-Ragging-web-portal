<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "com.iimt.model.Complain"%>
<%@page import= "java.util.*"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Complains list</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />

 <style> 
      .heading {
        width: 100%;
        padding: 50px 50;
     
        text-align: center;
      }
   
          body{
	margin: 0;  padding: 0;
	background-size: cover;
	font-family: sans-serif;  }  
	.home .search-container {
  float: right;
}

.home input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.home .search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.home .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .home .search-container {
    float: none;
  }
 
 .home a, .home input[type=text], .home .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
    .home input[type=text] {    border: 1px solid #ccc;    } 
    </style>
</head>
<body background="image/background.png">
<div class="home">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li class="active"><a href="http://localhost:8081/Antiragging/home.jsp"> <span class="glyphicon glyphicon-home"></span> Home</a></li>    
       <li><a href="FacultyDisplayController"><span class="glyphicon glyphicon-user"></span> Faculty</a></li>
       <li><a href="StudentDisplayController"><span class="glyphicon glyphicon-user"></span> Student</a></li>
     <li><a href="#"><span class="glyphicon glyphicon-file"></span> Complains</a></li>
       </ul>
      <div class="search-container">
    <form action="">
      <input type="text" placeholder="Search by Roll-No" name="search">
      <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>
  </div>
</nav>
</div>
<div class="heading">
<font size="10" color="black"><b>Complains list</b></font>
</div>

<table   border="1" class="table table-hover">
<tr>

</tr>
 
<tr bgcolor="lightblue">
<td><b> Date Of Complain</b> </td>
<td><b> Student Name</b> </td>
<td><b> Rollno</b> </td>
<td><b> Description</b> </td>
<td><b>Faculty </b> </td>
<td><b>Date Of Action </b> </td>
<td><b> Actions Taken</b> </td>

</tr>

<%List<Complain> list = (List<Complain>)request.getAttribute("list");
for(Complain l : list){
%><tr>
<td> <%= l.getDateofcomplain() %> </td>
<td> <%= l.getStudentname() %> </td>
<td> <%= l.getStudentrollno() %> </td>
<td><%= l.getDescription() %> </td>
<td><%= l.getActiontakenby() %> </td>
<td><%= l.getDateofaction() %> </td>
<td><%= l.getActiontaken() %> </td>


<%}%>
</tr>
</table>
</div>
</body>
</html>