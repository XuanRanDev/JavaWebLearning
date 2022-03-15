package dev.xuanran.TestDemo1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.UnresolvedAddressException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By XuanRan on 2022/3/7
 */
public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = getServletConfig().getInitParameter("username");
        ServletContext context = getServletContext();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Servlet2" + "</h1>");
        out.println("<p>" + "Config初始化参数为：" + username  + "</p>");
        out.println("<p>" + "Context初始化参数为：" + context.getInitParameter("Blog")  + "</p>");
        out.println("<p>" + "Context域中SessionID为为：" + context.getAttribute("SessionID")  + "</p>");
        out.println("<p>" + "Servlet名称为：" + getServletConfig().getServletName()  + "</p>");
        out.println("<p>" + "请求URL为：" + request.getRequestURI()  + "</p>");
        out.println("<p>" + "当前时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "</p>");
        out.println("</body></html>");

        System.out.println();
    }

}
