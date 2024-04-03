/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DepartmentsService}.
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentsService
 * @generated
 */
public class DepartmentsServiceWrapper
	implements DepartmentsService, ServiceWrapper<DepartmentsService> {

	public DepartmentsServiceWrapper() {
		this(null);
	}

	public DepartmentsServiceWrapper(DepartmentsService departmentsService) {
		_departmentsService = departmentsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _departmentsService.getOSGiServiceIdentifier();
	}

	@Override
	public DepartmentsService getWrappedService() {
		return _departmentsService;
	}

	@Override
	public void setWrappedService(DepartmentsService departmentsService) {
		_departmentsService = departmentsService;
	}

	private DepartmentsService _departmentsService;

}