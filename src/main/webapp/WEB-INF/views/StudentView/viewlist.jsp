<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../resources/rating.css" type="text/css">
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <style type="text/css">
        <!--
        <%@ include file="../../css/mainStyle.css" %>

        -->
    </style>
</head>
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
        <div class="container">
            <div class="row">
                <c:forEach var="tut" items="${tutelist}" varStatus="loop">


                    <div class="col-md-4">
                        <div class="card" style="width: 250px; margin-bottom: 10px;margin-top: 10px">
                            <img class="card-img-top" src="${tut.getImageUrl()}" alt=""
                                 style=" width: 250px;height:250px">
                            <div class="card-body">
                                <h3 class="card-title">${tut.getName()}</h3>

                                <div class="row">
                                    <p><b>${tut.getDescription()}</b></p>
                                </div>
                                <div class="row">
                                    <h6>Conducted by : ${tut.getTutname()}</h6>
                                </div>
                                <div class="text-center">
                                    <button id="update" class="btn btn-primary"
                                            onclick="viewMethod(${tut.getId()})">View More Details
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </main>
    <footer class="footer">
        <div class="footer__copyright">&copy; 2019</div>
        <div class="footer__signature">THARUSHA WIJAYABAHU / MUAAZ AHAMED</div>
    </footer>
</div>
<script type="text/javascript">
    function viewMethod(id) {
        window.location.assign("/client/view?id=" + id);
    }
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</body>
</html>