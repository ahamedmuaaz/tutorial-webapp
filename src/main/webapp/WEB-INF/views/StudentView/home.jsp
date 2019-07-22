<%--
  Created by IntelliJ IDEA.
  User: muaaz/tharusha
  Date: 7/19/19
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<head>

    <title>Tutorial library</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <style type="text/css">
        <%@ include file="../../css/nav.css" %>
    </style>
    <script type="text/javascript">
        <%@ include file="../../js/nav.js" %>
    </script>

</head>
<body>

<nav class="navbar navbar-expand-md">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/student/home">HOME</a>
    <button class="navbar-toggler navbar-dark" type="button" data-toggle="collapse" data-target="#main-navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="main-navigation">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/student/">TUTORIAL</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/student/about-us">ABOUT</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/">LOGOUT</a>
            </li>
        </ul>
    </div>
</nav>
<header class="page-header header container-fluid">
    <div class="overlay"></div>
    <div class="description">
        <h1>Welcome to the Tutorial Library!</h1>
        <p><b>"Education is the most powerful weapon which you can use to change the world" </b></p><p>-Nelson Mandela-
        </p>
        <button class="btn btn-outline-secondary btn-lg" onclick="godown()">Contact Us</button>
    </div>
</header>
<footer class="page-footer" id="contact">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-md-8 col-sm-12">
                <h6 class="text-uppercase font-weight-bold">Additional Information</h6>
                <p>hSenid Mobile Solutions is a company with a proud history of 20 years of innovations, proven
                    expertise while still having a heart of a startup. We design and build innovative
                    cutting-edge technology platforms which enables the digital transformation of the businesses..</p>
                <p>Our advanced solutions and guaranteed service qualities has enabled us to gain healthy base of loyal customers.
                    We strive to help our customers by opening up uncontested market spaces and thereby achieve rapid growth.</p>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-12">
                <h6 class="text-uppercase font-weight-bold">Contact</h6>
                <p>hSenid Mobile Solutions
                    No 320, 3rd Floor,
                    T.B.Jayah Mawatha,
                    Colombo 10.
                    <br/>info@mywebsite.com
                    <br/>+ 94 712959395
                    <br/>+ 01 234 567 89</p>
            </div>
        </div>
        <div class="footer-copyright text-center">© 2019 Copyright: tutoriallibrary.com</div>
    </div>
</footer>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $('.header').height($(window).height());
    })


    function godown() {
        window.location.assign("#contact");

    }

</script>
</body>
</html>