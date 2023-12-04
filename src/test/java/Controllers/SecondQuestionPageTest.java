package Controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class SecondQuestionPageTest {

    @Test
    void doPost() throws ServletException, IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);

        Mockito.when(request.getParameter("choice")).thenReturn("ThirdQuestion.jsp");
        Mockito.when(request.getRequestDispatcher(Mockito.anyString())).thenReturn(requestDispatcher);


        SecondQuestionPage secondQuestionPage = new SecondQuestionPage();
        secondQuestionPage.doPost(request, response);

        Mockito.verify(request, Mockito.times(1)).getParameter("choice");
        Mockito.verify(request, Mockito.times(1)).setAttribute(Mockito.eq("choice"), Mockito.anyString());
        Mockito.verify(request, Mockito.times(1)).getRequestDispatcher("ThirdQuestion.jsp");

        Mockito.verify(requestDispatcher, Mockito.times(1)).forward(request, response);

    }
}