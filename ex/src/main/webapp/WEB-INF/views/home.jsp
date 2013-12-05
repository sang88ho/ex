<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table class="tbl-type-1 txt-c mb20 ui-set-tbl-type" border="1" cellspacing="0"
		summary="통화코드, 국가명, 송금, 현찰, 매매기준율, 대미환산율, 날짜, 보내실때, 받으실때, 사실때, 파실때 제공">
		<caption>일별환율 조회결과</caption>
		<colgroup>
			<col width="8%">
			<col width="12%">
			<col span="8">
		</colgroup>
		<thead>
			<tr>
				<th scope="col" rowspan="2">통화코드</th>
				<th scope="col" rowspan="2">국가명</th>
				<th scope="colgroup" colspan="2" class="col">송금</th>
				<th scope="colgroup" colspan="2" class="col">현찰</th>
				<th scope="col" rowspan="2">매매<br>기준율</th>
				<th scope="col" rowspan="2">대미<br>환산율</th>
				<th scope="col" rowspan="2">날짜</th>
			</tr>
			<tr>
				<th scope="col" class="row">보내실때</th>
				<th scope="col" class="row">받으실때</th>
				<th scope="col" class="row">사실때</th>
				<th scope="col" class="row dth-r">파실때</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="exchange" items="${exchanges}" >
			<tr>
				<td>${exchange.monetaryCode}</td>
				<td>${exchange.nation}</td>
				<td>${exchange.transferSend}</td>
				<td>${exchange.transferReceive}</td>
				<td>${exchange.cashSend}</td>
				<td>${exchange.cashReceive}</td>
				<td>${exchange.saleStandard}</td>
				<td>${exchange.usdExchangeRate}</td>
				<td>${exchange.date}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
