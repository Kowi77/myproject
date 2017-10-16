<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Mega Shop</title>
    <base href="${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="resources/style.css">
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap-theme.min.css">

    <script type="text/javascript" src="webjars/jquery/3.2.1/dist/jquery.min.js" defer></script>
    <script type="text/javascript" src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js" defer></script>
    <script type="text/javascript" src="resources/shopUtils.js" defer></script>
</head>
<body>

<div id="header" class="container-fluid col-lg-12">
    <h1><a href="#">Mega Shop</a></h1>
</div>


<%--Product's category--%>
<div class="jumbotron">
    <div class="container-fluid col-lg-3">
        <div class="sidebar">
            <ul class="nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-group"></i>
                        <span class="menu-title">Книги по кулинарии</span>
                        <i class="fa fa-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${cockBooks}" var="cockBook">
                            <li><a onclick="getProduct('cockbook/' + ${cockBook.getId()})"> <span>${cockBook.getName()} ${cockBook.getPrice()} руб</span></a> </li>
                        </c:forEach>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-group"></i>
                        <span class="menu-title">Книги по программированию</span>
                        <i class="fa fa-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${programBooks}" var="programBook">
                            <li><a onclick="getProduct('programbook/' + ${programBook.getId()})"> <span>${programBook.getName()} ${programBook.getPrice()} руб</span></a> </li>
                        </c:forEach>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-group"></i>
                        <span class="menu-title">Книги по эзотерике</span>
                        <i class="fa fa-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${esotericBooks}" var="esotericBook">
                            <li><a onclick="getProduct('esotericbook/' + ${esotericBook.getId()})"><span>${esotericBook.getName()} ${esotericBook.getPrice()} руб</span></a> </li>
                        </c:forEach>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-group"></i>
                        <span class="menu-title">Диски</span>
                        <i class="fa fa-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${disks}" var="disk">
                            <li><a onclick="getProduct('disk/' + ${disk.getId()})"><span>${disk.getName()} ${disk.getPrice()} руб</span></a> </li>
                        </c:forEach>
                    </ul>
                </li>

            </ul>
        </div>
    </div>
    <div id="frame" class="container-fluid col-lg-9 text-center" >
    </div>
</div>
</body>
</html>
