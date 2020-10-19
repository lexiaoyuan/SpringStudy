<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
</head>
<body>
    <h3>添加书籍</h3>
    <form action="${pageContext.request.contextPath}/books/insertBook" method="post">
        <p>书籍名称：<input type="text" name="bookName" required></p>
        <p>书籍数量：<input type="number" name="bookCounts" required></p>
        <p>书籍描述：<input type="text" name="detail" required></p>
        <p><input type="submit" value="确定添加"></p>
    </form>
</body>
</html>
