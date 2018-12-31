<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>废物类型管理</title>
</head>
<body>
 <h2>添加废物类型</h2>
 <form action="waste_type/add" method="post">
   <p>类型名称：<input type="text" name="name" ></p>
   <p>内部编码：<input type="text" name="code" ></p>
   <p> <input type="submit" value="保 存"> </p>
 </form>
</body>
</html>