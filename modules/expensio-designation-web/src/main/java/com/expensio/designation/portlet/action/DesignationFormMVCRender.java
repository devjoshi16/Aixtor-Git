package com.expensio.designation.portlet.action;


import com.expensio.common.data.model.Departments;
import com.expensio.common.data.model.Designations;
import com.expensio.common.data.service.DepartmentsLocalService;
import com.expensio.common.data.service.DesignationsLocalService;
import com.expensio.designation.constants.ExpensioDesignationPortletConstants;
import com.expensio.designation.constants.ExpensioDesignationPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

@Component(

        immediate = true,
        property = {
                "javax.portlet.name=" + ExpensioDesignationPortletKeys.EXPENSIODESIGNATION,
                "mvc.command.name=/addDesignation"
        },
        service = MVCRenderCommand.class

)
public class DesignationFormMVCRender implements MVCRenderCommand {
    @Reference
    DepartmentsLocalService departmentsLocalService;

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        List<Departments> departmentsList = departmentsLocalService.getDepartmentses(-1,-1);
        renderRequest.setAttribute(ExpensioDesignationPortletConstants.DEPARTMENT_LIST, departmentsList);
        return ExpensioDesignationPortletConstants.ADD_DESIGNATION_JSP;

    }
}
