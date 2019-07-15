<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body style="background-color: cornsilk">


<p style="color: black; border: 5px solid black; letter-spacing: 5px; padding: 10px;"><b>List Of Tutorials Available</b>


<p>
    <c:forEach var="emp" items="${empList}">
<ul style="font-family: Arial; font-size: 14pt;">


    <li>Tutorial ID: ${emp.getId()} </li>
    <li>Tutorial Name: ${emp.getName()}</li>
    <li>Tutor Name : ${emp.getTutname()}</li>
    <li>Description : ${emp.getDescription()}</li>
    <li>URL : <a href="${emp.getUrl()}">${emp.getUrl()}</a></li>


</ul>
</c:forEach>
</body>


</html>
