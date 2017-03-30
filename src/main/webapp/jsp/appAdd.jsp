<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>App add</title>
    <%
        String contextPath = request.getContextPath();
    %>
</head>
<body>
<center>
    <h3>添加APP</h3>
    <form action="<%=contextPath%>/app/insert">
        <label id="errorMsg" >error msg</label><br>
        <input type="text" name="appName"><br>
        <input type="submit"  value="提交"><br>
    </form>
</center>
</body>
</html>
