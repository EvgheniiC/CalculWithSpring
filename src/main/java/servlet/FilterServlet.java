package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/filter/*")
public class FilterServlet implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        System.out.println("Filter Servlet");

        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        HttpServletRequest req = (HttpServletRequest) servletRequest;

        String sign = req.getParameter("sign");

        PrintWriter writer = resp.getWriter();

        switch (sign) {//use regex
            case "+":
            case "-":
            case "*":
            case "/":
            case "cos":
            case "sin":
            case "tan":
            case "cotan":
            case ">":
                filterChain.doFilter(servletRequest, servletResponse);
                break;
            default:
                writer.println("Filter Servlet");

        }
    }
}
