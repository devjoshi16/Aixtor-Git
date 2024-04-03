package com.expensio.module.registration.action;

import com.expensio.common.data.model.Employees;
import com.expensio.common.data.service.EmployeesLocalService;
import com.expensio.module.registration.constants.ExpensioRegistrationPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {

		"javax.portlet.name=" +ExpensioRegistrationPortletKeys.EXPENSIOREGISTRATION,
		"mvc.command.name=addUser" }, service = MVCActionCommand.class)

public class InsertEmployeeMVCActionCommand extends BaseMVCActionCommand{

	private static Log log = LogFactoryUtil.getLog(InsertEmployeeMVCActionCommand.class);

	@Reference
	UserLocalService userLocalService;
	
	@Reference
	EmployeesLocalService employeeLocalService;
	
	

	
	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse actionResponse) throws Exception {

		ThemeDisplay tDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = tDisplay.getUserId();
		long employeeId = CounterLocalServiceUtil.increment();
		long companyId = tDisplay.getCompanyId();
		Locale locale = tDisplay.getLocale();
		Date createDate = new Date();
		long newUserId=0;

		String emailAddress = ParamUtil.getString(request, "emailAddress");
		String firstName = ParamUtil.getString(request, "firstName");
		String lastName = ParamUtil.getString(request, "lastName");
		String jobTitle = ParamUtil.getString(request, "designation");
		String birthday = ParamUtil.getString(request, "birthday");
		String department = ParamUtil.getString(request, "department");
		int day = 1;
		int month = 0;
		int year = 1970;
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
			day = date.getDate();
			year = date.getYear();
			month = date.getMonth();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String password1 = ParamUtil.getString(request, "newPassword");
		String password2 = ParamUtil.getString(request, "againPassword");
		User addUser=null;
		try {
			String roleName = "User";
			long roleId = RoleLocalServiceUtil.getRole(companyId, roleName).getRoleId();
			 addUser = userLocalService.addUser(tDisplay.getUserId(), companyId, false, password1, password2, false, 
					firstName+"."+lastName, emailAddress, locale, firstName, "", lastName, 0l, 0l, false, month, day, year, 
					jobTitle, 1, new long[] {tDisplay.getScopeGroupId()}, null, new long[] {roleId}, null, false, new ServiceContext());
			if (Validator.isNotNull(addUser)) {
				userLocalService.updateUser(addUser);
				
			}
		} catch (Exception e) {
			log.error(e.getMessage() , e);
		}
		
		
		
		
		try {
			Employees employee  = employeeLocalService.createEmployees(employeeId);
			employee.setCompanyId(companyId);
			employee.setCreateDate(createDate);
			employee.setDepartment(department);
			employee.setDesignation(jobTitle);
			employee.setEmployeeId(employeeId);
			employee.setEmployeeUserId(addUser.getUserId());
			employee.setModifiedDate(createDate);
			employee.setUserId(addUser.getUserId());
			employee.setUserName(firstName+" "+lastName);
			employeeLocalService.addEmployees(employee);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		log.info("Data Added");
		log.info("user:"+ userLocalService.getUser(userId));
		
	}
	
	


}
