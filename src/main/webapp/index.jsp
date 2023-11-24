
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Text Quest</title>

</head>

    <body>
        <h1>Text Quest</h1>
        <hr>
        <br>
        <div>
            <form action="Redirect" method="post">
                <label for="choice">Choose the options</label>
                <br>

<%--                v0.2--%>
                <input type="radio" name="choice" value="FirstPage" id="choice">First Option<br>
                <input type="radio" name="choice" value="Main" id="choice">Second Option<br>
                <input type="submit" value="Enter">
            </form>
        </div>
    </body>

</html>
