<%--
  Created by IntelliJ IDEA.
  User: wsk
  Date: 2022/11/29
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function show() {
            //1.创建ajax引擎对象
            var request=new XMLHttpRequest();
            //2.设置一个异步请求：
            request.open("post","as");
            //3.ajax在模拟post提交方式的时候，还要设置一个请求行：
            request.setRequestHeader("Content-Type: application/x-www-form-urlencoded");
            //发送请求
            var   val=document.myform.uname.value;
            request.send("stuname==val")
            //4.接收响应信息
            request.onreadystatechange=function ( ) {
                if (request.readyState==4 && request.status==200){
                    var str=request.responseText;
                    document.getElementById("spanid").innerText=str;
                }
            }
        }

    </script>
</head>
<body>

<form name="myform">
       用户名<input type="text" name="uname" onblur="show();"/><span id="spanid"></span>


</form>

</body>
</html>
