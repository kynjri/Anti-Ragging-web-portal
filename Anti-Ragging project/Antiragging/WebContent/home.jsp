<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>IIMT Ragging Portal</title><link rel="icon" type="image/ico" href="image/iimtlogo.jpg" />
 <style>
 body{
	margin: 0;
	padding: 0;

	background-size: cover;
	font-family: sans-serif;
}
.logo{
float:rightt;
}
.footer-main-div {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   height:auto;
   background-color:  #2e2e1f;
   color: white;
   }
   .footer-social-icons ul{
   margin: 0px;
   padding:0px;
   text-align:center;
   }
   .footer-social-icons ul li{
   display:inline-block; margin: 10px 10px;
   width:30px; height: 30px;
   border-radius:100%; background: #ccffff; 
   }
   .footer-social-icons ul li a i{  line-height:30px;}
   .footer-menu ul { text-align:center}
   .footer-menu ul li{ display:inline-block;width:90px; height: 30px;}
   .footer-info p{ float:right;}
 </style>
</head>
<body background="image/background.png">

${msg }
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
         <a class="navbar-brand" href="#"><img src="image/iimtlogo.jpg"  alt="logo" width="30" height="30"></a>
    
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="http://localhost:8081/Antiragging/home.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>
      <li ><a  href="http://localhost:8081/Antiragging/adminlogin.jsp"><span class="glyphicon glyphicon-log-in"></span> Admin </a></li>
       <li><a href="http://localhost:8081/Antiragging/facultylogin.jsp"><span class="glyphicon glyphicon-log-in"></span> Faculty</a></li>
       <li><a href="http://localhost:8081/Antiragging/studentlogin.jsp"><span class="glyphicon glyphicon-log-in"></span> Student</a></li>
     </ul>
    <ul class="nav navbar-nav navbar-right">
     <li><a href="http://localhost:8081/Antiragging/faqs.jsp"> FAQs</a></li>
      <li><a href="http://localhost:8081/Antiragging/about.jsp"><i class="material-icons">&#xe7ef;</i> About Us</a></li>
      <li><a href="http://localhost:8081/Antiragging/contact.jsp"> Contact</a></li>
    </ul>
  </div>
</nav>
             
<div class="container" >


  <div class="row">
    <div class="col-sm-12">
      <div id="my-carousel" class="carousel slide" data-ride="carousel">
     
      <!-- Indicators -->
      
      <!-- Wrapper for slides -->
       <div class="carousel-inner" role="listbox"> 

         <div class="item active"> 
        <img src="image/ragging3.jpg" alt="r2" width="400" height="250" >
        </div>
         <div class="item "> 
        <img src="image/ragging4.jpg" alt="r2" width="480" height="370" >
        </div>
          <div class="item "> 
        <img src="image/a1.jpg" alt="r2" width="480" height="370" >
        </div>
          <div class="item "> 
        <img src="image/a2.jpg" alt="r2" width="480" height="370" >
        </div>
      
       </div>
      
          <!-- Left and right controls -->
            <a class="left carousel-control" href="#my-carousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#my-carousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
          
      </div>
    </div>
  </div>
</div>



<div class="footer-main-div">
<div class="footer-social-icons">
<ul>
<li> <a href="#" ><i class="fa fa-facebook-official"> </i> </a></li>
<li> <a href="#"><i class="fa fa-twitter"> </i> </a></li>
<li> <a href="#" ><i class="fa fa-google-plus"> </i> </a></li>
<li> <a href="#" ><i class="fa fa-pinterest-square"> </i> </a></li>
<li> <a href="#" ><i class="fa fa-youtube-square"> </i> </a></li>
</ul>
</div>
 <div class="footer-menu">
<ul>
<li> <a href="#" > Blog </a></li>
<li> <a href="#"> News </a></li>
<li> <a href="#" >Media </a></li>
</ul>
</div> 

  <div class="footer-info">
 
 <p> Build and Maintained by: IIMT Ragging Cell</p >
</div> 
</div>


</body>
</html>