package com.expensio.department.portlet;

import com.expensio.department.constants.ExpensioDepartmentPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author nivid.koradiya
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=expensio",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ExpensioDepartment",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view_departments.jsp",
		"javax.portlet.name=" + ExpensioDepartmentPortletKeys.EXPENSIODEPARTMENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ExpensioDepartmentPortlet extends MVCPortlet {
}