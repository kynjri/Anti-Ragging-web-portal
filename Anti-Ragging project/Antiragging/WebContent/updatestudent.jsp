<%@page import="com.iimt.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
<style>
body
{
	margin: 0;
	padding: 0;
	background-size: cover;
	font-family: sans-serif;
}</style>
</head>

<%
Student s=(Student)request.getAttribute("student");
%>
<body background="image/background.png">
	<h2>Update Student Details</h2>
	<hr />
		${msg }
	<form action="UpdateStudentController" method="post">
		<table>
		
		<tr>
		<td><p>Student Name</p></td> <td><input type="text" value="<%=s.getName() %>" name="name" placeholder="Name" />  </td>
		</tr>

        <tr>
        <td><p>Gender</p></td> <td><input type="text" value="<%= s.getGender() %>" name="gender" placeholder="Male/Female/other" /></td>
        </tr>
        
        <tr>
        <td><p>Nationality</p></td> <td><input type="text" value="<%= s.getNationality() %>" name="nationality" placeholder="Your Country" /></td>
        </tr>

        <tr>
        <td><p>MobNo</p></td> <td><input type="text" value="<%=s.getMobNo() %>" name="mobNo" placeholder="Mobile.No" required/>  </td>
        </tr>
        
        <tr>
        <td><p>EmailId</p></td> <td><input type="text" value="<%=s.getEmailId() %>" name="emailId" placeholder="email-Id" />  </td>
        </tr>

        <tr>
        <td><p>Address1</p></td> <td><input type="text" value="<%=s.getAddress1() %>" name="address1" placeholder="Adress line-1" required/>  </td>
        </tr>

        <tr>
        <td><p>Address2</p></td> <td><input type="text" value="<%=s.getAddress2() %>" name="address2" placeholder="Adress line-2" required/>  </td>
        </tr>

        <tr>
        <td><p>City</p></td> <td><input type="text" value="<%=s.getCity() %>" name="city" placeholder="City" />  </td>
        </tr>
        
        <tr>
        <td><p>State</p></td> <td><input type="text" value="<%=s.getState() %>" name="state" placeholder="State" />  </td>
        </tr>

       <tr>
       <td><p>UG Or PG</p></td> <td><input type="text" value="<%=s.getUgorpg() %>" name="ugorpg" placeholder="UG/PG" />  </td>
       </tr>


       <tr>
       <td><p>Course Name</p></td> <td><input type="text" value="<%=s.getCourseName() %>" name="courseName" placeholder="eg:- B.tech" />  </td>
       </tr>

       <tr>
       <td><p>Roll No</p></td> <td><input type="text" value="<%=s.getRollNo() %>" name="rollNo" placeholder="Roll.no" />  </td>
       </tr>

       <tr>
       <td><p>Year Of Study</p></td> <td><input type="text" value="<%=s.getYearOfstudy() %>" name="yearOfstudy" placeholder="1/2/3..." />  </td>
       </tr>

       <tr>
       <td><p>Password</p></td> <td><input type="password" value="<%=s.getPassword() %>" name="password" placeholder="Enter password" required/>  </td>
       </tr>
		
	   <tr>
	   <td><p>User name</p></td> <td><input type="text" value="<%=s.getUserName() %>" name="userName" placeholder="Enter username" required/>  </td>
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