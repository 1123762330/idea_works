package cn.itheima.web.servlet;

import cn.itheima.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class delUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        int id = Integer.parseInt(req.getParameter("userid"));


        UserDao dao = new UserDao();
        int i = dao.del(id);

        //5.判断user
        if(i != 1){
            //登录失败
            resp.sendRedirect("error.jsp");//web页面
            //req.getRequestDispatcher("/failServlet").forward(req,resp);//服务页面
        }else{
            //登录成功
            //存储数据
            req.setAttribute("userid",id);
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