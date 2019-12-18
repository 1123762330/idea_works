package cn.itheima.web.servlet;

import cn.itheima.dao.UserDao;
import cn.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/regeistServlet")
public class RegeistServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //指定编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");
        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //3.封装user对象
        User regUser = new User();
        regUser.setUserName(username);
        regUser.setPassword(password);

        PrintWriter out = response.getWriter();

        UserDao dao = new UserDao();
        int count = dao.register(regUser);
        if(count==1){
            out.print("注册成功！");
        }
        else{
            out.print("注册失败！");
        }
    }

}