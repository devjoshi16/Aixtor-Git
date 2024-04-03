package com.expensio.addexpense.web.action;

import com.expensio.addexpense.web.constants.ExpensioAddexpenseWebPortletKeys;
import com.expensio.common.data.model.Expenses;
import com.expensio.common.data.service.ExpensesLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + ExpensioAddexpenseWebPortletKeys.EXPENSIOADDEXPENSEWEB,
			"mvc.command.name=/addExpenseDetails"
		},
		service = MVCActionCommand.class
	)
public class InsertExpansionDetailsMVCActionCommand extends BaseMVCActionCommand{

	@Reference
	ExpensesLocalService expensesLocalService;
	
	private static final Log log = LogFactoryUtil.getLog(InsertExpansionDetailsMVCActionCommand.class);
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		log.info("action method called");
		try {
			String expenseName= ParamUtil.getString(actionRequest, "ExpenseName");
			String categoryName= ParamUtil.getString(actionRequest, "CategoryId");
			String subCategoryName= ParamUtil.getString(actionRequest, "SubCategoryId");
			String expenseAmount= ParamUtil.getString(actionRequest, "ExpenseAmount");
			String expenseDate= ParamUtil.getString(actionRequest, "ExpenseDate");
			String paymentMethod= ParamUtil.getString(actionRequest, "PaymentMethod");
			String userId= ParamUtil.getString(actionRequest, "UserId");
			String receiptAttachment= ParamUtil.getString(actionRequest, "ReceiptAttachment");
			String notes= ParamUtil.getString(actionRequest, "Notes");
			
			log.info("expenseName ==> " + expenseName);
			log.info("categoryId ==>" + categoryName);
			log.info("subCategoryId == >" + subCategoryName);
			log.info("expenseAmount ==>" + expenseAmount);
			log.info("expenseDate ==>" + expenseDate);
			log.info("paymentMethod ==>" + paymentMethod);
			log.info("userId ==>" + userId);
			log.info("receiptAttachment ==>" + receiptAttachment);
			log.info("notes ==> " + notes);
		
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			Expenses expense=expensesLocalService.createExpenses(CounterLocalServiceUtil.increment(Expenses.class.getName()));
			
			expense.setCompanyId(themeDisplay.getCompanyId());
			expense.setUserName(themeDisplay.getUser().getFullName());
			expense.setCreateDate(new Date());
			expense.setModifiedDate(new Date());
			expense.setUserId(themeDisplay.getUserId());
			
//			expense.setCachedModel(cachedModel);
//			expense.setSubCategoryId(subCategoryId);
//			log.info("Add Details  Action Called");
//			String firstName = ParamUtil.getString(actionRequest, AixtorEmployeeWebConstant.FIRST_NAME);
//			String lastName = ParamUtil.getString(actionRequest, AixtorEmployeeWebConstant.LAST_NAME);
//			String email = ParamUtil.getString(actionRequest, AixtorEmployeeWebConstant.EMAIL);
//			Long mobileNumber = ParamUtil.getLong(actionRequest, AixtorEmployeeWebConstant.MOBILE_NUMBER);
//			Long departmentHead = ParamUtil.getLong(actionRequest, AixtorEmployeeWebConstant.DEPARTMENT_HEAD);
//			Long branch = ParamUtil.getLong(actionRequest, AixtorEmployeeWebConstant.BRANCH);
//
//			Long designationName = ParamUtil.getLong(actionRequest, AixtorEmployeeWebConstant.DESIGNATION_NAME);
//			String address = ParamUtil.getString(actionRequest, AixtorEmployeeWebConstant.ADDRESS);
//
//			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
//
//			Employee employee = employeeLocalService
//					.createEmployee(CounterLocalServiceUtil.increment(Employee.class.getName()));
//
//			employee.setCompanyId(themeDisplay.getCompanyId());
//			employee.setUserName(themeDisplay.getUser().getFullName());
//			employee.setCreateDate(new Date());
//			employee.setModifiedDate(new Date());
//			employee.setUserId(themeDisplay.getUserId());
//
//			employee.setFirstName(firstName);
//			employee.setLastName(lastName);
//			employee.setEmail(email);
//			employee.setMobileNumber(mobileNumber);
//			employee.setDepartmentId(departmentHead);
//			employee.setDesignationId(designationName);
//			employee.setBranchId(branch);
//			employee.setAddress(address);
//			
//			employeeLocalService.addEmployee(employee);			
//			SessionMessages.add(actionRequest, "successKey", "Inserted Successfully Record");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
