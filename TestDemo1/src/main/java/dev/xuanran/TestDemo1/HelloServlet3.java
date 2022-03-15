package dev.xuanran.TestDemo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created By XuanRan on 2022/3/7
 */
public class HelloServlet3 extends HttpServlet {
    public static final String FILE_CONFIG_PATH = "/config.properties";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8;");
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(FILE_CONFIG_PATH);
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Servlet3" + "</h1>");
        out.println("<hr>");
        out.println("<b>" + "正在准备遍历Properties文件" + "</b>");

        // 遍历文件集合
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        out.println("<ul>");
        for (Map.Entry<Object, Object> entry : entries) {
            out.println("<li>" + entry.getKey().toString() + " : " + entry.getValue().toString() + "</li>");
        }
        out.println("</ul>");

        out.println("<b>" + "遍历完成" + "</b>");
        out.println("</body></html>");
        out.println("<hr>");

    }

}
