<%@ include file="/init.jsp" %>
<portlet:renderURL var="departmentForm">
	<portlet:param name="mvcPath" value="/html/add_department.jsp" />
</portlet:renderURL>

<p>
<table class="table table-autofit">
      <thead>
         <tr class="">
            <th class="">Department ID</th>
            <th class="">Department Name</th>
            <th class="">Created At</th>

         </tr>
      </thead>
      <tbody>

         <c:forEach items="${departments}" var="department" varStatus="s">
            <tr>

            <td> ${department.departmentId}</td>
            <td> ${department.departmentName}</td>
            <td> ${department.createDate}</td>

            </tr>
         </c:forEach>
      </tbody>


</table>
<div class="text-right">
       <a href="${departmentForm}" class="btn  btn-primary mt-3 pull-right ">Add Department</a>
</div>

</p>