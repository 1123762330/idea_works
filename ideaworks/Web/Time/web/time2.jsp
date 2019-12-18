<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="com.itheima.util.CookieUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示访问时间优化</title>
</head>
<body>
<%
    //1.获取所有的Cookie
    Cookie[] cookies = request.getCookies();
    //2.调用工具类
    Cookie cookie = CookieUtils.getCookie(cookies, "lastTime");
    if (cookie != null) {//判断cookie是否为空
        String value = cookie.getValue();
        value= URLDecoder.decode(value, "utf-8");
%>
    <h1>欢迎回来,你上次访问的时间为:<%=value%></h1>
<%
    }else {
%>
        <h1>你好,欢迎你首次登陆!</h1>
<%
    }
%>
</body>
</html>
