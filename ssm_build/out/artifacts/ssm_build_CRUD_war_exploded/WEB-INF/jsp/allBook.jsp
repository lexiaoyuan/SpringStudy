<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>全部书籍</title>
</head>
<body>
<div>
    <a href="${pageContext.request.contextPath}/books/toInsertBook">增加书籍</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath}/books/allBook">全部书籍</a>
</div>
<div>
    <form action="${pageContext.request.contextPath}/books/searchBook/" method="post">
        <input type="text" name="bookName" required>
        <input type="submit" value="搜索">
    </form>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th>书籍编号</th>
            <th>书籍名字</th>
            <th>书籍数量</th>
            <th>书籍详情</th>
            <th>操作</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="book" items="${requestScope.get('booksList')}">
            <tr>
                <td>${book.bookID}</td>
                <td>${book.bookName}</td>
                <td>${book.bookCounts}</td>
                <td>${book.detail}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/books/toUpdateBook/${book.bookID}">修改</a> &nbsp; |
                    &nbsp;
                    <a href="${pageContext.request.contextPath}/books/deleteBook/${book.bookID}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
