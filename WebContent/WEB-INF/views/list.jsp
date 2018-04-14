<%--
  Created by IntelliJ IDEA.
  User: huchuan
  Date: 2018/4/14
  Time: 下午1:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Movies</title>
</head>
<body>
<center>

    <!-- 删除的提交方式 -->
    <form action="" method="POST">
        <input type="hidden" name="_method" value="DELETE">
    </form>
    <c:if test="${empty requestScope.movies}">
        没有任何学生信息
    </c:if>

    <c:if test="${!empty requestScope.movies }">
        <table border="1" cellpadding="10" cellspacing="0">
            <tr>
                <th>编号</th>
                <th>名称</th>
                <th>类型</th>
                <th>上映时间</th>
                <th>国家</th>
                <th>语言</th>
                <th>片长</th>
                <th>导演</th>
                <th>主演</th>
                <th>评分</th>
                <th>修改时间</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${requestScope.movies}" var="movie">
                <tr>
                    <td>${movie.id }</td>
                    <td>${movie.title }</td>
                    <td>${movie.type  }</td>
                    <td>${movie.releaseYear}</td>
                    <td>${movie.country}</td>
                    <td>${movie.language}</td>
                    <td>${movie.time}</td>
                    <td>${movie.director}</td>
                    <td>${movie.actor}</td>
                    <td>${movie.score}</td>
                    <td>${movie.opTime}</td>
                    <td><a href="movie/${movie.id}">修改</a>
                        <a class="delete" href="movie/${movie.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br />
    <h3>
        <a href="movie"> add new movie</a>
    </h3>
</center>


<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
    $(function() {
        $(".delete").click(function() {
            var href = $(this).attr("href");
            $("form").attr("action", href).submit();
            return false;
        });
    })
</script>
</body>
</html>
