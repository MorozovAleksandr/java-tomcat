package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calc", urlPatterns = "/calc")
public class OperationServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("INIT");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Double num1 = Double.parseDouble(req.getParameter("num1"));
        final Double num2 = Double.parseDouble(req.getParameter("num2"));

        resp.getWriter().println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));

        req.getServletContext().setAttribute("num1", num1);
        req.getServletContext().getAttribute("num1");

        req.getSession().setAttribute("num2", num2);

        String message = (String) req.getAttribute("message");
    }
}
