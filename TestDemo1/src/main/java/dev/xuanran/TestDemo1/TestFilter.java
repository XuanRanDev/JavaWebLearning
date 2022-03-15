package dev.xuanran.TestDemo1;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created By XuanRan on 2022/3/7
 */
//@WebFilter(filterName = "FilterDemo01", urlPatterns = { "/*" })
class TestFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        PrintWriter writer = res.getWriter();
        writer.write("Filter已拦截请求");
        super.doFilter(req,res,chain);
    }
}
