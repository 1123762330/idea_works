<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>下载页面</title>
  </head>
  <body>
  <a href="/download/img/狐狸.jpg">图片1</a>
  <a href="/download/img/1.avi">视频</a>
  <hr>

  <a href="/download/downloadServlet?filename=狐狸.jpg">点击下载图片1</a><br>
  <a href="/download/downloadServlet2?filename=狐狸.jpg">点击下载优化后图片1</a><br>
  <a href="/download/downloadServlet?filename=1.avi">点击下载视频</a><br>
  <a href="/download/downloadServlet?filename=se小说.txt">你想要的都在这里哦!</a><br>
  <a href="/download/downloadServlet?filename=盗墓笔记之秦皇陵(盗墓).txt">盗墓笔记之秦皇陵.txt</a>
  </body>
</html>
