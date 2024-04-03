<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="init.jsp" %>

<portlet:actionURL name="addUser" var="addUserActionURL" />

<form action="${addUserActionURL}" name="userForm" method="POST" class="needs-validation" novalidate>

	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="emailAddress">Email Address</label>
			<input type="email" required class="form-control" id="emailAddress" name="<portlet:namespace/>emailAddress" />
			<div class="invalid-feedback">
				Please provide a valid email address.
			</div>
		</div>
		
		<div class="form-group col-md-6">
			<label for="phoneNumber">Phone Number</label>
			<input type="tel" required class="form-control" id="phoneNumber" name="<portlet:namespace/>phoneNumber" />
			<div class="invalid-feedback">
				Please provide a valid phone number.
			</div>
		</div>
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="firstName">First Name</label>
			<input type="text" required class="form-control" id="firstName" name="<portlet:namespace/>firstName" />
			<div class="invalid-feedback">
				Please provide a first name.
			</div>
		</div>
		
		<div class="form-group col-md-6">
			<label for="lastName">Last Name</label>
			<input type="text" required class="form-control" id="lastName" name="<portlet:namespace/>lastName" />
			<div class="invalid-feedback">
				Please provide a last name.
			</div>
		</div>
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="designation">Designation</label>
			<input type="text" required class="form-control" id="designation" name="<portlet:namespace/>designation" />
			<div class="invalid-feedback">
				Please provide a designation.
			</div>
		</div>
		
		<div class="form-group col-md-6">
			<label for="department">Department</label>
			<input type="text" required class="form-control" id="department" name="<portlet:namespace/>department" />
			<div class="invalid-feedback">
				Please provide a department.
			</div>
		</div>
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="birthday">Birthday</label>
			<input type="date" required class="form-control" id="birthday" name="<portlet:namespace/>birthday" />
			<div class="invalid-feedback">
				Please provide a valid birthday.
			</div>
		</div>
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="newPassword">New Password</label>
			<input type="password" required class="form-control" id="newPassword" name="<portlet:namespace/>newPassword" />
			<div class="invalid-feedback">
				Please provide a new password.
			</div>
		</div>
		
		<div class="form-group col-md-6">
			<label for="againPassword">Enter Password Again</label>
			<input type="password" required class="form-control" id="againPassword" name="<portlet:namespace/>againPassword" />
			<div class="invalid-feedback">
				Please enter the password again.
			</div>
		</div>
	</div>
	
	<button class="btn btn-primary col-md-2" type="submit">Submit</button>
</form>

<script>
	// Example starter JavaScript for disabling form submissions if there are invalid fields
	(function () {
	  'use strict'

	  // Fetch all the forms we want to apply custom Bootstrap validation styles to
	  var forms = document.querySelectorAll('.needs-validation')

	  // Loop over them and prevent submission
	  Array.prototype.slice.call(forms)
	    .forEach(function (form) {
	      form.addEventListener('submit', function (event) {
	        if (!form.checkValidity()) {
	          event.preventDefault()
	          event.stopPropagation()
	        }

	        form.classList.add('was-validated')
	      }, false)
	    })
	})()
</script>
