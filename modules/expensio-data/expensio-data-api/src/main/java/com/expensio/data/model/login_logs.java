/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the login_logs service. Represents a row in the &quot;expensio_login_logs&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see login_logsModel
 * @generated
 */
@ImplementationClassName("com.expensio.data.model.impl.login_logsImpl")
@ProviderType
public interface login_logs extends login_logsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.expensio.data.model.impl.login_logsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<login_logs, Long> LOGIN_LOG_ID_ACCESSOR =
		new Accessor<login_logs, Long>() {

			@Override
			public Long get(login_logs login_logs) {
				return login_logs.getLoginLogId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<login_logs> getTypeClass() {
				return login_logs.class;
			}

		};

}