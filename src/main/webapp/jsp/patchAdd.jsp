<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>patch add</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/tinker.css">
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
            <label>------appVersion------</label><br>
            <label>${version.versionCode}</label><br>
        </div>
        <div class="right">
            <h3>添加补丁</h3>
            <form action="<%=contextPath%>/patch/insert" method="post" enctype="multipart/form-data">
                <label id="errorMsg" hidden="hidden">error msg</label><br>
                <label>补丁文件</label><input type="file" name="file"><br>
                <label>补丁描述</label><input type="text" name="depict"><br>
                <input hidden="hidden" type="text" name="appId" value="${app.id}">
                <input hidden="hidden" type="text" name="versionId" value="${version.id}">
                <input type="submit" value="提交"><br>
            </form>
        </div>
    </div>
</center>
</body>
</html>
