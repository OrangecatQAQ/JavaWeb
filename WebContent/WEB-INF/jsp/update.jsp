<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">

</script>
<title>取引先詳細</title>
</head>
<body>
<h1>取引先登録</h1>
<form name="searchForm" method="post" action="http://localhost:8080/ssm/updateCategory">
<table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>取引先番号</td>
	        <td>取引先英字名</td>
	        <td>取引先漢字名</td>
	    </tr>
        <tr>
            <td><input type="text" name="customer_no" value="${cs.customer_no}" /></td>
            <td><input type="text" name="customer_eng_name" value="${cs.customer_eng_name}" /></td>
            <td><input type="text" name="customer_kanji_name" value="${cs.customer_kanji_name}" /></td>	
        </tr>
        
        <tr>
	        <td>従業員数</td>        
	        <td>取引先設立時間</td>
	        <td>資本金</td>
	    　　　　</tr>
        <tr>
            <td>
            <select name="employee_number">
			 <option  value="1">1~10人</option>
			 <option  value="2">10~100人</option>
			 <option  value="3">100~1000人</option>
			 <option  value="4">1000~5000人</option>
			</select>
　　　　　　　　　　</td>
            <td><input type="text" name="establish_date" value="${cs.establish_date}" /></td>
            <td><input type="text" name="capital" value="${cs.capital}" />万円</td>			
        </tr>
</table>
		<input type="submit" name="Search" value="Update"/>
	</form>
<a href="http://localhost:8080/ssm/listCategory">戻る</a>


</body>
</html>