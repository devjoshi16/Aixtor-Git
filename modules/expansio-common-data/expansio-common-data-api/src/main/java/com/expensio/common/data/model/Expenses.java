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
 * The extended model interface for the Expenses service. Represents a row in the &quot;expensio_Expenses&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExpensesModel
 * @generated
 */
@ImplementationClassName("com.expensio.common.data.model.impl.ExpensesImpl")
@ProviderType
public interface Expenses extends ExpensesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.expensio.common.data.model.impl.ExpensesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Expenses, Long> EXPENSE_ID_ACCESSOR =
		new Accessor<Expenses, Long>() {

			@Override
			public Long get(Expenses expenses) {
				return expenses.getExpenseId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Expenses> getTypeClass() {
				return Expenses.class;
			}

		};

}