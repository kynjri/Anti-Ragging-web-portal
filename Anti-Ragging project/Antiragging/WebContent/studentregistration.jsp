<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Anti-Ragging Registration</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
<style>
body
{
	margin: 0;
	padding: 0;
	background-size: cover;
	font-family: sans-serif;
}</style>
</head>

<body background="image/background.png">
	<h2>Anti-Ragging Registration Form</h2>
	<hr />
		${msg }
	<form action="StudentRegistrationController" method="post">
		<table>
		
		<tr>
		<td><p>Student Name</p></td> <td><input type="text" value="" name="name" placeholder="Name" />  </td>
		</tr>

        <tr>
        <td><p>Gender</p></td> <td><input type="text" value="" name="gender" placeholder="Male/Female/other" /></td>
        </tr>
        
        <tr>
        <td><p>Nationality</p></td> <td><input type="text" value="" name="nationality" placeholder="Your Country" /></td>
        </tr>

        <tr>
        <td><p>MobNo</p></td> <td><input type="text" value="" name="mobNo" placeholder="Mobile.No" required/>  </td>
        </tr>
        
        <tr>
        <td><p>EmailId</p></td> <td><input type="text" value="" name="emailId" placeholder="email-Id" />  </td>
        </tr>

        <tr>
        <td><p>Address1</p></td> <td><input type="text" value="" name="address1" placeholder="Adress line-1" required/>  </td>
        </tr>

        <tr>
        <td><p>Address2</p></td> <td><input type="text" value="" name="address2" placeholder="Adress line-2" required/>  </td>
        </tr>

        <tr>
        <td><p>City</p></td> <td><input type="text" value="" name="city" placeholder="City" />  </td>
        </tr>
        
        <tr>
        <td><p>State</p></td> <td><input type="text" value="" name="state" placeholder="State" />  </td>
        </tr>

       <tr>
       <td><p>UG Or PG</p></td> <td><input type="text" value="" name="ugorpg" placeholder="UG/PG" />  </td>
       </tr>


       <tr>
       <td><p>Course Name</p></td> <td><input type="text" value="" name="courseName" placeholder="eg:- B.tech" />  </td>
       </tr>

       <tr>
       <td><p>Roll No</p></td> <td><input type="text" value="" name="rollNo" placeholder="Roll.no" />  </td>
       </tr>

       <tr>
       <td><p>Year Of Study</p></td> <td><input type="text" value="" name="yearOfstudy" placeholder="1/2/3..." />  </td>
       </tr>

       <tr>
       <td><p>Password</p></td> <td><input type="password" value="" name="password" placeholder="Enter password" required/>  </td>
       </tr>
		
	   <tr>
	   <td><p>User name</p></td> <td><input type="text" value="" name="userName" placeholder="Enter username" required/>  </td>
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