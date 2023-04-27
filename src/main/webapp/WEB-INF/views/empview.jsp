<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 상세정보</title>
</head>
<body>
<h1 style="text-align: center">사원 상세정보</h1>
<table border="1" width="70%" cellpadding="10px" cellspacing="0" style="margin: 0 auto">
  <tr>
    <th>사원번호</th>
    <th>이름</th>
    <th>성</th>
    <th>이메일</th>
    <th>전화번호</th>
    <th>입사일</th>
    <th>직책</th>
    <th>급여</th>
    <th>수당</th>
    <th>상사번호</th>
    <th>부서번호</th>
  </tr>
  <tr style="text-align: center">
    <td>${emp.empno}</td>
    <td>${emp.fname}</td>
    <td>${emp.lname}</td>
    <td>${emp.email}</td>
    <td>${emp.phone}</td>
    <td>${emp.hdate}</td>
    <td>${emp.jobid}</td>
    <td>${emp.sal}</td>
    <td>${emp.comm}</td>
    <td>${emp.mgrid}</td>
    <td>${emp.deptid}</td>
  </tr>
</table>

<div style="text-align: center; margin-top: 20px;">
  <button type="button" style="width: 100px;">
    <a href="/modify?empno=${emp.empno}" style="text-decoration: none">수정하기</a>
  </button>
  <button type="button" style="width: 100px">
    <a href="/remove?empno=${emp.empno}" style="text-decoration: none">삭제하기</a>
  </button>
</div>
</body>
</html>
