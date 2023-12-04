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

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    private final static Logger LOGGER = LoggerFactory.getLogger(RedirectServlet.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("Redirect from Main page to next!");

        PageController pageController = new PageController();
        String choice = pageController.call(req.getParameter("choice"));
        resp.sendRedirect(choice);
    }
}
