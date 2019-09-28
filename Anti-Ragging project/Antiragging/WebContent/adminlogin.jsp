<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title> Admin Login</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />

<style type="text/css">
body{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
}
h1 {
  color: white;
  text-align: center;
}

p {
color: white;
  font-family: verdana;
  font-size: 20px;
}
.loginbox{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 290px;
	height: 300px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
	font-family: sans-serif;
}
      ul li {
      display : inline-block;
      float:right;
      }
      ul li a{
      textdecoration : none;
      padding : 5px 20px;
      border: 0.5px solid ;
      }
      ul li a:hover{
         background-color: white;
      colour: #000;
      }
</style>

</head>
<body background=image/purp.jpg;>

<ul>
<li> <a href=" http://localhost:8081/Antiragging/home.jsp">Home </a> </li></ul>
<h1> Admin Login Page</h1>
 
  <div class="loginbox">
   ${msg }
<form   action="AdminCotroller"  method="post">


<p>Admin Id</p>
<input type="text" value="" name="adminId" placeholder="Enter your Id" required/>  

<p>Admin Password</p>
<input type="password" value="" name="adminPassword" placeholder="Enter password" required/>  

<p> </p> 
<input type="Submit" value="login" name=""/>  






</form>
</div>
</body>
</html>