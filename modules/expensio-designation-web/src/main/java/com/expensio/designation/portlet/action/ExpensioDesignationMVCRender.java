package com.expensio.designation.portlet.action;


import com.expensio.common.data.model.Designations;
import com.expensio.common.data.service.DepartmentsLocalService;
import com.expensio.common.data.service.DesignationsLocalService;
import com.expensio.designation.constants.ExpensioDesignationPortletConstants;
import com.expensio.designation.constants.ExpensioDesignationPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.ArrayList;
import java.util.List;

@Component(

        immediate = true,
        property = {
                "javax.portlet.name=" + ExpensioDesignationPortletKeys.EXPENSIODESIGNATION,
                "mvc.command.name=/"
        },
        service = MVCRenderCommand.class

)
public class ExpensioDesignationMVCRender implements MVCRenderCommand {
    private Log _log = LogFactoryUtil.getLog(ExpensioDesignationMVCRender.class);

    @Reference
    DesignationsLocalService designationsLocalService;

    @Reference
    DepartmentsLocalService departmentsLocalService;
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {


        List<Designations> designationList = designationsLocalService.getDesignationses(-1,-1);
        List<String> departmentList = new ArrayList<>();

        //Creating a list of department related to each designation.
        for(Designations designation : designationList){
            try {
                departmentList.add(departmentsLocalService.getDepartments(designation.getDepartmentId()).getDepartmentName());
            } catch (PortalException e) {
                throw new RuntimeException(e);
            }
        }
        renderRequest.setAttribute(ExpensioDesignationPortletConstants.DESIGNATIONS, designationList);
        renderRequest.setAttribute(ExpensioDesignationPortletConstants.DEPARTMENTS, departmentList);
        return ExpensioDesignationPortletConstants.VIEW_DESIGNATION_JSP;

    }
}
