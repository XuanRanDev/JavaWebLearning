package dev.xuanran.servletlogin.ServletLoginDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created By XuanRan on 2022/3/21
 */
@WebServlet(value = "/login",name = "loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        if (map == null) {
            resp.setStatus(500);
            return;
        }
        if (map.get("userName")[0].equals("admin") && map.get("password")[0].equals("123456")){
            req.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("/WEB-INF//loginError.jsp").forward(req,resp);
            System.out.println("账户：" + map.get("userName")[0]);
            System.out.println("密码：" + map.get("password")[0]);
        }
    }
}
