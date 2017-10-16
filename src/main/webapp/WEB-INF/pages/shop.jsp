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
    <h1><a href="/">Mega Shop</a></h1>
</div>

<div class="jumbotron">
    <%--Product's category--%>
    <div class="container-fluid col-lg-2 text-center">
        <div class="sidebar">
            <ul class="nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-group"></i>
                        <span class="menu-title">Книги</span>
                        <i class="fa fa-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a onclick="getProducts('cockbook')"> <span>Книги по кулинарии</span></a> </li>
                        <li><a onclick="getProducts('programbook')"> <span>Книги по программированию</span></a> </li>
                        <li><a onclick="getProducts('esotericbook')"> <span>Книги по эзотерике</span></a> </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-group"></i>
                        <span class="menu-title">Диски</span>
                        <i class="fa fa-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                            <li><a onclick="getProducts('cddisk')"><span>CD диски</span></a> </li>
                            <li><a onclick="getProducts('dvddisk')"><span>DVD диски</span></a> </li>
                    </ul>
                </li>

            </ul>
        </div>
    </div>

   <%--Categories list--%>
    <div id="products" class="container-fluid col-lg-4 text-left" >
    </div>

    <%--Product details--%>
    <div id="frame" class="container-fluid col-lg-6 text-center" >
    </div>

</div>
</body>
</html>
