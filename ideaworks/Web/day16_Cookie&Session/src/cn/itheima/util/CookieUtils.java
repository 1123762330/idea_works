package cn.itheima.util;

import javax.servlet.http.Cookie;

public class CookieUtils {
    private CookieUtils(){}
    /*
     根据指定的cookie的名字返回对应的cookie对象
       参数:
        1.Cookie[]
        2,cookie名称
       返回值:
        1,如果查找到了想要的cookie对象,返回这个cookie对象
        2,如果没有找到想要的cookie对象,返回null
     */
    public static Cookie getCookie(Cookie[] cookies,String name){
        if (cookies != null){
            for (int i = 0;i < cookies.length;i++){
                String cookieName = cookies[i].getName();
                if (cookieName.equals(name)){
                    //说明找到了想要的cookie对象
                    return cookies[i];
                }
            }
        }
        return null;
    }
}
