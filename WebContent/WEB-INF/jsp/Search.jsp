<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>取引先管理システムへよこうそ!</h1>




 <div style="width:500px;margin:0px auto;text-align:center">

	<form name="searchForm" method="post" action="http://localhost:8080/ssm/searchCategory">
		<label>取引先英字名</label>
		<input type="text" name="customer_eng_name" value="" />
		<input type="submit" name="Search" value="Search"/>
	</form>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>No.</td>
        <td>取引先番号</td>
        <td>取引先英字名</td>
        <td>取引先漢字名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${st.index + 1}</td>
            <td><a href="http://localhost:8080/ssm/detailCategory?customer_no=${c.customer_no}">${c.customer_no}</a></td>
            <td>${c.customer_eng_name}</td>
            <td>${c.customer_kanji_name}</td>
            <td><a href="http://localhost:8080/ssm/deleteCategory?customer_no=${c.customer_no}">削除</a></td>			
        </tr>
    </c:forEach>
</table>
<div style="text-align:center">
        <a href="?start=0">首  页</a>
        <a href="?start=${page.start-page.count}">前のページ</a>
        <a href="?start=${page.start+page.count}">次のページ</a>
        <a href="?start=${page.last}">末  页</a>
    </div>
 </div>