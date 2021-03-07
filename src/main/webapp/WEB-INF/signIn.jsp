<!--  
 * Ibrahim Ali
 * 301022172
 * 09-03-2021
 * */
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title> Sign In</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
    <div class="container pt-4">
        <form method="post" action="${pageContext.request.contextPath}/submitSignIn">
            <div class="text-center p-4">
                <h2>Sign In</h2>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Email: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control" placeholder="Enter your email" name="email" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Password: </label>
                    </div>
                    <div class="col-4">
                        <input type="password" class="form-control" placeholder="Enter your password" name="password" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5"></div>
                    <div class="col-4">
                        <input type="submit" class="btn btn-lg btn-success" value="Login" name="submit">
                    </div>
                </div>
            </div>
            <div class="text-center mt-5">
				<a href="${pageContext.request.contextPath}/" class="btn btn-large btn-primary">Main Page</a>
            </div>
        </form>
    </div>
</body>
</html>
