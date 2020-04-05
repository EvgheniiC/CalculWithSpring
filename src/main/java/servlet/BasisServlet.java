package servlet;

import com.evghenii.Operation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/filter/basis")
public class BasisServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Operation operation = new Operation();

        String sign = req.getParameter("sign");

        int number1 = Integer.parseInt(req.getParameter("number1"));

        int number2 = Integer.parseInt(req.getParameter("number2"));

        int result;

        PrintWriter writer = resp.getWriter();

        writer.println("Basis Servlet");

        switch (sign) {
            case "+":
                result = operation.add(number1, number2);
                writer.println(number1 + " " + sign + " " + number2 + " " + "= " + result);
                break;
            case "-":
                result = operation.minus(number1, number2);
                writer.println(number1 + " " + sign + " " + number2 + " " + "= " + result);
                break;
            case "*":
                result = operation.miltipl(number1, number2);
                writer.println(number1 + " " + sign + " " + number2 + " " + "= " + result);
                break;
            case "/":
                result = operation.div(number1, number2);
                writer.println(number1 + " " + sign + " " + number2 + " " + "= " + result);
                break;
            default:
                writer.println("FALSE SIGN");

        }
    }
}
