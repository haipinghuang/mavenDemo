<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Version add</title>
    <link rel="stylesheet" type="text/css" href="/css/tinker.css">
    <%
        String contextPath = request.getContextPath();
    %>
</head>
<body>
<center>
    <h3>APP信息</h3>
    <div class="content">
        <div class="left">
            <label>${app.appName}</label><br>
            <label>------appkey------</label><br>
            <label>${app.appKey}</label><br>
        </div>
        <div class="right">
            <h3>添加版本</h3>
            <form action="<%=contextPath%>/version/insert">
                <label id="errorMsg" hidden="hidden">error msg</label><br>
                <input type="text" name="versionCode"><br>
                <input type="text" name="appId" hidden="hidden" value="${app.id}"><br>
                <input type="submit" value="提交"><br>
            </form>
        </div>
    </div>
</center>
</body>
</html>
