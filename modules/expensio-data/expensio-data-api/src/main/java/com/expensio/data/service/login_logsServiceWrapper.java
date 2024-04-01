/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link login_logsService}.
 *
 * @author Brian Wing Shun Chan
 * @see login_logsService
 * @generated
 */
public class login_logsServiceWrapper
	implements login_logsService, ServiceWrapper<login_logsService> {

	public login_logsServiceWrapper() {
		this(null);
	}

	public login_logsServiceWrapper(login_logsService login_logsService) {
		_login_logsService = login_logsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _login_logsService.getOSGiServiceIdentifier();
	}

	@Override
	public login_logsService getWrappedService() {
		return _login_logsService;
	}

	@Override
	public void setWrappedService(login_logsService login_logsService) {
		_login_logsService = login_logsService;
	}

	private login_logsService _login_logsService;

}