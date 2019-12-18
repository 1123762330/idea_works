<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示访问时间</title>
</head>
<body>
<%
    //1.获取所有的Cookie
    Cookie[] cookies = request.getCookies();
    boolean flag = false;//设置一个标记
    //遍历cookie数组,并判断有没有需要的那个cookie
    if (cookies != null && cookies.length > 0) {//判断cookies是否为空
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("lastTime")) {//如果有,那就不是第一次访问
                flag = true;//修改标记为有的状态
                //设置Cookie的value
                //获取当前时间的字符串
                Date date = new Date();
                //设置时间字符串格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                String str_date = sdf.format(date);
                System.out.println("编码前"+str_date);
                //URL编码
                str_date = URLEncoder.encode(str_date, "utf-8");
                System.out.println("编码后:"+str_date);
                cookie.setValue(str_date);
                //设置cookie的存活时间
                cookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(cookie);

                //响应请求,获取cookie的值
                String value = cookie.getValue();
                System.out.println("解码前:"+value);
                //URL解码
                value = URLDecoder.decode(value, "utf-8");
                System.out.println("解码后:"+str_date);
 %>
                <h1>欢迎回来,你上次访问的时间为:<%=value%></h1>
<%
                break;
            }
        }
    }

    //如果没有
    if (cookies == null || cookies.length == 0 || flag==false) {
        //获取当前时间的字符串
        Date date = new Date();
        //设置时间字符串格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str_date = sdf.format(date);
        System.out.println("编码前"+str_date);
        //URL编码
        str_date = URLEncoder.encode(str_date, "utf-8");
        System.out.println("编码后:"+str_date);
        Cookie cookie = new Cookie("lastTime",str_date);
        //设置cookie的存活时间
        cookie.setMaxAge(60 * 60 * 24 * 30);
        response.addCookie(cookie);
%>
        <h1>你好,欢迎你首次登陆!</h1>
<%
    }
%>
</body>
</html>
