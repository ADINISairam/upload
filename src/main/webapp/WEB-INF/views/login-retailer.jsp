<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<meta name="keywords" content="Key Login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">

<style>
body
{
 background-image:url("<c:url value='/resources/images/4.jpg'/>");
 background-size:cover;
 background-attachment:fixed;
 
}

img{
	height: 20%;
	width: 20%;
}
p{
	color:red;
}
.dropbtn {
  background-color: #ccc;
  color: transparent;
  padding: 16px;
  font-size: 16px;
  border: none;
}
.drop {
  background-color: #ccc;
  color: transparent;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: transparent;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
.dropdown {
  display: none;
  position: absolute;
  background-color: transparent;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}
.dropdown a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}
.dropdown-content a:hover {background-color: transparent; }

.dropdown a:hover {background-color: transparent; }

.links:hover .dropdown-content {display: block;}

.links:hover .dropdown{display: block;}

.links:hover .dropbtn {background-color: transparent;}

.links:hover .drop {background-color: transparent;}
</style>
<script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
            
        }
    </script>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
      <link href="<c:url value="/resources/css/font-awesome.min.css" />" rel="stylesheet">
    
    
   
    <!-- //Font-Awesome-File-Links -->
	
	<!-- Google fonts -->
	
	 <link href="<c:url value="//fonts.googleapis.com/css?family=Quattrocento+Sans:400,400i,700,700i" />" rel="stylesheet">
	 <link href="<c:url value="//fonts.googleapis.com/css?family=Mukta:200,300,400,500,600,700,800" />" rel="stylesheet">
<%-- 	<body background="<c:url value='/resources/images/bg.jpg'/>"rel="images"> --%>
	<!-- Google fonts -->

</head>
<body>
<section class="main">
	
		<div class="content-w3ls">
			<div class="text-center icon" >
				<span class="fa fa-html5"></span>
			</div>
			
			<div class="content-bottom">
				
	<form action="loginRetailer" name="forms" method="post"   modelAttribute="retailer">
					<div class="field-group">
						<span class="fa fa-user" aria-hidden="true"></span>
						<div class="wthree-field">
							<input name="email" id="email" type="text" value="" path="email" placeholder="email" required>
						</div>
					</div>
					<div class="field-group">
						<span class="fa fa-lock" aria-hidden="true"></span>
						<div class="wthree-field">
							<input name="password" id="password" type="Password" path="password" placeholder="password">
						</div>
					</div>
					
					<div class="wthree-field">
						<button type="submit" class="btn">Login</button>
					</div>
					<div style="color: red">${error}</div>
					<ul class="list-login">
						<li class="switch-agileits">
							<label class="switch">
								<input type="checkbox">
								<span class="slider round"></span>
								keep Logged in
							</label>
						</li>
						<li>
							<a href="#" class="text-right">forgot password?</a>
						</li>
						<li class="clearfix"></li>
					</ul>
					
				</form>
			</div>
		</div>
		
    </div>
</section>


</body>
</html>