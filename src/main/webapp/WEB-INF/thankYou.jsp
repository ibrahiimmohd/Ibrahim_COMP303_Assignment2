<!--  
 * Ibrahim Ali
 * 301022172
 * 20-03-2021
 * */
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Thank You</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<main class="container">
		<div class="row text-center">
	       	<div class="col-12">
				<div class="row p-3 g-3">
					<div class="col-12">
						<font size="5">Thank you <span style="font-weight: bold;">${firstName} ${lastName}</span></font>									
					</div>
					<div class="col-12 mt-5">
						<div class="row text-center">
							 <div class="col-12">
								<a href="${pageContext.request.contextPath}/" class="btn btn-large btn-primary">Main Page</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<!-- /.container -->
</body>
</html>