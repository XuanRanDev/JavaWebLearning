<%@ page import="javax.naming.Context" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
      <%
        String id = request.getSession().getId();
        // 进行注入
        request.getServletContext().setAttribute("SessionID",id);
      %>
    </head>
    <body>
      <h1><%= "Hello World!" %>
        </h1>
        <br/>
        <p>这是Tomcat服务器JSP页面首页，可点击以下页面跳转到相应的Servlet页面</p>
        <a href="hello-servlet">HelloServlet(注解方式）</a>
        <br>
        <a href="helloServlet2">HelloServlet2(XML映射方式）</a>
        <br>

        <a href="helloServlet3">HelloServlet3(XML映射方式）</a>
    </body>
</html>