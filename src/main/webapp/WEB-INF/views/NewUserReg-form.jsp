<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<style>
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

<title>Login Form</title>
<meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="YOUR_CLIENT_ID.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    

<script>
function onSignIn(googleUser) {
    // Useful data for your client-side scripts:
    var profile = googleUser.getBasicProfile();
    console.log("ID: " + profile.getId()); // Don't send this directly to your server!
    console.log('First Name: ' + profile.getFirstname());
    console.log('Last Name: ' + profile.getLastname());
    console.log("Email: " + profile.getEmail());
    console.log("Phone No: " + profile.getPhoneno());
    // The ID token you need to pass to your backend:
    var id_token = googleUser.getAuthResponse().id_token;
    console.log("ID Token: " + id_token);
}

function validateForm() {
  var x = document.forms["forms"]["firstname"].firstname;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
  var y = document.forms["forms"]["lastname"].lastname;
  if (y == "") {
    alert("Name must be filled out");
    return false;
  }



var email = document.forms.Email;

if (email.value == "")

{

alert("Please enter a valid e-mail address.");

email.focus();

return false;

}

if (email.value.indexOf("@", 0) < 0)

{

window.alert("Please enter a valid e-mail address.");

email.focus();

return false;

}

if (email.value.indexOf(".", 0) < 0)

{

window.alert("Please enter a valid e-mail address.");

email.focus();

return false;

}

    if(form.pwd1.value != "" && form.pwd1.value == form.pwd2.value) {
      if(form.pwd1.value.length < 6) {
        alert("Error: Password must contain at least six characters!");
        form.pwd1.focus();
        return false;
      }
      if(form.pwd1.value == form.firstname.value) {
        alert("Error: Password must be different from Username!");
        form.pwd1.focus();
        return false;
      }
      re = /[0-9]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one number (0-9)!");
        form.pwd1.focus();
        return false;
      }
      re = /[a-z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one lowercase letter (a-z)!");
        form.pwd1.focus();
        return false;
      }
      re = /[A-Z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one uppercase letter (A-Z)!");
        form.pwd1.focus();
        return false;
      }
    } else {
      alert("Error: Please check that you've entered and confirmed your password!");
      form.pwd1.focus();
      return false;
    }

    alert("You entered a valid password: " + form.pwd1.value);
    return true;
    
    
    var phoneno = document.forms["forms"]["phoneno"];
        var phoneno = /^\d{10}$/;
      if(phoneno.value.match(phoneno))
            {
          return true;
            }
          else
            {
            alert("enter valid no");
            return false;
            }
    
  }
  
</script>
</head>

<body>
 
<form name="forms" onsubmit="return validateForm()" method="post" action ="saveNewUserReg" modelAttribute="userReg">
  FirstName: <input type="text" name="firstname"><br><br>
  LastName: <input type="text" name="lastname"><br><br>
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
  Password: <input type="password" name="password"><br><br>
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

