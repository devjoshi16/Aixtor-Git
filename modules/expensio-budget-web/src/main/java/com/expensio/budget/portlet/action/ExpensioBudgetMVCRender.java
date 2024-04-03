package com.expensio.budget.portlet.action;

import com.expensio.budget.constants.ExpensioBudgetPortletKeys;
import com.expensio.common.data.model.Budgets;
import com.expensio.common.data.model.Expenses;
import com.expensio.common.data.service.BudgetsLocalService;
import com.expensio.common.data.service.ExpensesLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ExpensioBudgetPortletKeys.EXPENSIOBUDGET,
                "mvc.command.name=/"
        },
        service = MVCRenderCommand.class
)

public class ExpensioBudgetMVCRender  implements MVCRenderCommand {
    @Reference
    BudgetsLocalService budgetsLocalService;
    @Reference
    ExpensesLocalService expensesLocalService;

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

        String cmd= ParamUtil.getString(renderRequest,"cmd");


        List<Budgets> budgetsList=budgetsLocalService.getBudgetses(-1,-1);
        List<Expenses> expensesList=expensesLocalService.getExpenseses(-1,-1);
        System.out.println(budgetsList);
        System.out.println(expensesList);


        return "/html/viewBudget.jsp";
    }
}
