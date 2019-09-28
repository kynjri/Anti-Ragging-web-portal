<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ page import="com.iimt.model.Faculty"%>
  <%@ page import ="java.util.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"  ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"  ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>


<title>Faculty Details</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
<style type="text/css">
    body{
	margin: 0; padding: 0;
	background-size: cover;
	font-family: sans-serif; }  
   
     .heading{      text-align: center;     }
   
      a:link, a:visited {
  background-color: transparent;  color: black;
  padding: 2px 10px;   text-align: center;
  text-decoration: none;  display: inline-block;  }

a:hover, a:active {  background-color: #668cff; }
   
.home a:hover, a:active { background-color: white; } 

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
      <li class="active"><a href="http://localhost:8081/Antiragging/home.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>    
       <li><a href="FacultyDisplayController"><span class="glyphicon glyphicon-user"></span> Faculty</a></li>
       <li><a href="StudentDisplayController"><span class="glyphicon glyphicon-user"></span> Student</a></li>
    <li><a href="AdminComplainController"><span class="glyphicon glyphicon-file"></span> Complains</a></li>
    </ul>
    <div class="search-container">
    <form action="">
      <input type="text" placeholder="Search by username" name="search">
      <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>

  </div>
</nav>
</div>
<div class="heading">
<font size="10" color="black"><b>Faculty Details</b></font>
</div>

<%
/*Java Code*/
List<Faculty> list = (List<Faculty>)request.getAttribute("list");
%>
${msg }
<table border="1" class="table table-hover">
<tr bgcolor="lightblue">

 <th>UserName</th>
<th>Password</th>
 <th>Name</th>
 <th>Gender</th>
 <th>MobNo</th>
 <th>EmailId</th>
 <th>Department</th> 
 <th>Edit</th>
 <th>Delete</th>
 </tr>

<%
for(Faculty f : list){
%>

<tr>
<td><%=f.getUsername() %></td>
 <td><%= f.getPassword() %></td>
 <td><%= f.getName() %></td>
 <td><%= f.getGender() %></td>
 <td><%=f.getMobNo() %></td>
 <td><%= f.getEmailId() %></td>
<td><%= f.getDepartment() %></td>
 <td><a href="SearchByUsername?username=<%=f.getUsername() %>">Update</a></td>
 <td><a href="FacultyDeleteController?username=<%=f.getUsername() %>">Delete</a></td>
</tr>
<%} %>
</table>
</body>
</html>