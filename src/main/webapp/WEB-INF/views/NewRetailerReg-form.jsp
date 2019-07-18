<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<meta name="keywords" content="Key Login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body
{
 background-image:url("<c:url value='/resources/images/retailerbg.jpg'/>");
 background-size:cover;
 background-attachment:fixed;
 
}
:root {
	--primary-c: #2196F3;
	--secondary-c: #B2D7F5;
	
	--white: #FDFBFB;
	
	--text: #082943;	
	--bg: var(--primary-c);
}


/* Basic Config
–––––––––––––––––––––––––––––––––––––––––––––––––– */
html, body {
	height: 100%;
	padding: 0;
	margin: 0;
}

body {
  background-color: var(--bg);
  display: flex;
  justify-content: center;
  align-items: center;
	font-family: 'Raleway', sans-serif;
	color: var(--text);
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
}

ul {
	list-style-type: none;
	padding-left: 50px;
	margin: 0;
}

li {
	display: block;
	position: relative;
	padding: 20px 0px;
}

h2 {
	margin: 10px 0;
	font-weight: 900;
}


/* Card
–––––––––––––––––––––––––––––––––––––––––––––––––– */
.card {
	display: flex;
	flex-direction: column;	
	background: var(--white);
	width: 300px;
	padding: 20px 25px;
	border-radius: 20px;
	box-shadow: 0 19px 38px rgba(0, 0, 0, 0.13);
}


/* Radio Button
–––––––––––––––––––––––––––––––––––––––––––––––––– */
input[type=radio] {
	position: absolute;
	visibility: hidden;
}

label { 
	cursor: pointer; 
	font-weight: 400;
}

.check {
	width: 30px; height: 30px;
	position: absolute;
	border-radius: 50%;
	transition: transform .6s cubic-bezier(0.68, -0.55, 0.27, 1.55);
}

/* Reset */
input#one ~ .check { 
	transform: translate(-50px, -25px); 
	background: var(--secondary-c); 
	box-shadow: 0 6px 12px rgba(33, 150, 243, 0.35);
}
input#two ~ .check { 
	transform: translate(-50px, -83px); 
	background: var(--primary-c);
	box-shadow: 0 6px 12px rgba(33, 150, 243, 0.35);
}



/* Radio Input #1 */
input#one:checked ~ .check { transform: translate(-50px, 33px); }

/* Radio Input #2  */
input#two:checked ~ .check { transform: translate(-50px, -35px); }


</style>
  <link href="<c:url value="/resources/css/retailer.css" />" rel="stylesheet">
  
</head>
<body>

<form name="forms"  method="post" action ="saveNewRetailerReg" modelAttribute="retailerReg">
Name: <input type="text" name="rname" pattern="[a-zA-Z0-9]+" required/><br><br>
  Gender:
  <ul>
		<li>
			<input type="radio" name="gender" id="one" value="Male"/>
			<label for="one">Male</label>
			
			<div class="check"></div>
		</li>
		
		<li>
			<input type="radio" name="gender" id="two" value="Female"/>
			<label for="two">Female</label>
			
			<div class="check"></div>
		</li>
		
	</ul>
   Password: <input type="password" name="password" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" required/><br><br>
  Email: <input type="email" name="email"><br><br>
  AddressLine1: <p><input type="text" name="addressLine1"></p><br><br>
 	City: <input type="text" name="city"><br><br>
 	State: <input type="text" name="state"><br><br>
 	Country: <input type="text" name="country"><br><br>
  Pincode: <input type="number" name="pincode"><br><br>
   <input type="submit" value="Submit">
  



</form>

</body>
</html>