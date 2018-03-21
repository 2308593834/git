<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
修改：
<form action="update">
id:<input type="text" name="gid" value="${es.gid}" readonly="readonly"/>
name:<input type="text" name="gname" value="${es.gname}"/>
sms:<input type="text" name="sms" value="${es.sms}"/>
feilei:<select name="demo.did">
<c:forEach items="${demo}" var="demo">
<option value="${demo.did}">
${demo.dname}
</option>
</c:forEach>
</select>
<input type="submit" value="update"/>
</form>
添加：
<form action="add">
id:<input type="text" name="gid" readonly="readonly"/>
name:<input type="text" name="gname"/>
sms:<input type="text" name="sms"/>
feilei:<select name="demo.did">
<c:forEach items="${demo}" var="demo">
<option value="${demo.did}">
${demo.dname}
</option>
</c:forEach>
</select>
<input type="submit" value="添加"/>
</form>
<table border="1">
<tr>
<td>姓名</td>
<td>信息</td>
<td>分类</td>
<td>操作</td>
</tr>
<c:forEach items="${guess}" var="guess">
<tr>
<%-- <td>${guess.gid}</td> --%>
<td>${guess.gname}</td>
<td>${guess.sms}</td>
<td>${guess.demo.dname}</td>
<td><a href="del?gid=${guess.gid}">删除</a>
<a href="guess?gid=${guess.gid}">更新</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>