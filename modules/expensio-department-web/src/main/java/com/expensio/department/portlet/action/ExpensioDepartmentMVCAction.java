package com.expensio.department.portlet.action;
import com.expensio.common.data.model.Departments;
import com.expensio.common.data.service.DepartmentsLocalService;
import com.expensio.department.constants.ExpensioDepartmentPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.util.Date;
import java.util.List;


@Component(

        immediate = true,
        property = {
                "javax.portlet.name=" + ExpensioDepartmentPortletKeys.EXPENSIODEPARTMENT,
                "mvc.command.name=submitDepartment"
        },
        service = MVCActionCommand.class

)
public class ExpensioDepartmentMVCAction implements MVCActionCommand {
    private Log _log = LogFactoryUtil.getLog(ExpensioDepartmentMVCAction.class);

    @Reference
    DepartmentsLocalService departmentsLocalService;


    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

        Departments department = departmentsLocalService.createDepartments(CounterLocalServiceUtil.increment(Departments.class.getName()));
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        department.setCompanyId(themeDisplay.getCompanyId());
        department.setUserId(themeDisplay.getUserId());
        department.setUserName(themeDisplay.getUser().getFullName());
        department.setCreateDate(new Date());
        department.setModifiedDate(new Date());

        String departmentName = ParamUtil.getString(actionRequest, "departmentName");
        department.setDepartmentName(departmentName);
        departmentsLocalService.addDepartments(department);
        return false;
    }
}
