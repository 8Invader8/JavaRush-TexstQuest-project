package Controllers;

import web.AcceptService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SecondPage")
public class SecondPage extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AcceptService acceptService = new AcceptService();
        String choice = acceptService.call(req.getParameter("answer"));

        resp.setStatus(200);
        req.setAttribute("answer", choice);
        req.getRequestDispatcher(choice).forward(req,resp);
    }
}
