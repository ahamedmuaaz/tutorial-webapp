<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: muaaz
  Date: 7/12/19
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Tutorial</title>
</head>
<body>
   <div class="container">git status

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

    <p><c:url var="editUrl" value="/edit?id=${tute.getId()}" /><a id="update" href="${editUrl}" class="btn btn-warning">Update</a></p>
    </div>
   </div>
</body>
</html>
