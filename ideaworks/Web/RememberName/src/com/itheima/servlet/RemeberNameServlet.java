package com.itheima.servlet;

import com.itheima.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/remeberNameServlet")
public class RemeberNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应类型和编码
        response.setContentType("text/html;charset=UTF-8");
        //获取输出流对象
        PrintWriter out = response.getWriter();

        Cookie[] cs = request.getCookies();
        Cookie cookie = CookieUtils.getCookie(cs, "username");
        String username = "";
        String checked = "";

        if (cookie != null) {
            username = cookie.getValue();
            checked = "checked = 'checked'";
        }

        out.println("<html>");
        out.println("<head>");
        out.println("<title>登录页面</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='/loginServlet' method='post'>");
        out.println("用户名:<input type='text' name='username' value='"+username+"' />");
        out.println("<br />");
        out.println("密码:<input type='text' name='password' />");
        out.println("<br />");
        out.println("<input type='submit' value='登录' />");
        out.println("<input type='checkbox' name='remember' value='1'"+checked+" />记住用户名");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
