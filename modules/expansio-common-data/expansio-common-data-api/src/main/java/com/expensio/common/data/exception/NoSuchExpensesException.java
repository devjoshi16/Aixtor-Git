/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.expensio.common.data.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchExpensesException extends NoSuchModelException {

	public NoSuchExpensesException() {
	}

	public NoSuchExpensesException(String msg) {
		super(msg);
	}

	public NoSuchExpensesException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchExpensesException(Throwable throwable) {
		super(throwable);
	}

}