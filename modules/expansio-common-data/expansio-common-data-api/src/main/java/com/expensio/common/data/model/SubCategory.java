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
 * The extended model interface for the SubCategory service. Represents a row in the &quot;expensio_SubCategory&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SubCategoryModel
 * @generated
 */
@ImplementationClassName("com.expensio.common.data.model.impl.SubCategoryImpl")
@ProviderType
public interface SubCategory extends PersistedModel, SubCategoryModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.expensio.common.data.model.impl.SubCategoryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SubCategory, Long> SUB_CATEGORY_ID_ACCESSOR =
		new Accessor<SubCategory, Long>() {

			@Override
			public Long get(SubCategory subCategory) {
				return subCategory.getSubCategoryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<SubCategory> getTypeClass() {
				return SubCategory.class;
			}

		};

}