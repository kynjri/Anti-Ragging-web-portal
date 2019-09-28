<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<title>Student Portal</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />

 <style> 
 body
{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
}
      .heading {
        width: 100%;
        padding: 50px 50;
        background-color: lightblue;
      font-family: sans-serif;
	text-align: center;
      }
    </style>
</head>

<body background= "image/background.png">
<div class="heading">
<p>  WE CARE ABOUT YOUR HAPPINESS</p>
</div>
<div class="complainbox">
       	${msg }
       <form   action="StudentComplainController"  method="post">
      
       <p>date  </p>
       <input type="text" value=" " name="dateofcomplain" placeholder="yyyy/mm/dd" required >  
       <p>student name  </p>
       <input type="text" value=" " name="studentname" >  
       <p>student roll-no </p>
       <input type="text" value=" " name="studentrollno" required  >  
       <p>complain:-</p>
       <textarea class="form-control" rows="10" id="comment" name="description" placeholder="type your complain here" ></textarea>
  <p> </p> 
        <button type="submit" class="btn btn-warning">Submit</button>
</form>
<output name="getall"> </output>
</div>
</body>
</html>