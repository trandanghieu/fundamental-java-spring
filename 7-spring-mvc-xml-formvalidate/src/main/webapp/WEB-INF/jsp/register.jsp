<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Register</title>
</head>
<style>
    .error {
        color: red;
    }
</style>
<body>
<div align="center">
    <h3>REGISTER</h3>
    <hr>

    <form:form modelAttribute="user" action="/user/register" method="post">
        <table>
            <tr>
                <th><label>First Name:</label></th>
                <td>
                    <form:input path="firstName" placeholder="Your First Name"/>
                    <form:errors path="firstName" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <th><label>Last Name:</label></th>
                <td>
                    <form:input path="lastName" placeholder="Your Last Name"/>
                    <form:errors path="lastName" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <th><label>Email:</label></th>
                <td>
                    <form:input path="email" placeholder="Your Email"/>
                    <form:errors path="email" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <th><label>Country:</label></th>
                <td>
                    <form:select path="country">
                        <c:forEach var="country" items="${countries}">
                            <form:option value="${country}" label="${country}"/>
                        </c:forEach>
                    </form:select>
                    <form:errors path="country" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <th><label>Gender:</label></th>
                <td>
                    <c:forEach var="genderAsString" items="${gender}">
                        <form:radiobutton path="gender" value="${genderAsString}" label="${genderAsString}"/>
                    </c:forEach>
                    <form:errors path="gender" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <th><label>Hobby:</label></th>
                <td>
                    <c:forEach var="hobby" items="${hobbies}">
                        <form:checkbox path="hobby" value="${hobby}" label="${hobby}"/>
                    </c:forEach>
                    <form:errors path="hobby" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <th><label>Password:</label></th>
                <td>
                    <form:input path="password" placeholder="Your Password"/>
                    <form:errors path="password" cssClass="error"/>
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
