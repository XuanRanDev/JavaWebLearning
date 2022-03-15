package dev.xuanran.TestDemo1;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
@WebInitParam(name = "Test",value = "XuanRan")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
        System.out.println("HelloServlet被初始化,初始化参数为：" +
                getServletConfig().getInitParameter("Test"));

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        System.out.println("HelloServlet接收到了请求,请求参数为：   " + request.getParameter("username"));

    }

    public void destroy() {
        System.out.println("服务器被关闭");
    }
}