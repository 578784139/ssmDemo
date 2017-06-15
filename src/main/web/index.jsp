<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2017/6/13
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/doLogin.controller" method="post">
    <table width="60%" align="center" style="margin-top: 150px">
      <tr>
        <th align="right" width="20%">用户名：</th>
        <td width="20%">
        <input type="text" name="username" >
        </td>
        <td></td>
      </tr>
      <tr>
        <th align="right">密码：</th>
        <td>
          <input type="password" name="password">
        </td>
        <td></td>
      </tr>
      <tr>
        <td colspan="3" align="center">
          <input type="submit" value="登录">
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>
