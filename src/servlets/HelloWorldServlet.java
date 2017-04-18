package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MartynasV on 2017-04-18.
 */
@WebServlet (value = "/helloWorld")
public class HelloWorldServlet extends HttpServlet {
// desini peles mygtukas -> Generate ir pasirinkti Override.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = "Dar karta labas";
        req.setAttribute("vardasLocalus", text);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

       // resp.getWriter().println("Labukas :("); // taip niekas nebedaro
           }
}
