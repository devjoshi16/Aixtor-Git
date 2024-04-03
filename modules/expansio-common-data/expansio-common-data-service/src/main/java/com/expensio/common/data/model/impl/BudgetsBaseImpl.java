/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.Budgets;
import com.expensio.common.data.service.BudgetsLocalServiceUtil;

/**
 * The extended model base implementation for the Budgets service. Represents a row in the &quot;expensio_Budgets&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BudgetsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BudgetsImpl
 * @see Budgets
 * @generated
 */
public abstract class BudgetsBaseImpl
	extends BudgetsModelImpl implements Budgets {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a budgets model instance should use the <code>Budgets</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			BudgetsLocalServiceUtil.addBudgets(this);
		}
		else {
			BudgetsLocalServiceUtil.updateBudgets(this);
		}
	}

}