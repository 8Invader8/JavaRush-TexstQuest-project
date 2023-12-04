package Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/main")
public class MainPage extends HttpServlet {
    private final static Logger LOGGER = LoggerFactory.getLogger(MainPage.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.warn("User on Main page.");

        String message = req.getParameter("choice");
        req.setAttribute("choice", message);
        req.getRequestDispatcher("/Main.jsp").forward(req,resp);
    }

}