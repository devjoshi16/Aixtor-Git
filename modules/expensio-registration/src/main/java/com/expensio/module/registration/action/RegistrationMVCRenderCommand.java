package com.expensio.module.registration.action;

import com.expensio.module.registration.constants.ExpensioRegistrationPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {

		"javax.portlet.name=" + ExpensioRegistrationPortletKeys.EXPENSIOREGISTRATION,
		"mvc.command.name=/" }, service = MVCRenderCommand.class)


public class RegistrationMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		return "/html/registration.jsp";
	}

}
