package com.expensio.addexpense.web.portlet;

import com.expensio.addexpense.web.constants.ExpensioAddexpenseWebPortletKeys;
import com.expensio.common.data.model.Category;
import com.expensio.common.data.service.CategoryLocalService;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author shani.patel
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ExpensioAddexpenseWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/view.jsp",
		"javax.portlet.name=" + ExpensioAddexpenseWebPortletKeys.EXPENSIOADDEXPENSEWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ExpensioAddexpenseWebPortlet extends MVCPortlet {
	
	@Reference
	CategoryLocalService categoryLocalService;
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		System.out.println("render Called");
		List<Category> categoryList =categoryLocalService.getCategories(-1, -1);
		System.out.println( "CategoryList is ======>>>>" +categoryList);
		renderRequest.setAttribute( "categoryList",categoryList );
		
		List<User> users = UserLocalServiceUtil.getUsers(-1, -1);
		System.out.println("users === >>>" + users);
		renderRequest.setAttribute("userNameList", users);
		
		super.render(renderRequest, renderResponse);
	}
}