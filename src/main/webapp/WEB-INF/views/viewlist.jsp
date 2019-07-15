<%--
  Created by IntelliJ IDEA.
  User: muaaz
  Date: 7/11/19
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body style="background-color: cornsilk">

<p style="color: black; border: 5px solid black; letter-spacing: 5px; padding: 10px;"><b>List Of Tutorials Available</b>
<p>
    <c:forEach var="emp" items="${tutelist}">
<ul style="font-family: Arial; font-size: 14pt;">


    <li>Tutorial ID: ${emp.getId()} </li>

    <li>Tutorial Name: ${emp.getName()}</li>
    <li>Tutor Name : ${emp.getTutname()}</li>
    <li>Description : ${emp.getDescription()}</li>
    <li>URL : <a href="${emp.getUrl()}">${emp.getUrl()}</a></li>
    <p><c:url var="editUrl" value="/edit?id=${emp.getId()}" /><a id="update" href="${editUrl}" class="btn btn-warning">Update</a></p>

</ul>
</c:forEach>
</body>


</html>