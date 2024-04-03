<%@ include file="/init.jsp" %>

<portlet:renderURL var="addBudgetRenderURL">
    <portlet:param name="mvcPath" value="/html/addBudget.jsp"/>
    <portlet:param name="cmd" value="add"/>
</portlet:renderURL>
<a class="btn btn-primary" href="${addBudgetRenderURL}">Add Department</a>

<div class="container-fluid">
    <h2 class="mt-4 mb-4">Expense Report</h2>

    <div class="table-responsive">
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Department</th>
                <th scope="col">Start Date</th>
                <th scope="col">Remaining Amount</th>
                <th scope="col">Duration</th>
                <th scope="col">Description</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="department" items="${DepartmentList}">
                <tr>
                    <td>${department.getName()}</td>
                    <td>${department.getDepartmentHead()}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
