<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function myFunction() {
  alert("Submitted!");
}
</script>
</head>
<body>

<h2>ADD PRODUCTS</h2>

<table style="width:100%">
  <tr>
    <th>Product Name</th><td><input type="text" value=></td>
   
  </tr>
<tr>
    <th>Product Description</th><td><input type="text" value=></td>
</tr>
    <tr>
    <th>Product Image</th><td><input type="text" value=></td>
   
  </tr>
  <tr>
    <th>Product Price</th><td><input type="text" value=></td><br><br>

	</tr>
  <tr>
    <th>Photo</th><input type="file" name="photo"></td><br><br>

</tr>

</table>
<button onclick="myFunction()">Submit</button>


</body>
</html>