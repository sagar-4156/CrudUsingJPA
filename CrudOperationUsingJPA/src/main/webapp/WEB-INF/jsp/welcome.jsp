<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<!-- Access the bootstrap Css like this,
		Spring boot will handle the resource mapping automcatically -->
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>


	<div class="container">

		<div class="starter-template" align="center">
			<form class="form-horizontal" action="success" method="post">
				<div class="control-group">
					<label class="control-label" for="empId">UserID:</label>
					<div class="controls">
						<input type="text" name="empId" required />
					</div>

				</div>
				<div class="control-group">
					<label class="control-label" for="password">Password:</label>
					<div class="controls">
						<input type="password" name="password" required />
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<input value="SignIn" class="btn btn-primary" type="submit">

					</div>
				</div>
			</form>

		</div>

	</div>

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>