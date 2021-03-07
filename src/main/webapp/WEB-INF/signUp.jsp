<!--  
 * Ibrahim Ali
 * 301022172
 * 09-03-2021
 * */
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign Up</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
 	<div class="container pt-4">
        <form method="post" action="${pageContext.request.contextPath}/submitSignUp">
            <div class="text-center p-4">
                <h2>Sign Up</h2>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">First Name: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control" placeholder="Enter your first name" name="firstName" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Last Name: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control" placeholder="Enter your last name" name="lastName" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Phone: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control"  placeholder="Enter your phone" name="phone" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Address City: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control"  placeholder="Enter your address city" name="addressCity" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Postal Code: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control"  placeholder="Enter your postal code" name="postalCode" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Gym Location: </label>
                    </div>
                    <div class="col-4">
                         <select id="gymId" name="gymId" class="form-control">
					        <option value="1">Toronto</option>
					        <option value="2">Ottawa</option>
					        <option value="3">Niagra Falls</option>								        
					      </select>
                    </div>
                </div>
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
                        <input type="text" class="form-control" placeholder="Enter your password" name="password" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 "></div>
                    <div class="col-4">
                        <input type="submit" class="btn btn-lg btn-success" value="Sign Up" name="submit">
                    </div>
                </div>
            </div>
            <div class="text-center mt-5">
                <a href="/" class="btn btn-lg btn-primary"> Main Page</a>
            </div>
        </form>
    </div>
</body>
</html>