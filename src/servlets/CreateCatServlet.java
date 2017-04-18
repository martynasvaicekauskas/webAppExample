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
@WebServlet (value = "/createCat")
public class CreateCatServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String catName = req.getParameter("catName");
        String catKind = req.getParameter("catKind");
        int catAge = Integer.parseInt(req.getParameter("catAge"));
        double catWeight = Double.parseDouble(req.getParameter("catWeight"));
        boolean likeMilk = Boolean.getBoolean(req.getParameter("likeMilk"));
        Cat cat = new Cat(catName, catKind,catAge,catWeight,likeMilk);
        req.setAttribute("cat", cat);
        req.getRequestDispatcher("catinfo.jsp").forward(req,resp);
    }
}
