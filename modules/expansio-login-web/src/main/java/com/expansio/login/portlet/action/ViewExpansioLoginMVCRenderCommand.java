package com.expansio.login.portlet.action;

import com.expansio.login.constants.ExpansioLoginConstants;
import com.expansio.login.constants.ExpansioLoginPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + ExpansioLoginPortletKeys.EXPANSIOLOGIN,
			"mvc.command.name=/"
		},
		service = MVCRenderCommand.class
	)


public class ViewExpansioLoginMVCRenderCommand  implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		return ExpansioLoginConstants.VIEW_JSP;
	}

}
