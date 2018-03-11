<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form method="post" action="FileImgUp.action" enctype="multipart/form-data">
        用户名: <input type="text" name="userName" value="admin" /> <br/>
        上传文件: <input type="file" name="fileImg"  /> <br/>
        <input type="submit" value="上传" />
    </form>

    <a href="upload/${fileImgFileName}">下载</a>
</body>
</html>
