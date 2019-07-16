<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/rating.css" type="text/css">
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <style>
        /* Assign grid instructions to our parent grid container */
        .grid-container {
            display: grid;
            grid-template-columns: 240px 1fr;
            grid-template-rows: 50px 1fr 50px;
            grid-template-areas: "sidenav header" "sidenav main" "sidenav footer";
            height: 100vh;
        }
        hr{
            color: grey;
            background-color: grey;
        }

        /* Give every child element its grid name */
        .header {
            grid-area: header;
            background-color: #648ca6;
        }

        .sidenav {
            grid-area: sidenav;
            background-color: #394263;
        }

        .main {
            grid-area: main;
            background-color: #8fd4d9;
        }

        .footer {
            grid-area: footer;
            background-color: #648ca6;
        }

        .header, .footer {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0 16px;
            background-color: #648ca6;
        }

        .sidenav {
            display: flex; /* Will be hidden on mobile */
            flex-direction: column;
            grid-area: sidenav;
            background-color: #394263;
        }

        .sidenav__list {
            padding: 0;
            margin-top: 85px;
            list-style-type: none;
        }

        .sidenav__list-item {
            padding: 20px 20px 20px 40px;
            color: #ddd;
        }

        .sidenav__list-item:hover {
            background-color: rgba(255, 255, 255, 0.2);
            cursor: pointer;
        }

        a:link, a:visited {
            background-color: #394262;
            color: white;
            padding: 14px 25px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }

        a:hover, a:active {
            background-color: #394262;
            border-color: black;
        }
        .colormatch{
            color: white;
            letter-spacing: 3px;
            font-style: oblique;
        }

    </style>

</head>
<body class="bg-dark">

<h1 align="center" class="colormatch">The Online Library</h1>
<h5 align="center" class="colormatch"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>

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
    <main class="main bg-dark">
        <!--
        <div class="container">

            <div style="margin:auto;width: 50%;margin-top:20%">
                <div class="row">
                    <div class="col-4"><p>Tutorial Name:</p> </div>
                    <div class="col-8">
                        <p>${tute.getName()}</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-4"><p>Tutor Name:</p> </div>
                    <div class="col-8">
                        <p>${tute.getTutname()}</p>
                    </div>
                </div>

                <div class="row">
                    <div class="col-4"><p>About:</p> </div>
                    <div class="col-8">
                        <p>${tute.getDescription()}</p>
                    </div>
                </div>

                <div class="row">
                    <div class="col-4"><p>Link:</p> </div>
                    <div class="col-8">
                        <p>${tute.getUrl()}</p>
                    </div>
                </div>

                <p><c:url var="editUrl" value="/edit?id=${tute.getId()}" />
                    <a id="update" href="${editUrl}" class="btn btn-warning">Update</a>
                </p>
            </div>
        </div>-->


        <div class="container">
            <%--     <nav class="navbar-expand-lg navbar-dark bg-dark">

                     <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                             aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                         <span class="navbar-toggler-icon"></span>
                     </button>

                     <div class="collapse navbar-collapse" id="navbarSupportedContent">
                         <ul class="navbar-nav mr-auto">
                             <li class="nav-item active">
                                 <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                             </li>
                             <li class="nav-item">
                                 <a class="nav-link" href="#">Link</a>
                             </li>
                             <li class="nav-item dropdown">
                                 <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                    data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                     Dropdown
                                 </a>
                                 <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                     <a class="dropdown-item" href="#">Action</a>
                                     <a class="dropdown-item" href="#">Another action</a>
                                     <div class="dropdown-divider"></div>
                                     <a class="dropdown-item" href="#">Something else here</a>
                                 </div>
                             </li>
                             <li class="nav-item">
                                 <a class="nav-link disabled" href="#">Disabled</a>
                             </li>
                         </ul>
                         <form class="form-inline my-2 my-lg-0">
                             <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                             <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                         </form>
                         <ul class="navbar-nav mr-auto">
                             <li class="nav-item">
                                 <a class="nav-link disabled" href="#">Disabled</a>
                             </li>
                         </ul>
                     </div>
                 </nav>--%>


            <div class="bg-dark">
                <hr>
                <c:set var="namelower" value="${tute.getName()}"/>
                <c:set var="nametoupper" value="${fn:toUpperCase(namelower)}"/>
                <p class="colormatch"><b>ALL TUTORIALS / VIEW / ${nametoupper}</b></p>

                <div class="row">
                    <div class="col-4">
                        <img src="${tute.getImageUrl()}"
                             alt="No image" width="350px" height="400">

                    </div>
                    <div class="col-8">
                        <h1 style="color: white">${nametoupper}</h1>
                        <p style="color:skyblue;font-size: 20px; font-family: Baskerville, 'Palatino Linotype', Palatino, 'Century Schoolbook L', 'Times New Roman', 'serif'">
                            Online</p>
                        <p style="color: grey">ITEM:C-FG4121</p>

                        <hr>
                        <div class="row">
                            <div class="col-4">
                                <p style="color: white">DESCRIPTION</p>
                            </div>
                            <div class="col-8">
                                <p style="color: white">${tute.getDescription()}</p>
                            </div>
                        </div>

                        <hr>
                        <div class="row">
                            <div class="col-4">
                                <p style="color: white">TUTORIAL LINK</p>
                            </div>
                            <div class="col-8">
                                <a href="${tute.getUrl()}"><p style="color: white">${tute.getUrl()}</p></a>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-4">
                                <p style="color: white">RATE TUTORIAL</p>
                            </div>
                            <div class="col-8">
                                <div class="stars" id="stars">
                                    <form action="">
                                        <input class="star star-5" id="star-5" type="radio" name="star"/>
                                        <label class="star star-5" for="star-5" onClick="rating()"></label>
                                        <input class="star star-4" id="star-4" type="radio" name="star"/>
                                        <label class="star star-4" for="star-4"></label>
                                        <input class="star star-3" id="star-3" type="radio" name="star"/>
                                        <label class="star star-3" for="star-3"></label>
                                        <input class="star star-2" id="star-2" type="radio" name="star"/>
                                        <label class="star star-2" for="star-2"></label>
                                        <input class="star star-1" id="star-1" type="radio" name="star"/>
                                        <label class="star star-1" for="star-1"></label>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>


                <!-- Optional JavaScript -->
                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
                        crossorigin="anonymous"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
                        crossorigin="anonymous"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
                        crossorigin="anonymous"></script>
    </main>
    <footer class="footer">
        <div class="footer__copyright">&copy; 2019</div>
        <div class="footer__signature">THARUSHA WIJAYABAHU/Muaaz Ahamed</div>
    </footer>
</div>
<script type="text/javascript">
    /*
        function confirmAdd(id){
            alert("Tutorial successfully Added!");
        }*/
</script>
</body>
</html>