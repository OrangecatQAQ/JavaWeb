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
<h1>取引先詳細</h1>
<table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>取引先番号</td>
	        <td>取引先英字名</td>
	        <td>取引先漢字名</td>
	    </tr>
        <tr>
            <td>${cs.customerNo}</td>
            <td>${cs.customerEnglishName}</td>
            <td>${cs.customeKanjiName}</td>	
        </tr>
        
        <tr>
	        <td>従業員数</td>        
	        <td>取引先設立時間</td>
	        <td>資本金</td>
	    　　　　</tr>
        <tr>
            <td>${cs.employeeNumber} 人</td>
            <td>${cs.establishDate}</td>
            <td>${cs.capital} 万円</td>			
        </tr>

</table>
<a href="http://localhost:8080/ssm/listCategory">戻る</a>


</body>
</html>