<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>城市功能</title>

  <script src="js/jquery-3.3.1.min.js"></script>

  <script>
      $(function () {

          //发送ajax请求，加载所有省份数据
          $.get("provinceServlet",{},function (data) {
              //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

              //1.获取select
              var province = $("#province");
              //2.遍历json数组
              $(data).each(function () {
                  //3.创建<option>
                  var option = "<option name='"+this.id+"'>"+this.name+"</option>";

                  //4.调用select的append追加option
                  province.append(option);
              });


          });

      });


  </script>

</head>
<body>
<select id="province">
  <option>--请选择省份--</option>
</select>
<form action="/addServlet" method="post" id="from">
  <label for="cityname">新增省份:</label>
  <input type="text"  id="cityname" name="cityname" placeholder="请输入城市名">
  <input type="submit" value="提交" />
</form>
</body>
</html>
