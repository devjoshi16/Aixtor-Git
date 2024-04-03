/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DesignationsService}.
 *
 * @author Brian Wing Shun Chan
 * @see DesignationsService
 * @generated
 */
public class DesignationsServiceWrapper
	implements DesignationsService, ServiceWrapper<DesignationsService> {

	public DesignationsServiceWrapper() {
		this(null);
	}

	public DesignationsServiceWrapper(DesignationsService designationsService) {
		_designationsService = designationsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _designationsService.getOSGiServiceIdentifier();
	}

	@Override
	public DesignationsService getWrappedService() {
		return _designationsService;
	}

	@Override
	public void setWrappedService(DesignationsService designationsService) {
		_designationsService = designationsService;
	}

	private DesignationsService _designationsService;

}