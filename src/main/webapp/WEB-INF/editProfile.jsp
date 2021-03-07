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
	<title>Edit Profile</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
 	<div class="container pt-4">
        <form method="post" action="${pageContext.request.contextPath}/editProfile">
           	<input type="hidden" name="memberId" value="${memberId}">
        
            <div class="text-center p-4">
                <h2>Edit Profile</h2>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">First Name: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control" placeholder="Enter your first name" name="firstName" value="${firstName}" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Last Name: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control" placeholder="Enter your last name" name="lastName" value="${lastName}" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Phone: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control"  placeholder="Enter your phone" value="${phone}" name="phone" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Address City: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control"  placeholder="Enter your address city" value="${addressCity}" name="addressCity" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Postal Code: </label>
                    </div>
                    <div class="col-4">
                        <input type="text" class="form-control"  placeholder="Enter your postal code" value="${postalCode}" name="postalCode" required>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 text-right">
                        <label style="font-weight: bold;">Gym Location: </label>
                    </div>
                    <div class="col-4">
                         <select id="gymId" name="gymId" value="${gymId}" class="form-control">
					        <option value="1">Toronto</option>
					        <option value="2">Ottawa</option>
					        <option value="3">Niagra Falls</option>								        
					      </select>
                    </div>
                </div>
            </div>
            <div class="col-12">
                <div class="row p-2">
                    <div class="col-5 "></div>
                    <div class="col-4">
                        <input type="submit" class="btn btn-lg btn-success" value="Edit Profile">
                    </div>
                </div>
            </div>
            <div class="col-12 mt-5">
				<div class="row text-center">
					 <div class="col-12">
						<a href="${pageContext.request.contextPath}/" class="btn btn-large btn-primary">Main Page</a>
					</div>
				</div>
			</div>
        </form>
    </div>
</body>
</html>