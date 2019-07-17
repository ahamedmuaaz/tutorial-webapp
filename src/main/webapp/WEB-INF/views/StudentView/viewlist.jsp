<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style type="text/css">
        <!--
        <%@ include file="../../css/mainStyle.css" %>
        <%@ include file="../../css/listView.css" %>
        -->
    </style>

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="./style/mystyle.css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<body>

<h1 align="center">The Online Library</h1>
<h5 align="center"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>

<!--Simple dashboard grid layout-->
<div class="grid-container">
    <header class="header"></header>
    <aside class="sidenav">
        <ul class="sidenav__list">
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/add">Add Tutorial</a></li>
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/list">View Tutorials</a></li>
            <li class="sidenav__list-item"><a href="http://reactjs.org">About Us</a></li>
            <li class="sidenav__list-item"><a href="http://reactjs.org">Contact Us</a></li>
        </ul>
    </aside>
    <main class="main">
        <c:forEach var="tut" items="${tutelist}">
            <div class="container bg-dark">
                <div class="row">
                    <div class="bg-dark">
                        <div id="products" class="row list-group">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    <img class="group list-group-image" src="${tut.getImageUrl()}" width="250px"
                                         height="250px" alt=""/>
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                                ${tut.getName()}
                                        </h4>
                                        <h4 class="group inner list-group-item-heading">
                                                ${tut.getTutname()}
                                        </h4>
                                        <p class="group inner list-group-item-text">
                                                ${tut.getDescription()}
                                        </p>
                                        <div class="text-center">
                                            <button id="update" class="btn btn-primary"
                                                    onclick="viewMethod(${tut.getId()})">View More Details
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </main>
    <footer class="footer">
        <div class="footer__copyright">&copy; 2019</div>
        <div class="footer__signature">THARUSHA WIJAYABAHU/MUAAZ AHAMED</div>
    </footer>
    </div>
    <script type="text/javascript">

    $(document).ready(function () {
        $('#list').click(function (event) {
            event.preventDefault();
            $('#products .item').addClass('list-group-item');
        });
        $('#grid').click(function (event) {
            event.preventDefault();
            $('#products .item').removeClass('list-group-item');
            $('#products .item').addClass('grid-group-item');
        });
    });
    </script>
    <script type="text/javascript">
    function viewMethod(id) {
        window.location.assign("/client/view?id="+id);
    }
    </script>
</body>
</html>
