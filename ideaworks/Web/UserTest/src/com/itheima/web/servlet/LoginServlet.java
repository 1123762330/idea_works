package com.itheima.web.servlet;



import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.AdminUser;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        //3.封装user对象
        AdminUser adminUser = new AdminUser();
        adminUser.setUserName(username);
        adminUser.setPassword(password);
        //4.调用login登陆方法
        UserService service = new UserServiceImpl();
        AdminUser user = service.login(adminUser);

        //先判断验证码是否正确
        //先获取生成的验证码
        HttpSession session = req.getSession();
        String checkCode_session = (String) session.getAttribute("CHECKCODE_SERVER");
        //删除session中存储的验证码
        session.removeAttribute("CHECKCODE_SERVER");
        //在判断验证码是否正确
        if (checkCode_session != null && checkCode_session.equalsIgnoreCase(checkCode)) {
            //忽略大小写,验证码正确,判断用户名和密码是否正确
            if (user!=null) {
                //登陆成功,存储信息,
                session.setAttribute("username", username);
                //重定向到success.jsp页面
                resp.sendRedirect(req.getContextPath() + "/success.jsp");
            } else {
                req.setAttribute("login_msg", "用户名或密码错误");
                req.getRequestDispatcher("/index.jsp").forward(req, resp);
            }
        } else {
            //验证码不一样
            req.setAttribute("login_msg", "验证码错误");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
