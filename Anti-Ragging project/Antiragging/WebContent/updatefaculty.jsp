<%@page import="com.iimt.model.Faculty"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update faculty</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
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
<%
Faculty f=(Faculty)request.getAttribute("faculty");
%>

<body background ="image/background.png">
	<h2>Update Faculty Details</h2>
	<hr />
	${msg }
	<form action="UpdateFacultyController" method="post">
		<table>
		 <tr>
	   <td><p>User name</p></td> <td><input type="text" value="<%=f.getUsername() %>" name="username" placeholder="Username" required />  </td>
	   </tr>
       
       <tr>
       <td><p>Password</p></td> <td><input type="password" value="<%=f.getPassword() %>" name="password" placeholder="password" required/>  </td>
       </tr>
				
		<tr>
		<td><p>Faculty Name</p></td> <td><input type="text" value="<%=f.getName() %>" name="name" placeholder="Name" />  </td>
		</tr>

        <tr>
        <td><p>Gender</p></td> <td><input type="text" value="<%=f.getGender() %>" name="gender" placeholder="Male/Female/Other" /></td>
        </tr>
        
        <tr>
        <td><p>MobNo</p></td> <td><input type="text" value="<%=f.getMobNo() %>" name="mobNo" placeholder="Mobile. no " required />  </td>
        </tr>
        
        <tr>
        <td><p>EmailId</p></td> <td><input type="text" value="<%=f.getEmailId() %>" name="emailId" placeholder="email- Id" />  </td>
        </tr>
  
        <tr>
        <td><p>Department</p></td> <td><input type="text" value="<%=f.getDepartment() %>" name="department" placeholder="department" />  </td>
        </tr>     
 
		<tr>	
		<td><p> <input type="reset" value="clear"/> 
		
		<input type="submit" value="Update"/> 
		</p></td>
		
		</tr>
</table>
	</form>
	
</body>
</html>