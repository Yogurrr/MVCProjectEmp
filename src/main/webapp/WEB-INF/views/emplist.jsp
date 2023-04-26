<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 리스트</title>
</head>
<body style="text-align: center">
    <h1>사원 리스트</h1>
    <table border="1" width="750px" cellpadding="10px" cellspacing="0" style="margin: 0 auto;">
        <tr>
            <th>사원번호</th>
            <th>이름</th>
            <th>이메일</th>
            <th>직책</th>
            <th>부서번호</th>
        </tr>

        <c:forEach items="${emps}" var="emp">
            <tr style="text-align: center">
                <td>${emp.empno}</td>
                <td>${emp.fname}</td>
                <td>${emp.email}</td>
                <td>${emp.jobid}</td>
                <td>${emp.deptid}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

<%-- 결과를 보여주는 코드 --%>