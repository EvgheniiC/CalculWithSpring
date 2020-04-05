package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DispatcherSevlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sign = req.getParameter("sign");

        PrintWriter writer = resp.getWriter();

//        req.getServletContext().getRequestDispatcher("/filter").forward(req, resp);

        ServletContext context = req.getServletContext();
        switch (sign) {
            case "+":
            case "-":
            case "*":
            case "/":
                context.getRequestDispatcher("/basis").forward(req, resp);
                break;
            case "cos":
            case "sin":
            case "tan":
            case "cotan":
                context.getRequestDispatcher("/mathe").forward(req, resp);
                break;
            case ">":
                context.getRequestDispatcher("/programm").forward(req, resp);
                break;

        }
    }




  /*  @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Operation operation = new Operation();

        int number1 = Integer.parseInt(req.getParameter("number1"));

        String sign = req.getParameter("sign");

        int number2 = Integer.parseInt(req.getParameter("number2"));

        int result;

        PrintWriter writer = resp.getWriter();

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

        }*/

       /* BufferedReader reader = req.getReader();
        Gson gson = new Gson();

        Operation operation = gson.fromJson(reader,Operation.class);
*/

}
