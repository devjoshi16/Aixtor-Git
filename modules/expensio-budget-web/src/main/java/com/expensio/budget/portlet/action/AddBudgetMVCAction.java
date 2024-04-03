package com.expensio.budget.portlet.action;

import com.expensio.budget.constants.ExpensioBudgetPortletKeys;
import com.expensio.common.data.model.Budgets;
import com.expensio.common.data.service.BudgetsLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.DateFormat;
import java.util.Locale;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ExpensioBudgetPortletKeys.EXPENSIOBUDGET,
                "mvc.command.name=/AddBudget"
        },
        service = MVCActionCommand.class
)

public class AddBudgetMVCAction extends BaseMVCActionCommand {
    @Reference
    BudgetsLocalService budgetsLocalService;

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        ThemeDisplay themeDisplay =
                (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
        Budgets budgets =
                budgetsLocalService.createBudgets(
                        CounterLocalServiceUtil.increment(Budgets.class.getName()));
        Locale loc = new Locale("en", "US");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
        budgets.setUserName(ParamUtil.getString(actionRequest, "Name"));
        budgets.setBudgetDepartmentId(ParamUtil.getLong(actionRequest, "department"));
        budgets.setBudgetAmount(ParamUtil.getLong(actionRequest, "Amount"));
        budgets.setBudgetDuration(ParamUtil.getDate(actionRequest, "duration", dateFormat));
        budgets.setBudgetDescription(ParamUtil.getString(actionRequest, "description"));
        budgets.setCompanyId(themeDisplay.getCompanyId());
        budgets.setUserId(themeDisplay.getUserId());
        budgets.setUserName(themeDisplay.getUser().getFullName());
        budgetsLocalService.addBudgets(budgets);


    }
}
