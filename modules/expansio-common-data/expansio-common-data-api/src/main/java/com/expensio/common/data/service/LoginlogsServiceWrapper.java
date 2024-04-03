/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LoginlogsService}.
 *
 * @author Brian Wing Shun Chan
 * @see LoginlogsService
 * @generated
 */
public class LoginlogsServiceWrapper
	implements LoginlogsService, ServiceWrapper<LoginlogsService> {

	public LoginlogsServiceWrapper() {
		this(null);
	}

	public LoginlogsServiceWrapper(LoginlogsService loginlogsService) {
		_loginlogsService = loginlogsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _loginlogsService.getOSGiServiceIdentifier();
	}

	@Override
	public LoginlogsService getWrappedService() {
		return _loginlogsService;
	}

	@Override
	public void setWrappedService(LoginlogsService loginlogsService) {
		_loginlogsService = loginlogsService;
	}

	private LoginlogsService _loginlogsService;

}