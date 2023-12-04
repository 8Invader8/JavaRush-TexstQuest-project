<%@ page import="static web.AppConstants.STEP_2_FIRST_OPTION" %>
<%@ page import="static web.AppConstants.STEP_2_SECOND_OPTION" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First Page</title>
</head>
    <body>
    <p>You decided to stay and see what this tha place.
        Then you`ve saw that the light starting be a little bit closer and closer...
        Stay in. The Story will continue soon.
    </p>

    <form action="second_question" method="post">
        <label for="choice">Choose the options:</label>
        <br>
        <input type="radio" name="choice" value="SecondQuestion.jsp" id="choice"><%=STEP_2_FIRST_OPTION%><br>
        <input type="radio" name="choice" value="losePage.jsp" id="choice"><%=STEP_2_SECOND_OPTION%><br>
        <input type="submit" value="Enter">
    </form>

    </body>
</html>
