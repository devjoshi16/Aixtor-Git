<%@ include file="/init.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: dev.joshi
  Date: 03-Apr-24
  Time: 12:58 PM
  To change this template use File | Settings | File Templates.
--%>
<portlet:actionURL name="/AddBudget" var="AddBudget"/>

<form action="" method="post" name="configurationForm" class="container">
    <fieldset>
        <legend>Expense Details</legend>
        <div class="form-group">
            <label for="<portlet:namespace />department">Department:</label>
            <select class="form-control" id="<portlet:namespace />department" name="<portlet:namespace />department">
                <option value="HR">HR</option>
                <option value="Development">Development</option>
            </select></div>

        <div class="form-group">
            <label for="<portlet:namespace />remainingAmount">Amount:</label>
            <input type="number" class="form-control" id="<portlet:namespace />Amount"
                   name="<portlet:namespace />Amount">
        </div>
        <div class="form-group">
            <label for="<portlet:namespace />duration">Duration:</label>
            <input type="date" class="form-control" id="<portlet:namespace />duration"
                   name="<portlet:namespace />duration">
        </div>
        <div class="form-group">
            <label for="<portlet:namespace />description">Description:</label>
            <textarea class="form-control" id="<portlet:namespace />description"
                      name="<portlet:namespace />description"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </fieldset>
</form>
