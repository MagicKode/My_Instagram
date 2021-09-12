<%--
  Created by IntelliJ IDEA.
  User: DZ
  Date: 15.08.2021
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Please, ente New password: </h2>

<form action="/updatePassword" method="post">
    <div>
        <%--@declare id="name"--%><label for="name">Password</label>
        <input type="text" name="password" required>
    </div>
    <button type="submit">Обновить</button>
</form>

</body>
</html>
