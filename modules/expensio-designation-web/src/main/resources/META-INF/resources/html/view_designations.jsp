<%@ include file="/init.jsp" %>
<portlet:renderURL var="designationForm" >
	 <portlet:param name="mvcRenderCommandName" value="/addDesignation"/>
</portlet:renderURL>

<p>
<table class="table table-autofit">
      <thead>
         <tr class="">
            <th class="">Designation ID</th>
            <th class="">Designation Name</th>
            <th class="">Department Name</th>
            <th class="">Created At</th>

         </tr>
      </thead>
      <tbody>

         <c:forEach items="${designations}" var="designation" varStatus="s">
            <tr>

            <td> ${designation.designationId}</td>
            <td> ${designation.designationName}</td>
            <td> ${departments.get(s.index)}</td>
            <td> ${designation.createDate}</td>

            </tr>
         </c:forEach>
      </tbody>


</table>
<div class="text-right">
       <a href="${designationForm}" class="btn  btn-primary mt-3 pull-right ">Add Designation</a>
</div>

</p>