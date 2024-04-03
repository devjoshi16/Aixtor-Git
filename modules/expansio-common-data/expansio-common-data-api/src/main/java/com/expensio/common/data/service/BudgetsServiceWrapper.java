/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BudgetsService}.
 *
 * @author Brian Wing Shun Chan
 * @see BudgetsService
 * @generated
 */
public class BudgetsServiceWrapper
	implements BudgetsService, ServiceWrapper<BudgetsService> {

	public BudgetsServiceWrapper() {
		this(null);
	}

	public BudgetsServiceWrapper(BudgetsService budgetsService) {
		_budgetsService = budgetsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _budgetsService.getOSGiServiceIdentifier();
	}

	@Override
	public BudgetsService getWrappedService() {
		return _budgetsService;
	}

	@Override
	public void setWrappedService(BudgetsService budgetsService) {
		_budgetsService = budgetsService;
	}

	private BudgetsService _budgetsService;

}