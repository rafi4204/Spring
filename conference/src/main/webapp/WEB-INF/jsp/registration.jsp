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
<html>
<head>
    <title>registration</title>

    <style>
        .error{
            color: red;
        }
        .errorblock{
            color: black;
            background-color: antiquewhite;
            border: 3px solid red;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1>registration</h1>

<form:form modelAttribute="registration">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>
                <spring:message code="name"/>
            </td>

            <td>
                <form:input path="name"/>
            </td>

            <td>
                <form:errors path="name" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Add Registration">
            </td>
        </tr>

    </table>

</form:form>
</body>
</html>
