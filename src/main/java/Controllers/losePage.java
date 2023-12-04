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

@WebServlet("/losePage")
public class losePage extends HttpServlet {
    private final static Logger LOGGER = LoggerFactory.getLogger(losePage.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("User lose the quest.");

        PageController pageController = new PageController();
        String choice = pageController.call(req.getParameter("answer"));

        resp.setStatus(200);
        req.setAttribute("answer", choice);
        req.getRequestDispatcher(choice).forward(req,resp);
    }
}
