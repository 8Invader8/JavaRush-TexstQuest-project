
<%@ page import="static web.AppConstants.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>This decision was right!</h1>
<p>Next question!</p>
<br>
<form action="third_question" method="post">
    <label for="choice">Choose the options:</label>
    <br>
    <input type="radio" name="choice" value="ThirdQuestion.jsp" id="choice"><%=STEP_3_FIRST_OPTION%><br>
    <input type="radio" name="choice" value="losePage.jsp" id="choice"><%=STEP_3_SECOND_OPTION%><br>
    <input type="submit" value="Enter">
</form>
</body>
</html>
