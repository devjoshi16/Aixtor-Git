//package com.expensio.addexpense.web.action;
//
//import com.expensio.addexpense.web.constants.ExpensioAddexpenseWebPortletKeys;
//import com.expensio.common.data.model.Category;
//import com.expensio.common.data.service.CategoryLocalService;
//import com.liferay.portal.kernel.model.User;
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
//import com.liferay.portal.kernel.service.UserLocalService;
//import com.liferay.portal.kernel.service.UserLocalServiceUtil;
//
//import java.util.List;
//
//import javax.portlet.PortletException;
//import javax.portlet.RenderRequest;
//import javax.portlet.RenderResponse;
//
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.Reference;
//
//@Component(
//		immediate = true,
//		property = {
//			"javax.portlet.name=" + ExpensioAddexpenseWebPortletKeys.EXPENSIOADDEXPENSEWEB,
//			"mvc.command.name=/"
//		},
//		service = MVCRenderCommand.class
//	)
//public class DefaultaddExpenseMVCRenderCommand implements MVCRenderCommand{
//	
//	@Reference
//	CategoryLocalService categoryLocalService;
//	
//	@Reference
//	UserLocalServiceUtil userLocalServiceUtil;
//
//	@Override
//	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
//		
//		System.out.println("render Called");
//		List<Category> categoryList =categoryLocalService.getCategories(-1, -1);
//		System.out.println( "CategoryList is ======>>>>" +categoryList);
//		renderRequest.setAttribute( "categoryList",categoryList );
//		
//		List<User> users = UserLocalServiceUtil.getUsers(-1, -1);
//		System.out.println("users === >>>" + users);
//		renderRequest.setAttribute("userNameList", users);
//		return "/html/view.jsp";
//	}
//}
