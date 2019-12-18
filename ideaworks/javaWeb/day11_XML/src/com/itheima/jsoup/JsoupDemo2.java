package com.itheima.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//Jsoup的功能
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //第一种方式,解析xml或html文件
        /*String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);*/

        //第二种方式,解析xml或html字符串
        //第三种方式,通过网络路径获取指定的文档对象
        URL url=new URL("http://www.baidu.com");
        Document document1 = Jsoup.parse(url, 10000);
        System.out.println(document1);
    }
}
