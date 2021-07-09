<%--
  Created by IntelliJ IDEA.
  User: BS293
  Date: 5/29/2021
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>login</title>

    <style>
        .error {
            color: red;
        }

        .errorblock {
            color: black;
            background-color: antiquewhite;
            border: 3px solid red;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1>login</h1>

<div>
    <c:if test="${not empty param.error}">Invalid UserName and Password</c:if>
</div>

<form:form action="perform_login" method="post">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <div><label>User Name: <input type="text" name="username"></label></div>
    <div><label>Password: <input type="password" name="password"></label></div>
    <input type="submit" role="button" value="Login"/>

</form:form>
</body>
</html>
