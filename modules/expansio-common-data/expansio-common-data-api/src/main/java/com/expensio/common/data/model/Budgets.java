/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Budgets service. Represents a row in the &quot;expensio_Budgets&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BudgetsModel
 * @generated
 */
@ImplementationClassName("com.expensio.common.data.model.impl.BudgetsImpl")
@ProviderType
public interface Budgets extends BudgetsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.expensio.common.data.model.impl.BudgetsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Budgets, Long> BUDGET_ID_ACCESSOR =
		new Accessor<Budgets, Long>() {

			@Override
			public Long get(Budgets budgets) {
				return budgets.getBudgetId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Budgets> getTypeClass() {
				return Budgets.class;
			}

		};

}