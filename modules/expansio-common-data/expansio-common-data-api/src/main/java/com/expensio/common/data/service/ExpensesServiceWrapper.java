/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExpensesService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExpensesService
 * @generated
 */
public class ExpensesServiceWrapper
	implements ExpensesService, ServiceWrapper<ExpensesService> {

	public ExpensesServiceWrapper() {
		this(null);
	}

	public ExpensesServiceWrapper(ExpensesService expensesService) {
		_expensesService = expensesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _expensesService.getOSGiServiceIdentifier();
	}

	@Override
	public ExpensesService getWrappedService() {
		return _expensesService;
	}

	@Override
	public void setWrappedService(ExpensesService expensesService) {
		_expensesService = expensesService;
	}

	private ExpensesService _expensesService;

}