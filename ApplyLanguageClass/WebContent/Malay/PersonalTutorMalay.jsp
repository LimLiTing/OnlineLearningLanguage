<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form
{
border: 5px solid;
background-color: #a2b9bc;
padding: 50px;
margin: 100px; 
width: 500px;
height: 600px;
}
h1
{
color: white; 
text-align: center;
}
body
{
background-image: url("img/Background.jpg");
}
</style>
</head>
<body>
<form name=ChooseLanguageform method="post" action="MlyPrivateTutor">
<h1>Choose Personal Tutorial For Malay Class</h1>
<br>
Mr. Gopal <input type="radio" value="Mr. Gopal" name="ClassTutor"/><br><br>
Mrs. Siti <input type="radio" value="Mrs. Siti" name="ClassTutor"/><br><br>
Mr. Ahmad <input type="radio" value="Mr. Ahmad" name="ClassTutor"/><br><br>
Mrs. Farah <input type="radio" value="Mrs. Farah" name="ClassTutor"/><br><br>
Miss Azizah <input type="radio" value="Miss Azizah" name="ClassTutor"/><br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>