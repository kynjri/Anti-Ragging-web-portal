<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Login</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
<style>
body
{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
}
.heading{
text-align: center;
color: white;
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
a:link, a:visited {
  background-color: green;
  color: black;
  padding: 2px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: white;
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

 <body 	background=image/purp.jpg;>
 
<ul>
<li> <a href=" http://localhost:8081/Antiragging/home.jsp">Home </a> </li></ul>
<div class="heading"><h1>Faculty Login</h1>

</div> 
 <div class="loginbox">
   ${msg }
   <form   action="FacultyLoginController"  method="post">
  
      <p>User name</p>
       <input type="text" value="" name="userName" placeholder="Enter username" required>  
      <p>Password</p>
      <input type="password" value="" name="password" placeholder="Enter Password" required>  
     <p> </p>
      <input type="Submit" value="login" name="submit">  
       <a href="http://localhost:8081/Antiragging/registration1.jsp" target="_blank">Register</a> 
     <p> </p>     
   </form>
   </div>
 </body>
</html>