<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.iimt.model.Student"%>
<%@ page import ="java.util.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Student Details</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
<style type="text/css">
    body{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
}  
     .heading{
      text-align: center;
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
  background-color: #668cff;
}
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
<font size="10" color="black"><b>Student Details</b></font>
</div>
<%

/*Java Code*/

List<Student> list = (List<Student>)request.getAttribute("list");
%> 
${msg }<div>
<table border="1"  class="table table-hover">
<tr>

</tr>

<tr bgcolor="lightblue">

 <th>Name</th>
 <th>Gender</th>
 <th>Nationality</th>
 <th>MobNo</th>
 <th>EmailId</th>
 <th>Address1</th>
 <th>Address2</th>
 <th>City</th>
 <th>State</th>
 <th>Ugorpg</th>
 <th>Course Name</th>
 <th>RollNo</th>
 <th>YearOfStudy</th>
 <th>password</th>
 <th>UserName</th>
 <th>Edit</th>
 <th>Delete</th>

</tr>

<%

for(Student s : list){

%>

<tr>

 <td><%=s.getName() %></td>
 <td><%= s.getGender() %></td>
 <td><%= s.getNationality() %></td>
 <td><%=s.getMobNo() %></td>
 <td><%=s.getEmailId() %></td>
 <td><%=s.getAddress1() %></td>
 <td><%=s.getAddress2() %></td>
 <td><%=s.getCity() %></td>
 <td><%=s.getState() %></td>
 <td><%=s.getUgorpg() %></td>
 <td><%=s.getCourseName() %></td>
  <td><%=s.getRollNo() %></td>
 <td><%=s.getYearOfstudy() %></td>
 <td><%=s.getPassword() %></td>
 <td><%=s.getUserName() %></td>
 <td><a href="SearchByRollNoController?rollno=<%=s.getRollNo() %>">Update</a></td>
 <td><a href="StudentDeleteController?rollno=<%=s.getRollNo() %>">Delete</a></td>
</tr>
<%} %>
</table>
</div>
</body>
</html>