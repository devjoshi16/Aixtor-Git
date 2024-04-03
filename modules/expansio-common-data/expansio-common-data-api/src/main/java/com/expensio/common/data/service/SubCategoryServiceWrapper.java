/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubCategoryService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubCategoryService
 * @generated
 */
public class SubCategoryServiceWrapper
	implements ServiceWrapper<SubCategoryService>, SubCategoryService {

	public SubCategoryServiceWrapper() {
		this(null);
	}

	public SubCategoryServiceWrapper(SubCategoryService subCategoryService) {
		_subCategoryService = subCategoryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _subCategoryService.getOSGiServiceIdentifier();
	}

	@Override
	public SubCategoryService getWrappedService() {
		return _subCategoryService;
	}

	@Override
	public void setWrappedService(SubCategoryService subCategoryService) {
		_subCategoryService = subCategoryService;
	}

	private SubCategoryService _subCategoryService;

}