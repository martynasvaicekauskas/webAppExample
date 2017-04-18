package servlets;

import Dto.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MartynasV on 2017-04-18.
 */
@WebServlet (value = "/catInfo")
public class CatInfoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cat cat = new Cat("Pukis", "Persas", 8, 20, false);
        req.setAttribute("cat", cat);
        req.getRequestDispatcher("catinfo.jsp").forward(req,resp);
            }
}
