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
<form name=ChooseLanguageform method="post" action="ChnPrivateTutor">
<h1>Choose Personal Tutor For Chinese Class</h1>
<br>
Miss Lee <input type="radio" value="Miss Lee" name="ClassTutor"/><br><br>
Mr. Wang <input type="radio" value="Mr. Wang" name="ClassTutor"/><br><br>
Mrs. Lai <input type="radio" value="Mrs. Lai" name="ClassTutor"/><br><br>
Mr. Lim <input type="radio" value="Mr. Lim" name="ClassTutor"/><br><br>
Miss Tan <input type="radio" value="Miss Tan" name="ClassTutor"/><br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>