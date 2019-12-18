package cn.itheima.web.servlet;

import cn.itheima.dao.UserDao;
import cn.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");

        int userId = Integer.parseInt(req.getParameter("Id"));
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(userId,userName,password);

        UserDao dao1 = new UserDao();
        int i = dao1.update(user);

        //5.判断user
        if(i != 1){
            //修改失败
            resp.sendRedirect("error.jsp");//web页面
            //req.getRequestDispatcher("/failServlet").forward(req,resp);//服务页面
        }else{
            //登录成功
            //存储数据
           /* resp.sendRedirect("success.jsp");//web页面*/
            //转发
            req.getRequestDispatcher("allUser.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
