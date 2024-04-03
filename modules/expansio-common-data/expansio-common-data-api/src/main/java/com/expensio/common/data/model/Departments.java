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
 * The extended model interface for the Departments service. Represents a row in the &quot;expensio_Departments&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentsModel
 * @generated
 */
@ImplementationClassName("com.expensio.common.data.model.impl.DepartmentsImpl")
@ProviderType
public interface Departments extends DepartmentsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.expensio.common.data.model.impl.DepartmentsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Departments, Long> DEPARTMENT_ID_ACCESSOR =
		new Accessor<Departments, Long>() {

			@Override
			public Long get(Departments departments) {
				return departments.getDepartmentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Departments> getTypeClass() {
				return Departments.class;
			}

		};

}