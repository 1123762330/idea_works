package com.itheima.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理乱码问题
        response.setContentType("application/json;charset=utf-8");
        //获取用户提交过来的用户名
        String username = request.getParameter("username");
        //创建一个map集合
        Map<String, Object> map = new HashMap<>();
        //判断有没有这个用户名
        if("张三".equals(username)){
            map.put("msg","用户名已经被占用");
        }else{
            map.put("msg","用户名可以注册");
        }
        //将map转成json,并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
