<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 黄海
  Date: 2017/3/31
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>app补丁列表</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/tinker.css">
    <%
        String contextPath = request.getContextPath();
    %>
</head>
<body>
<center>
    <h3>app补丁列表</h3>
    <div class="content">
        <div class="left">
            <label>${app.appName}</label><br>
            <label>------appkey------</label><br>
            <label>${app.appKey}</label><br>
            <label>------appVersion------</label><br>
            <label>${version.versionCode}</label><br>
        </div>
        <div class="right">
            <table border="1">
                <thead>
                <tr>
                    <td>appVersion</td>
                    <td>patchVersion</td>
                    <td>更新时间</td>
                    <td>补丁描述</td>
                    <td>成功下载数</td>
                    <td>成功应用数</td>
                    <td>下载链接</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${patchs}" var="patch">
                    <tr>
                        <td><c:out value="${version.versionCode}"/></td>
                        <td><c:out value="${patch.id}"/></td>
                        <td><c:out value="${patch.createTime}"/></td>
                        <td><c:out value="${patch.depict}"/></td>
                        <td><c:out value="${patch.downloadSuccessNum}"/></td>
                        <td><c:out value="${patch.applySuccessNum}"/></td>
                        <td><a href="<%=contextPath%>/patch/download?patchId=${patch.id}">下载</a></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="7" align="center">
                        <a href="<%=contextPath%>/patch/toAddPatch?appId=${app.id}&versionId=${version.id}">添加新补丁</a>
                    </td>

                </tr>
                </tbody>
            </table>
        </div>
    </div>
</center>
</center>
</body>
</html>
