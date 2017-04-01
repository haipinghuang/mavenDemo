<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>aplist</title>
    <%
        String contextPath = request.getContextPath();
    %>
</head>
<body>
<center>
    <table border="1">
        <thead>
        <tr>
            <th>ID</th>
            <th>APP NAME</th>
            <th>APP KEY</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${apps}" var="app">
            <tr>
                <th><c:out value="${app.id}"/></th>
                <th><c:out value="${app.appName}"/></th>
                <th><c:out value="${app.appKey}"/></th>
                <th><a href="<%=contextPath%>/app/detail?appId=${app.id}">详情</a></th>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="4" align="center"><a href="jsp/appAdd.jsp">new app</a></td>
        </tr>
        </tbody>

    </table>
</center>
</body>
</html>
