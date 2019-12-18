package cn.itheima.web.servlet;

import cn.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getAttribute("user");
        if(user!=null){
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("登陆成功!"+user.getUserName()+",欢迎您");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
