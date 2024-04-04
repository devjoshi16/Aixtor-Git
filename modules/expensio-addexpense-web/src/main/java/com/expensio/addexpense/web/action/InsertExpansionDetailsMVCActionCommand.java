package com.expensio.addexpense.web.action;

import com.expensio.addexpense.web.constants.ExpensioAddexpenseWebPortletKeys;
import com.expensio.common.data.model.Expenses;
import com.expensio.common.data.service.ExpensesLocalService;
import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.exception.FileSizeException;
import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

import javax.activation.MimeType;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + ExpensioAddexpenseWebPortletKeys.EXPENSIOADDEXPENSEWEB,
		"mvc.command.name=/addExpenseDetails" }, service = MVCActionCommand.class)
public class InsertExpansionDetailsMVCActionCommand extends BaseMVCActionCommand {

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
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			
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
			
			expense.setExpenseAmount(Long.parseLong(expenseAmount));

			    InputStream inputStream = uploadPortletRequest.getFileAsStream("ReceiptAttachment");
			    String fileName = uploadPortletRequest.getFileName("ReceiptAttachment");
			    File file=uploadPortletRequest.getFile("ReceiptAttachment");

			    long folderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
			    String folderName = "reciept";

			   try {
				   Folder folder = null;
				   folder = DLAppLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), folderId, folderName);
				   System.out.println("folder" + folder);
				   
				   ServiceContext serviceContext = ServiceContextFactory.getInstance(Folder.class.getName(), actionRequest);
				   				serviceContext.setAddGroupPermissions(true);
				   				serviceContext.setAddGuestPermissions(false);
//				   				folder = DLAppLocalServiceUtil.addFolder(StringPool.BLANK,Long.parseLong(userId), themeDisplay.getScopeGroupId(), folderId, folderName, StringPool.BLANK, serviceContext);
				   				
				   				FileEntry entry = DLAppLocalServiceUtil.addFileEntry(Long.parseLong(userId), themeDisplay.getScopeGroupId(), folder.getFolderId(), fileName, MimeTypesUtil.getContentType((java.io.File) file), fileName, StringPool.BLANK, StringPool.BLANK, file, serviceContext);
				   				expense.setDocMedia(String.valueOf(entry.getFileEntryId()));
			   }catch (Exception e) {
				   log.error(e.getMessage());
			   }
			   
			 expensesLocalService.addExpenses(expense);
	}catch (Exception e) {
		e.getMessage();
	}
}
}