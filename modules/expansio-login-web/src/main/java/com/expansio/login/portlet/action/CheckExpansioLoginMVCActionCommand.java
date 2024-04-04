package com.expansio.login.portlet.action;

import com.expansio.login.constants.ExpansioLoginPortletKeys;
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + ExpansioLoginPortletKeys.EXPANSIOLOGIN,
	        "mvc.command.name=/login"
		},
	    service = MVCActionCommand.class
	)

public class CheckExpansioLoginMVCActionCommand  extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
	    HttpServletRequest request = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(actionRequest));
	    HttpServletResponse response = PortalUtil.getHttpServletResponse(actionResponse);

		String userEmail = ParamUtil.getString(actionRequest, "email");
		String userPassword = ParamUtil.getString(actionRequest, "password");
		try {
			AuthenticatedSessionManagerUtil.login(request, response, userEmail, userPassword, false, CompanyConstants.AUTH_TYPE_EA);		
			actionResponse.sendRedirect("http://localhost:8080/web/expensio/");
		}catch(Exception e)
		{
			actionRequest.setAttribute("error", "User or Password incorrect!");
			actionRequest.setAttribute("username", userEmail);
			actionRequest.setAttribute("password", userPassword);
		}
		
	}

}
