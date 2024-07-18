<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Item Form</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<div align="center">
    <h3>ITEM FORM</h3>
    <hr>
    <form:form modelAttribute="item" action="/item/process" method="post">
    <table>
        <tr>
            <th><label>Item ID:</label></th>
            <td>
                <form:input path="itemId" placeholder="Item Id"/>
                <form:errors path="itemId" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <th><label>Item Name:</label></th>
            <td>
                <form:input path="name" placeholder="Item Name"/>
                <form:errors path="name" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="SUBMIT"></td>
        </tr>
    </table>



    </form:form>

</div>

</body>
</html>
