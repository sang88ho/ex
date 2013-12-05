<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<t:insertAttribute name="header"/>
	</head>
	<body>
		<nav class="navbar navbar-default" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-ex1-collapse">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="<c:url value="/"/>">Home</a>
				</div>
		
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-ex1-collapse">
					<ul class="nav navbar-nav">
						<li><a href="<c:url value="/featured"/>">Sam</a></li>
						<li><a href="<c:url value="/list"/>">Graph</a></li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Search</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
							<li><a href="<c:url value="/signin"/>">Sign in</a></li>
						<%--
						<social:connected provider="facebook">
							<li><a href="${contextPath}/facebook">Facebook</a></li>
						</social:connected>
						--%>
					</ul>
				</div>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
	
		<div class="container">
			<t:insertAttribute name="body"/>
		</div>

	 	<%@ include file="/WEB-INF/views/layout/javascript.jsp"%>
	</body>
</html>


