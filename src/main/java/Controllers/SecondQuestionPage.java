package Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import web.PageController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Not used. Waiting for accept of concept with one RedirectServlet.
@WebServlet("/second_question")
public class SecondQuestionPage extends HttpServlet {
    private final static Logger LOGGER = LoggerFactory.getLogger(SecondQuestionPage.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       LOGGER.debug("User decided correct options from second step(question).");

        PageController pageController = new PageController();
        String choice = pageController.call(req.getParameter("choice"));

        resp.setStatus(200);
        req.setAttribute("choice", choice);
        req.getRequestDispatcher(choice).forward(req,resp);
    }
}
