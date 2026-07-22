<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Management - Login</title>
</head>
<body>
<h1>Hotel Management System - Login</h1>

<% if ("1".equals(request.getParameter("registered"))) { %>
  <p>Registration successful. You can log in now.</p>
<% } %>

<form action="LoginServlet" method="post">
  <label for="email">Email</label><br>
  <input type="email" id="email" name="email" required><br>

  <label for="password">Password</label><br>
  <input type="password" id="password" name="password" required><br>

  <button type="submit">Login</button>
</form>

<p><a href="Registration.html">Don't have an account? Register here</a></p>
</body>
</html>
