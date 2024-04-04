package com.expensio.designation.portlet.action;

import com.expensio.common.data.model.Designations;
import com.expensio.common.data.service.DesignationsLocalService;
import com.expensio.designation.constants.ExpensioDesignationPortletConstants;
import com.expensio.designation.constants.ExpensioDesignationPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import java.util.Date;

@Component(

        immediate = true,
        property = {
                "javax.portlet.name=" + ExpensioDesignationPortletKeys.EXPENSIODESIGNATION,
                "mvc.command.name=/submitDesignation"
        },
        service = MVCActionCommand.class

)
public class SubmitDesignationMVCAction implements MVCActionCommand {

    @Reference
    DesignationsLocalService designationsLocalService;


    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

        Designations designation = designationsLocalService.createDesignations(CounterLocalServiceUtil.increment(Designations.class.getName()));

        String designationName = ParamUtil.getString(actionRequest, ExpensioDesignationPortletConstants.DESIGNATION_NAME);
        Long departmentId = ParamUtil.getLong(actionRequest, ExpensioDesignationPortletConstants.DEPARTMENT_NAME);
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
        designation.setCompanyId(themeDisplay.getCompanyId());
        designation.setUserId(themeDisplay.getUserId());
        designation.setUserName(themeDisplay.getUser().getFullName());
        designation.setCreateDate(new Date());
        designation.setModifiedDate(new Date());

        designation.setDesignationName(designationName);
        designation.setDepartmentId(departmentId);
        designationsLocalService.addDesignations(designation);

        return false;
    }
}
