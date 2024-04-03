<%@ include file="/init.jsp" %>

<head>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.20.0/jquery.validate.min.js"
        integrity="sha512-WMEKGZ7L5LWgaPeJtw9MBM4i5w5OSBlSjTjCtSnvFJGSVD26gE5+Td12qN5pvWXhuWaWcVwF++F7aqu9cvqP0A=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>

</head>

<body>
    <p>
        <form action="<portlet:actionURL name="submitDepartment" />" method="post" id="departmentForm">
            <div class="form-group">
                <label class="" for="departmentName">Department Name</label>
                <input id="departmentName" placeholder="Enter Department Name" class="form-control" type="text"
                    name="<portlet:namespace/>departmentName" value="">
                <label id="departmentName-error" class="error text-danger" for="departmentName"></label>
            </div>
            <div class="form-group">
                <button class="btn btn-primary" type="submit">Submit</button>
            </div>
        </form>
    </p>
    <script>
        $(document).ready(function () {
            $("#departmentForm").validate({
                rules: {
                    "<portlet:namespace/>departmentName": "required"
                },
                messages: {
                    "<portlet:namespace/>departmentName": "Please enter Department Name"
                },
                errorPlacement: function (error, element) {
                    error.insertAfter(element);
                }
            });
        });
    </script>
</body>