/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;expensio_login_logs&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see login_logs
 * @generated
 */
public class login_logsTable extends BaseTable<login_logsTable> {

	public static final login_logsTable INSTANCE = new login_logsTable();

	public final Column<login_logsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<login_logsTable, Long> loginLogId = createColumn(
		"loginLogId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<login_logsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<login_logsTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<login_logsTable, String> ipAddress = createColumn(
		"ipAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<login_logsTable, String> uri = createColumn(
		"uri", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<login_logsTable, String> host = createColumn(
		"host", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<login_logsTable, Date> loginDateTime = createColumn(
		"loginDateTime", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private login_logsTable() {
		super("expensio_login_logs", login_logsTable::new);
	}

}