package cn.itheima.web.servlet;

import cn.itheima.dao.UserDao;
import cn.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //3.封装user对象
        User loginUser = new User();
        loginUser.setUserName(username);
        loginUser.setPassword(password);



        //4.调用UserDao的login方法
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);

        //5.判断user
        if(user == null){
            //登录失败
            String path = req.getContextPath();//此处应用到动态路径方法
            resp.sendRedirect(path+"error.jsp");//web页面
            //req.getRequestDispatcher("/failServlet").forward(req,resp);//服务页面
        }else{
            //登录成功
            //存储数据
            req.setAttribute("username",username);
           /* resp.sendRedirect("success.jsp");//web页面*/
            //转发
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
