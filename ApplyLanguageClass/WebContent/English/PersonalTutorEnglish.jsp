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
<form name=ChooseLanguageform method="post" action="EngPrivateTutor">
<h1>Choose Personal Tutorial For English Class</h1>
<br>
Miss Ann <input type="radio" value="Miss Ann" name="ClassTutor"/><br><br>
Mr. Samual <input type="radio" value="Mr. Samual" name="ClassTutor"/><br><br>
Mrs. Arina<input type="radio" value="Mrs. Arina" name="ClassTutor"/><br><br>
Mr. Ali <input type="radio" value="Mr. Ali" name="ClassTutor"/><br><br>
Miss Janna <input type="radio" value="Miss Janna" name="ClassTutor"/><br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>