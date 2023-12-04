<%@ page import="static web.AppConstants.STEP_1_FIRST_OPTION" %>
<%@ page import="static web.AppConstants.STEP_1_SECOND_OPTION" %>
<%@ page  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Text Quest</title>
</head>
    <body>

        <p>You in the empty place besides nothing. You in the middle of nowhere.
        You think that world is empty and nothing can happen with you. But why are you here?
        Why are the nothing happened and world so empty?
        You were so confused! You don`t even catch, that in far distance from you was shining little light.
        </p>
        <hr>
        <br>
        <form action="first_question" method="post">
            <label for="choice">Choose the options:</label>
            <br>
            <input type="radio" name="choice" value="FirstQuestion.jsp" id="choice"><%=STEP_1_FIRST_OPTION%><br>
            <input type="radio" name="choice" value="losePage.jsp" id="choice"><%=STEP_1_SECOND_OPTION%><br>
            <input type="submit" value="Enter">
        </form>
    </body>
</html>
