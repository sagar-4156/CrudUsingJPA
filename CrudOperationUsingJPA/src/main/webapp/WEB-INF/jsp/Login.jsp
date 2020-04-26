<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<c:url value="/css/loginstyle.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>TrainingManagementSystem</title>
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">Training Management System</h5>
						<form class="form-signin"  action="success" method="post">
							<div class="form-label-group">
								<input type="text" name="empId" class="form-control"
									placeholder="empId" required autofocus> 
									<label>UserId</label>
							</div>

							<div class="form-label-group">
								<input type="password" name="password" class="form-control"
									placeholder="Password" required autofocus>
									 <label>Password</label>
							</div>

						
							<button class="btn btn-lg btn-primary btn-block text-uppercase"
								type="submit">Sign in</button>
							<hr class="my-4">
							
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>