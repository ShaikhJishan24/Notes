<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
    <h1>Login</h1>
    <form action="loginprocess" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="uname" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="passwd" required>
        </div>
        <button type="submit">Login</button>
    </form>
    <p>${errorMessage}</p>
</body>
</html>