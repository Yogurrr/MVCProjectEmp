<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 등록</title>
</head>
<body>
    <h1 style="text-align: center">사원 등록</h1>
    <form name="empfrm" id="empfrm" method="post">
        <table style="text-align: end; margin: 0 auto">
            <tr>
                <td>사원번호</td>
                <td><input type = "text" name = "empno"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type = "text" name = "fname"></td>
            </tr>
            <tr>
                <td>성</td>
                <td><input type = "text" name = "lname"></td>
            </tr>
            <tr>
                <td>이메일</td>
                <td><input type = "text" name = "email"></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td><input type = "text" name = "phone"></td>
            </tr>
            <tr>
                <td>입사일</td>
                <td><input type = "text" name = "hdate"></td>
            </tr>
            <tr>
                <td>직책</td>
                <td><input type = "text" name = "jobid"></td>
            </tr>
            <tr>
                <td>급여</td>
                <td><input type = "text" name = "sal"></td>
            </tr>
            <tr>
                <td>수당</td>
                <td><input type = "text" name = "comm"></td>
            </tr>
            <tr>
                <td>상사번호</td>
                <td><input type = "text" name = "mgrid"></td>
            </tr>
            <tr>
                <td>부서번호</td>
                <td><input type = "text" name = "deptid"></td>
            </tr>
        </table>
        <div style="text-align: center; margin-top: 10px">
            <button type="submit" style="width: 100px;">입력완료</button>
        </div>
    </form>
</body>
</html>
