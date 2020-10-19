<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>
    <h3>修改书籍</h3>
    <form action="${pageContext.request.contextPath}/books/updateBook/${updateBook.bookID}" method="post">
        <p>书籍名称：<input type="text" name="bookName" value="${updateBook.bookName}" required></p>
        <p>书籍数量：<input type="number" name="bookCounts" value="${updateBook.bookCounts}" required></p>
        <p>书籍描述：<input type="text" name="detail" value="${updateBook.detail}" required></p>
        <p><input type="submit" value="确定修改"></p>
    </form>
</body>
</html>
