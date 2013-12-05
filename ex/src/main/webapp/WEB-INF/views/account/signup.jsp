<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="signup-wrapper">
	<div id="signup">
		<fieldset>
			<legend>Sign up</legend>
			<form class="form-horizontal" action="<c:url value="/signup"/>" method="post" role="form">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }" />
				<div class="form-group">
					<label for="inputEmail1" class="col-lg-3 control-label">Username</label>
					<div class="col-lg-9">
						<input type="text" name="username" class="form-control" id="inputEmail1" placeholder="Email">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword1" class="col-lg-3 control-label">Password</label>
					<div class="col-lg-9">
						<input type="password" name="password" class="form-control" id="inputPassword1" placeholder="Password">
					</div>
				</div>
				<div class="form-group">
					<label for="inputLastName" class="col-lg-3 control-label">Last Name</label>
					<div class="col-lg-9">
						<input type="text" name="lastName" class="form-control" id="inputLastName" placeholder="Last Name">
					</div>
				</div>
				<div class="form-group">
					<label for="inputFirstName" class="col-lg-3 control-label">First Name</label>
					<div class="col-lg-9">
						<input type="text" name="firstName" class="form-control" id="inputFirstName" placeholder="First Name">
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-12">
						<button type="submit" class="btn btn-default pull-right">Sign up</button>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>
