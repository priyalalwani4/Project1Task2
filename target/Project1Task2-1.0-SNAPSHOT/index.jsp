<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Distributed Systems Class Clicker</title>
</head>
<body>
<h2>Distributed Systems Class Clicker</h2>
<p>Submit your answer to the current question:</p>
<form action="submit" method="post">

    <input type="radio" id="optionA" name="answer" value="A">
    <label for="optionA">A</label>
    <br>

    <input type="radio" id="optionB" name="answer" value="B">
    <label for="optionB">B</label>
    <br>

    <input type="radio" id="optionC" name="answer" value="C">
    <label for="optionC">C</label>
    <br>

    <input type="radio" id="optionD" name="answer" value="D">
    <label for="optionD">D</label>
    <br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>