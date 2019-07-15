<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%--   <style>
        .container {
            margin: auto;
            display: grid;
            grid-template-columns: 100% auto;

        }
        .col {
            margin: auto;
            padding: .4em 2em;
        }
        .color-dark {
            background: rgba(0, 0, 0, 0.69);
            color: white;
        }


        input ,[type="number"],[type="date"],[type="text"] {
            border: 0;
            padding: 1em;
            width: 80%;
            margin-bottom: 2em;
        }
        input.btn {
            border: 0;
            font-weight: bold;
            display:block;
            padding:1em 3em;
            background:rgb(76, 0, 255);
            color:white;
            margin-bottom:1em;
            cursor:pointer;
            width: 84.5%;
        }
        button {
            border: 0;
            font-weight: bold;
            display:block;
            padding:1em 3em;
            background:rgb(76, 0, 255);
            color:white;
            margin-bottom:1em;
            cursor:pointer;
        }
        .pitemSyle{
            text-align: left;
            font-weight: bold;
            font-size: 14px;
        }
    </style>--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container color-dark">
    <div class="col">
        <h2 align = "center">Add new Tutorials</h2>
    </div>

</div>

<div class="container">

    <div class="col">
        <h3 align = "center">Tutorial</h3>

        <form:form id="user_form" modelAttribute="addAttr" method="POST" action="/save">
            <label for="id">Enter ID: </label>
            <form:input id="id" cssClass="form-control" path="id" />

            <label for="name">Enter Tutorial Name: </label>
            <form:input id="name" cssClass="form-control" path="name" />

            <label for="tut_name">Enter TutorName: </label>
            <form:input id="tut_name" cssClass="form-control" path="tutname" />

            <label for="desc">Enter Description: </label>
            <form:input id="desc" cssClass="form-control" path="description" />

            <label for="url">Enter URL: </label>
            <form:input id="url" cssClass="form-control" path="url" />

            <br>

            <button id="saveBtn" type="submit" class="btn btn-primary">Save</button>
        </form:form>

    </div>
</div>
</body>
</html>
