package com.expensio.department.portlet.action;

import com.expensio.common.data.model.Departments;
import com.expensio.common.data.service.DepartmentsLocalService;
import com.expensio.department.constants.ExpensioDepartmentPortletKeys;
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
                "javax.portlet.name=" + ExpensioDepartmentPortletKeys.EXPENSIODEPARTMENT,
                "mvc.command.name=/"
        },
        service = MVCRenderCommand.class

)
public class ExpensioDepartmentMVCRender implements MVCRenderCommand {
    private Log _log = LogFactoryUtil.getLog(ExpensioDepartmentMVCRender.class);

    @Reference
    DepartmentsLocalService departmentsLocalService;

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

        List<Departments> departmentsList = departmentsLocalService.getDepartmentses(-1,-1);
        renderRequest.setAttribute("departments", departmentsList);
        return "/html/view_departments.jsp";

    }
}
