<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>App add</title>
    <link rel="stylesheet" type="text/css" href="/css/tinker.css">
    <%
        String contextPath = request.getContextPath();
    %>
    <style>
        .content {
            width: 990px;
            overflow: hidden;
        }
        .content .left {
            width: 250px;
            height: 700px;
            text-align: center;
            float: left;
        }
        .content .right {
            width: 730px;;
            float: left;
        }
    </style>
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
            <table border="1">
                <thead>
                <tr>
                    <td>appVersion</td>
                    <td>createTime</td>
                    <td>操作</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${versions}" var="version">
                    <tr>
                        <td><c:out value="${version.versionCode}"/></td>
                        <td><c:out value="${version.createTime}"/></td>
                        <td><c:out value="${version.createTime}"/></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="3" align="center"><a
                            href="<%=contextPath%>/version/toAddVersion?appId=${app.id}">添加新版本</a></td>

                </tr>
                </tbody>
            </table>
        </div>
    </div>
</center>
</body>
</html>
