<!--  
 * Ibrahim Ali
 * 301022172
 * 20-03-2021
 * */
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
	<title>Gym</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
    <div class="container pt-4 text-center">
        <div class="p-4">
            <h2>Ibrahim Ali - 301022172 - Assignment2</h2>
        </div>
        <div class="col-12 mt-5">
            <div class="row">
                <div class="col-6 text-right">
                    <a href="${pageContext.request.contextPath}/signIn" class="btn btn-lg btn-primary">Sign In</a>
                </div>
                <div class="col-6 text-left">
                    <a href="${pageContext.request.contextPath}/signUp" class="btn btn-lg btn-primary">Sign Up</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

