<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Add Student</title>
</head>
<body>

<form action="AddServlet" method="post">

    Enter Student Name:
    <input type="text" name="name" required><br><br>

    Enter Student Address:
    <input type="text" name="address" required><br><br>

    Select Persistence Store:
    <select name="store">
        <option value="file">File</option>
        <option value="db">Database</option>
    </select>

    <br><br>
    <input type="submit" value="Submit">

</form>

</body>
</html>
