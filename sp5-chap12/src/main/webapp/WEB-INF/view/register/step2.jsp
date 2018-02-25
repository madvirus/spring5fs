<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="member.register" /></title>
</head>
<body>
    <h2><spring:message code="member.info" /></h2>
    <form:form action="step3" commandName="registerRequest">
    <p>
        <label><spring:message code="email" />:<br>
        <form:input path="email" />
        </label>
    </p>
    <p>
        <label><spring:message code="name" />:<br>
        <form:input path="name" />
        </label>
    </p>
    <p>
        <label><spring:message code="password" />:<br>
        <form:password path="password" />
        </label>
    </p>
    <p>
        <label><spring:message code="password.confirm" />:<br>
        <form:password path="confirmPassword" />
        </label>
    </p>
    <input type="submit" value="<spring:message code="register.btn" />">
    </form:form>
</body>
</html>
