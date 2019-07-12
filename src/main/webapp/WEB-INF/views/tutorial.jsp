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
    <title>Tutorial</title>
</head>
<body>

    <p>${tute.getId()}</p>
    <p>${tute.getName()}</p>
    <p>${tute.getTutname()}</p>
    <p>${tute.getDescription()}</p>
    <p>${tute.getUrl()}
    <p><c:url var="editUrl" value="/edit?id=${tute.getId()}" /><a id="update" href="${editUrl}" class="btn btn-warning">Update</a></p>


</body>
</html>
