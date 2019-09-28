<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "com.iimt.model.Complain"%>
<%@page import= "java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<title>Faculty portal</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />

 <style> 
     body{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
}  
      .heading {
        width: 100%;
        padding: 50px 50;
        background-color:lightblue;
        text-align: center;
      }
   
.home a:link, a:visited {
  background-color: green;
  color: black;
  padding: 2px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

.home a:hover, a:active {
  background-color: white;
}      ul li {
      display : inline-block;
      float:right;
      }
    .home ul li a{
      textdecoration : none;
      padding : 5px 20px;
      border: 0.5px solid ;
      }
     .home ul li a:hover{
         background-color: white;
      colour: #000;
      }
         a:link, a:visited {
  background-color: transparent;
  color: black;
  padding: 2px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: white;
}
    </style>
</head>
<body background="image/background.png">
<div class="home">
<ul>
<li> <a href=" http://localhost:8081/Antiragging/home.jsp">Home </a> </li></ul>
</div>
<div class="heading">
<p>  STUDENT'S HAPPINESS IS IN YOUR HAND</p>
</div>
${msg }<div>
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
<td><b> Action</b> </td>
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
<td><a href="facultyreply.jsp?rollno=<%= l.getStudentrollno() %>"  href="facultyreply.jsp?name=<%= l.getStudentname()%>">Action</a></td>

<%}%>
</tr>
</table>
</div>
</body>
</html>