<%@ include file="/html/init.jsp"%>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
</head>
<div class="container">
	<div class=" text-center mt-5 ">
		<h1>Add Expense</h1>
	</div>
	<div class="row ">
		<div class="col-lg-7 mx-auto">
			<div class="card mt-2 mx-auto p-4 bg-light">
				<div class="card-body bg-light">
					<div class="container">
						<form id="contact-form" role="form">
							<div class="controls">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="ExpenseId">Expense Name *</label> <input
												id="ExpenseId" type="text" name="<portlet:namespace />ExpenseId"
												class="form-control" placeholder="Please enter Expense ID *"
												required="required" data-error="Expense ID is required.">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="CategoryId">Category Name *</label> <select
												id="CategoryId" name="<portlet:namespace />CategoryId" class="form-control"
												required="required" data-error="Please specify Expense .">
												<option value="" selected disabled>--Select Expense
													Name--</option>
												<option value="online">Food</option>
												<option value="offline">event</option>
												<option value="offline">Trip Expense</option>
											</select>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="SubCategoryId">Subcategory Name *</label> <select
												id="SubCategoryId" name="<portlet:namespace />SubCategoryId" class="form-control"
												required="required" data-error="Please specify Expense .">
												<option value="" selected disabled>--Select Expense
													Name--</option>
												<option value="online">vadaPav</option>
												<option value="offline">Trip Expense</option>
											</select>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="ExpenseAmount">Expense Amount *</label> <input
												id="ExpenseAmount" type="text" name="<portlet:namespace />ExpenseAmount"
												class="form-control"
												placeholder="Please enter Expense Amount *"
												required="required" data-error="Expense Amount is required.">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="ExpenseDate">Expense Date *</label> <input
												id="ExpenseDate" type="date" name="<portlet:namespace />ExpenseDate"
												class="form-control" required="required"
												data-error="Expense Date is required.">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="PaymentMethod">Payment Method *</label> <select
												id="PaymentMethod" name="<portlet:namespace />PaymentMethod" class="form-control"
												required="required"
												data-error="Please specify Payment Method.">
												<option value="" selected disabled>--Select Payment
													Method--</option>
												<option value="online">Online</option>
												<option value="offline">Offline</option>
											</select>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="UserId">User ID *</label> <input id="UserId"
												type="text" name="<portlet:namespace />UserId" class="form-control"
												placeholder="Please enter User ID *" required="required"
												data-error="User ID is required.">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="ReceiptAttachment">Receipt Attachment</label> <input
												id="ReceiptAttachment" type="file" name="ReceiptAttachment"
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
<style>
h1 {
	margin-bottom: 40px;
}

label {
	color: #333;
}

.btn-send {
	font-weight: 300;
	text-transform: uppercase;
	letter-spacing: 0.2em;
	width: 80%;
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
