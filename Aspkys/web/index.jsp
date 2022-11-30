<%--
  Created by IntelliJ IDEA.
  User: wsk
  Date: 2022/11/25
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
        <form method="post" action="asd?i=2" />
        商品名：<input type="text" name="itemname"/><br/>
        价格：<input type="text" name="itemprice;"/><br/>
        <input type="hidden" name="i" value="4"/>
        <input type="submit" value="提交">
        <form/>
        <a href="mys/delete?i=5">删除id=5的部门</a>
        <a href="mys/insert?i=3">添加id=5的部门</a>
  </body>
</html>
