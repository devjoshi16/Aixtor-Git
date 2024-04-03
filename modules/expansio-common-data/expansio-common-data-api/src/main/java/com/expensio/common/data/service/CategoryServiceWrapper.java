/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CategoryService}.
 *
 * @author Brian Wing Shun Chan
 * @see CategoryService
 * @generated
 */
public class CategoryServiceWrapper
	implements CategoryService, ServiceWrapper<CategoryService> {

	public CategoryServiceWrapper() {
		this(null);
	}

	public CategoryServiceWrapper(CategoryService categoryService) {
		_categoryService = categoryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _categoryService.getOSGiServiceIdentifier();
	}

	@Override
	public CategoryService getWrappedService() {
		return _categoryService;
	}

	@Override
	public void setWrappedService(CategoryService categoryService) {
		_categoryService = categoryService;
	}

	private CategoryService _categoryService;

}