<%@ page import="static web.AppController.STEP_1_FIRST_OPTION" %>
<%@ page import="static web.AppController.STEP_1_SECOND_OPTION" %>
<%@ page  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
    <body>
        <h1>Wellcome to Text Journey</h1>
        <h2>Text Quest</h2>
        <hr>
        <br>
        <form action="Redirect" method="post">
            <label for="choice">Choose the options:</label>
            <br>

            <input type="radio" name="choice" value="FirstPage" id="choice"><%=STEP_1_FIRST_OPTION%><br>
            <input type="radio" name="choice" value="SecondPage" id="choice"><%=STEP_1_SECOND_OPTION%><br>
            <input type="submit" value="Enter">
        </form>
    </body>
</html>
