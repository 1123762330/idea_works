//package com.itheima.web.filter;
//
//import com.alibaba.druid.support.http.WebStatFilter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///*完成登录验证的过滤器*/
//@WebFilter("/*")
//public class LoginFilter implements Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        //首先强转
//        HttpServletRequest request = (HttpServletRequest) req;
//        //1.获取资源请求的路径
//        String uri = request.getRequestURI();
//        //2.判断是否包含登录相关资源路径
//        if (uri.contains("/index.jsp") || uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/js/")
//                || uri.contains("/fonts/") || uri.contains("/checkCodeServlet")) {
//            //包含这些,允许通过
//            chain.doFilter(req, resp);
//        } else {
//            //不包含,需要验证用户是否登陆
//            //3.获取session中的user
//            Object user = request.getSession().getAttribute("user");
//            if (user != null) {
//                //用户登录了,通过
//                chain.doFilter(req, resp);
//            } else {
//                //没有登录,跳转登录页面
//                request.setAttribute("login_msg", "你还没有登录,请登录!");
//                request.getRequestDispatcher("/index.jsp").forward(req, resp);
//            }
//        }
//
//
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
