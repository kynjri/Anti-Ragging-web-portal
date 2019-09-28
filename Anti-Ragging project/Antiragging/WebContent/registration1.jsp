<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registration page</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
<style>

body
{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
}
</style>

</head>

<body background ="image/background.png">
	<h2>Anti-Ragging Registration Form For Faculty</h2>
	<hr />
	${msg }
	<form action="RegistrationController2" method="post">
		<table>
		 <tr>
	   <td><p>User name</p></td> <td><input type="text" value="" name="username" placeholder="Username" required />  </td>
	   </tr>
       
       <tr>
       <td><p>Password</p></td> <td><input type="password" value="" name="password" placeholder="password" required/>  </td>
       </tr>
				
		<tr>
		<td><p>Faculty Name</p></td> <td><input type="text" value="" name="name" placeholder="Name" />  </td>
		</tr>

        <tr>
        <td><p>Gender</p></td> <td><input type="text" value="" name="gender" placeholder="Male/Female/Other" /></td>
        </tr>
        
        <tr>
        <td><p>MobNo</p></td> <td><input type="text" value="" name="mobNo" placeholder="Mobile. no " required />  </td>
        </tr>
        
        <tr>
        <td><p>EmailId</p></td> <td><input type="text" value="" name="emailId" placeholder="email- Id" />  </td>
        </tr>
  
        <tr>
        <td><p>Department</p></td> <td><input type="text" value="" name="department" placeholder="department" />  </td>
        </tr>     
 
		<tr>	
		<td><p> <input type="reset" value="clear"/> 
		
		<input type="submit" value="Register"/> 
		</p></td>
		
		</tr>
</table>
	</form>
	
</body>
</html>