package servlet;

import com.evghenii.Programmer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/filter/programm")
public class ProgrammerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Programmer programmer = new Programmer();

        int number1 = Integer.parseInt(req.getParameter("number1"));

        int number2 = Integer.parseInt(req.getParameter("number2"));

        String result;

        PrintWriter writer = resp.getWriter();

        writer.println("Programm Servlet");

        switch (number2) {
            case 2:
                result = programmer.transferTo2(number1);
                writer.println(number1 + " -> " + number2 + " " + " = " + result);
                break;
            case 8:
                result = programmer.transferTo8(number1);
                writer.println(number1 + " -> " + number2 + " " + " = " + result);
                break;
            case 16:
                result = programmer.transferTo16(number1);
                writer.println(number1 + " -> " + number2 + " " + " = " + result);
                break;
            default:
                writer.println("FALSE SIGN");

        }
    }
}
