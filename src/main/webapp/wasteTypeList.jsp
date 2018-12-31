<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>废物类型管理</title>
</head>
<body>
<h2>废物类型列表</h2>
<p><a href="/mavenSSM/waste_typeAdd.jsp">添加废物类型</a></p>
<table border=1 width="600">
  <tr>
    <th>编号</th><th>名称</th>
    <th>内部编码</th><th>操作</th>
  </tr>
  <c:forEach items="${wasteTypeList }" var="wtype">
    <tr>
      <td>${wtype.type_id }</td>
      <td>${wtype.name }</td>
      <td>${wtype.code }</td>
      <td><a href="del?id=${wtype.type_id }" 
      onclick="return confirm('你确定要删除 ${wtype.name} 吗？')">删 除</a> 
      | <a href="#">修 改</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>