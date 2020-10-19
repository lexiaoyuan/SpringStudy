<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>全部书籍</title>
</head>
<body>
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
                    <td>${book.getBookID()}</td>
                    <td>${book.getBookName()}</td>
                    <td>${book.getBookCounts()}</td>
                    <td>${book.getDetail()}</td>
                    <td>
                        <a href="#">更改</a> |
                        <a href="#">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
