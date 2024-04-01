/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.expensio.data.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchlogin_logsException extends NoSuchModelException {

	public NoSuchlogin_logsException() {
	}

	public NoSuchlogin_logsException(String msg) {
		super(msg);
	}

	public NoSuchlogin_logsException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchlogin_logsException(Throwable throwable) {
		super(throwable);
	}

}