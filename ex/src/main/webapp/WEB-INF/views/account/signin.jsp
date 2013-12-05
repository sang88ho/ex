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
					<p class="help-block"><small>New to Happy Wedding? <a href="<c:url value="/signup"/>">Sign up</a></small></p>
				</div>
				<div class="form-group">
					<label for="password">Password</label>
					<input type="password" id="password" name="password" class="form-control">
				</div>
				<div class="checkbox">
					<label for="_spring_security_remember_me">
						Remember me <input type="checkbox" id="_spring_security_remember_me" name="_spring_security_remember_me" value="true" checked="checked">
	                </label>
				</div>
				<button type="submit" class="btn btn-primary pull-right">Sign in</button>
			</form>
		</fieldset>
	</div>
	
	<div id="social-signin">
		<fieldset>
	    	<legend>Also, you can</legend>
			<!-- facebook signin -->
			<form id="fb_signin" action="<c:url value="/signin/facebook"/>" method="POST">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }" />
				<button type="submit" class="btn btn-facebook btn-social-signin">
					<i class="icon-facebook icon-social-signin"></i>
					<div class="social-signin-content"> | Sign in with Facebook </div>
				</button>
			</form>
			<br>
			
			<!-- twitter signin -->
			<form id="tw_signin" action="<c:url value="/signin/twitter"/>" method="POST">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<button type="submit" class="btn btn-twitter btn-social-signin">
					<i class="icon-twitter icon-social-signin"></i>
					<div class="social-signin-content"> | Sign in with Twitter </div>
				</button>
			</form>
			
			<!-- linkedin signin -->
			<!-- 
			<form id="li_signin" action="<c:url value="/signin/linkedin"/>" method="POST">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<button type="submit" class="btn btn-linkedin btn-social-signin">
					<i class="icon-linkedin icon-social-signin"></i>
					<div class="social-signin-content"> | Sign in with LinkedIn </div>
				</button>
			</form>
			-->
			
			<!-- google plus signin -->
			<!-- 
			<form id="gp_signin" action="<c:url value="/signin/google"/>" method="POST">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<button type="submit" class="btn btn-google-plus btn-social-signin">
					<i class="icon-google-plus icon-social-signin"></i>
					<div class="social-signin-content"> | Sign in with Google Plus </div>
				</button>
			</form>
			 -->
		</fieldset>
		
<%--
		<fieldset>
	    <legend>Log In With Twitter and Facebook</legend>
		    <ol>
		        <li>
		            <form id="tw_signin" action="<c:url value="/signin/twitter"/>" method="POST">
		                <a href="javascript:document.forms.tw_signin.submit()" title="Log In With Twitter">Log In With
		                    Twitter</a>
		            </form>
		        </li>
		        <li>
		            <form id="fb_signin" action="<c:url value="/connect/facebook"/>" method="POST">
		                <a href="javascript:document.forms.fb_signin.submit()" title="Log In With Facebook">Log In With
		                    Facebook</a>
		            </form>
		        </li>
		    </ol>
		</fieldset>
 --%>
	</div>
</div>
