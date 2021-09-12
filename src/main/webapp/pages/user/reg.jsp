<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>WELCOME!!!</h1>
<h2>Please, make Registration: </h2>

<%--
<form action="/reg" method="get">
    <label for="name">Name</label>
    <input type="text" name="name" id="name"/>

    <br>

    <label for="login">Login</label>
    <input type="text" name="login" id="login"/>

    <br>

    <label for="Password">Password</label>
    <input type="text" name="password" id="password"/>

    <br>

    <button>Add person</button>
    <c:if test="${sessionScope.user == null}">
        <a href="/auth">Authorization</a>
        &lt;%&ndash;<a href="/auth">Authorization</a>&ndash;%&gt;
    </c:if>
--%>



    <div class="form-wrap">
        <div class="profile"><img src="https://html5book.ru/wp-content/uploads/2016/10/profile-image.png">
            <h1>Регистрация</h1>
        </div>
        <form action="/reg" method="post">
            <div>
                <%--@declare id="name"--%><label for="name">Имя</label>
                <input type="text" name="name" required>
            </div>

            <div>
                <%--@declare id="name"--%><label for="name">Login</label>
                <input type="text" name="login" required>
            </div>

            <div>
                <%--@declare id="name"--%><label for="name">Password</label>
                <input type="text" name="password" required>
            </div>

            <div class="radio">
                <span>Пол</span>
                <label>
                    <input type="radio" name="sex" value="мужской">мужской
                    <div class="radio-control male"></div>
                </label>
                <label>
                    <input type="radio" name="sex" value="женский">женский
                    <div class="radio-control female"></div>
                </label>
            </div>
            <div>
                <%--@declare id="email"--%><label for="email">E-mail</label>
                <input type="email" name="email" required>
            </div>
            <div>
                <%--@declare id="country"--%><label for="country">Страна</label>
                <select name="country">
                    <option>Выберите страну проживания</option>
                    <option value="Россия">Россия</option>
                    <option value="Украина">Украина</option>
                    <option value="Беларусь">Беларусь</option>
                </select>
                <div class="select-arrow"></div>
            </div>
            <button type="submit">Регистрация</button>
        </form>
    </div>

<%--</form>--%>
</body>
</html>

