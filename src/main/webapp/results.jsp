<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Distributed Systems Class Clicker</title>
</head>
<body>
<h2>Distributed Systems Class Clicker</h2>
<p>The results from the survey are as follows:</p>
<ul>
    <% for (String option : options) { %>
    <li><%= option %>: <%= results.get(option) %></li>
    <% } %>
</ul>
</body>
</html>
