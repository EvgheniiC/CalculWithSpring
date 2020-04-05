package servlet;

import com.evghenii.Geometry;
import com.evghenii.Mathematician;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/filter/mathe")
public class MatheServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Mathematician mathematician = new Mathematician();

        Geometry geometry = new Geometry();

        String sign = req.getParameter("sign");

        int number1 = Integer.parseInt(req.getParameter("number1"));

        int result;

        PrintWriter writer = resp.getWriter();

        writer.println("Mathe Servlet");

        switch (sign) {
            case "cos":
                result = (int) geometry.cos(number1);
                writer.println(sign + " " + number1 + " " + " = " + result);
                break;
            case "sin":
                result = (int) geometry.sin(number1);
                writer.println(sign + " " + number1 + " " + " = " + result);
                break;
            case "sqrt":
                result = (int) mathematician.sqrt(number1);
                writer.println(sign + " " + number1 + " " + " = " + result);
                break;
            default:
                writer.println("FALSE SIGN");

        }
    }
}
