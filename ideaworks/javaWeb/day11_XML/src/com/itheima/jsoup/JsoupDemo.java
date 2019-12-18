package com.itheima.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo {
    public static void main(String[] args) throws IOException {
        //1.获取xml文件的路径
        String path = JsoupDemo.class.getClassLoader().getResource("student.xml").getPath();
        //2.解析XMl文件
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素对象
        Elements names = document.getElementsByTag("name");//获取的是所有姓名标签的值
        //4.获取具体的元素对象
        Element nameE1 = names.get(1);
        //5.获取数据
        String name = nameE1.text();
        System.out.println(name);

    }
}
