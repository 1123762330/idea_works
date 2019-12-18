package com.itheima.servlet;

import com.itheima.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieTimeServlet2")
public class CookieTimeServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //设置编码
            response.setContentType("text/html;charset=utf-8");
            //1.获取所有的Cookie
            Cookie[] cookies = request.getCookies();
            //2.调用工具类
            Cookie cookie = CookieUtils.getCookie(cookies, "lastTime");
            if (cookie != null) {//判断cookie是否为空
                String value = cookie.getValue();
                value= URLDecoder.decode(value, "utf-8");
                response.getWriter().write("<h1>欢迎回来,你上次访问的时间为:" + value + "</h1>");
            }else {
                response.getWriter().write("<h1>你好,欢迎你首次登陆!</h1>");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
