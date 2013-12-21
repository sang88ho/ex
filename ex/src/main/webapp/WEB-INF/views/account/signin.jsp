<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="signin-wrapper">
	<div id="signin">
		<fieldset>
			<legend>Sign in</legend>
	
			<form name="loginForm" action="<c:url value="/login"/>" method="post" role="form">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<div class="form-group">
					<label for="username">Username</label>
					<input type="text" id="username" name="username" class="form-control"
						<c:if test="${not empty param.loginError}">
							value="<c:out value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}"/>"
						</c:if>>
					<p class="help-block"><small>아직도 회원이 아닌신가요? <a href="<c:url value="/signup"/>">가입하기</a></small></p>
				</div>
				<div class="form-group">
					<label for="password">Password</label>
					<input type="password" id="password" name="password" class="form-control">
				</div>
				<button type="submit" class="btn btn-primary pull-right">Sign in</button>
			</form>
		</fieldset>
	</div>
</div>
