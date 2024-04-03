package com.expensio.budget.portlet;

import com.expensio.budget.constants.ExpensioBudgetPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author dev.joshi
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ExpensioBudget",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/viewBudget.jsp",
		"javax.portlet.name=" + ExpensioBudgetPortletKeys.EXPENSIOBUDGET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ExpensioBudgetPortlet extends MVCPortlet {
}