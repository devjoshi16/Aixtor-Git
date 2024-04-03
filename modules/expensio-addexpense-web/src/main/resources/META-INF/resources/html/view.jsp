<%@ include file="/html/init.jsp"%>
<portlet:actionURL name="/addExpenseDetails" var="getExpenseDetails" />
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
</head>
<div class="container">
	<div class="row ">
		<div class="col-lg-7 mx-auto">
			<div class="card mt-2 mx-auto p-4 bg-light">
				<div class="card-body bg-light">
					<div class="container">
						<form action="${getExpenseDetails}" method="post" id="add-expense-form" role="form" onsubmit="return validateExpenseForm()">
							<h2>Add Expense</h2>
							<div class="controls">
								<div class=" text-center mt-3 ">
										
										<%-- <h2>${categoryList}</h2> --%>
									</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="ExpenseName">Expense Name *</label>
											 <input id="ExpenseName" type="text" name="<portlet:namespace />ExpenseName" class="form-control" placeholder="enter Expense NAME *"
												>
												<span id="expenseIdError" style="color: red;" class="error"></span>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="CategoryId">Category Name *</label>
											 <select
												id="CategoryId" name="<portlet:namespace />CategoryId" class="form-control">
												<option value="" selected disabled>--Select Expense Name--</option>
												<option value="online">Food</option>
												<option value="offline">event</option>
												<option value="offline">Trip Expense</option>
											</select>
											<span id="categoryNameError" style="color: red;" class="error"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="SubCategoryId">Subcategory Name *</label> <select
												id="SubCategoryId" name="<portlet:namespace />SubCategoryId" class="form-control">
												<option value="" selected disabled>--Select Expense Name --</option>
												<option value="online">vadaPav</option>
												<option value="offline">Trip Expense</option>
											</select>
											<span id="subcategoryNameError" style="color: red;" class="error"></span>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="ExpenseAmount">Expense Amount *</label> <input
												id="ExpenseAmount" type="number" name="<portlet:namespace />ExpenseAmount"
												class="form-control"
												placeholder="Please enter Expense Amount *">
												<span id="expenseAmountError" style="color: red;" class="error"></span>
										</div>
										
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="ExpenseDate">Expense Date *</label> <input
												id="ExpenseDate" type="date" name="<portlet:namespace />ExpenseDate"
												class="form-control">
												<span id="expenseDateError" style="color: red;" class="error"></span>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="PaymentMethod">Payment Method *</label>
											<select id="PaymentMethod" name="<portlet:namespace />PaymentMethod" class="form-control">
												<option value="" selected disabled>--Select Payment Method--</option>
												<option value="online">Online</option>
												<option value="offline">Offline</option>
											</select>
											<span id="paymentMethodError" style="color: red;" class="error"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="UserId">User Name *</label> 
											<%-- <input id="UserId"
												type="text" name="<portlet:namespace />UserId" class="form-control"
												placeholder="Please enter User ID *"> --%>
												
												<select	id="UserId" name="<portlet:namespace />UserId" class="form-control">
													<option> -- Select User Name -- </option>
													<c:forEach var="user" items="${userNameList}">
														<option  value="${user.userId}">${user.firstName }${user.lastName}</option>
													</c:forEach>
												</select>
												<span id="userIdError" style="color: red;" class="error"></span>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="ReceiptAttachment">Receipt Attachment</label> <input
												id="ReceiptAttachment" type="file" name="<portlet:namespace />ReceiptAttachment"
												class="form-control">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label for="Notes">Notes/Comments</label>
											<textarea id="Notes" name="<portlet:namespace />Notes" class="form-control"
												placeholder="Write your Notes/Comments here." rows="4"></textarea>
												<span id="NotesError" style="color: red;" class="error"></span>
										</div>
									</div>
									<div class="col-md-12">
										<input type="submit"
											class="btn btn-success btn-send  pt-2 btn-block"
											value="Add Expense">
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
    function validateExpenseForm() {
        // Reset all previous error messages
        document.querySelectorAll('.error').forEach(el => el.textContent = '');

        // Fetch form inputs
        var expenseName = document.getElementById('ExpenseName').value;
        var categoryId = document.getElementById('CategoryId').value;
        var subCategoryId = document.getElementById('SubCategoryId').value;
        var expenseAmount = document.getElementById('ExpenseAmount').value;
        var expenseDate = document.getElementById('ExpenseDate').value;
        var paymentMethod = document.getElementById('PaymentMethod').value;
        var userId = document.getElementById('UserId').value;
		var Notes=document.getElementById('Notes').value;
        
        // Flag to track if there are any validation errors
        var hasError = false;

        // Perform validation for each field
        if (!expenseName) {
            document.getElementById('expenseIdError').textContent = 'Expense Name is required.';
            hasError = true;
        }
        if(categoryId == ""){
        	document.getElementById('categoryNameError').textContent = 'Select Category Name.';
        	hasError = true;
        }
        
        if(subCategoryId == ""){
        	document.getElementById('subcategoryNameError').textContent = 'Select Sub-Category Name.';
        	hasError=true;
        }
        
        console.log("expense Amount " +expenseAmount)
        if(!expenseAmount){
        	document.getElementById('expenseAmountError').textContent = 'Enter expense-amount Name.';
        	hasError=true;
        }
        
        if(!expenseDate){
        	document.getElementById('expenseDateError').textContent = 'select expenseDate Name.';
        	hasError=true;
        }
        
        if(paymentMethod == ""){
        	document.getElementById('paymentMethodError').textContent = 'select paymentMethod Name.';
        	hasError=true;
        }
        console.log("expense userId " +userId)
        if(!userId){
        	document.getElementById('userIdError').textContent = 'enter User Name.';
        	hasError=true;
        }

        if(Notes == ""){
        	document.getElementById('NotesError').textContent = 'enter any comment !!';
        }
        
        // If there are errors, prevent form submission
        if (hasError) {
            return false;
        }

        // If no errors, allow form submission
        return true;
    }
</script>

<style>
h1 {
	margin-bottom: 20px;
}

label {
	color: #333;
}

.btn-send {
	font-weight: 250;
	text-transform: uppercase;
	letter-spacing: 0.2em;
	width: 85%;
	margin-left: 3px;
}

.help-block.with-errors {
	color: #ff5050;
	margin-top: 5px;
}

.card {
	margin-left: 10px;
	margin-right: 10px;
}
</style>

