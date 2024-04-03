/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;expensio_Loginlogs&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Loginlogs
 * @generated
 */
public class LoginlogsTable extends BaseTable<LoginlogsTable> {

	public static final LoginlogsTable INSTANCE = new LoginlogsTable();

	public final Column<LoginlogsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoginlogsTable, Long> loginLogId = createColumn(
		"loginLogId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<LoginlogsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoginlogsTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoginlogsTable, String> ipAddress = createColumn(
		"ipAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoginlogsTable, String> uri = createColumn(
		"uri", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoginlogsTable, String> host = createColumn(
		"host", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoginlogsTable, Date> loginDateTime = createColumn(
		"loginDateTime", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private LoginlogsTable() {
		super("expensio_Loginlogs", LoginlogsTable::new);
	}

}