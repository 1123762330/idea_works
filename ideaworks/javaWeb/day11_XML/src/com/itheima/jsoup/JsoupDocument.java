package com.itheima.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDocument {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取所有的Student对象
        Elements  elements= document.getElementsByTag("student");
        //获取属性名为id的元素对象
        Elements idEs = document.getElementsByAttribute("id");
        //获取number属性值为0001的元素
        Elements value1 = document.getElementsByAttributeValue("number", "heima_0001");
        //获取id属性值的元素对象
        Element byId = document.getElementById("itcast");
        System.out.println(byId);
    }
}
