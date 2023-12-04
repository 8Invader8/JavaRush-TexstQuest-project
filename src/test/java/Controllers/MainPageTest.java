package Controllers;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;



class MainPageTest {

    @Test
//    @Disabled
    void isFirstChoiceReturnCorrectPage() throws ServletException, IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);

        Mockito.when(request.getParameter("choice")).thenReturn("FirstQuestion.jsp");
        Mockito.when(request.getRequestDispatcher("/Main.jsp")).thenReturn(requestDispatcher);


        MainPage mainPage = new MainPage();
        mainPage.doGet(request, response);

        Mockito.verify(request, Mockito.times(1)).getParameter("choice");
        Mockito.verify(request, Mockito.times(1)).setAttribute("choice", "FirstQuestion.jsp");
        Mockito.verify(request, Mockito.times(1)).getRequestDispatcher("/Main.jsp");

        Mockito.verify(requestDispatcher, Mockito.times(1)).forward(request, response);
    }
}