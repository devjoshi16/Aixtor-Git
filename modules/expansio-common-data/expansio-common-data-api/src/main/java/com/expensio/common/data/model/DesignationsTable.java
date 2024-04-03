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
 * The table class for the &quot;expensio_Designations&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Designations
 * @generated
 */
public class DesignationsTable extends BaseTable<DesignationsTable> {

	public static final DesignationsTable INSTANCE = new DesignationsTable();

	public final Column<DesignationsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DesignationsTable, Long> designationId = createColumn(
		"designationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DesignationsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DesignationsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DesignationsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DesignationsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DesignationsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DesignationsTable, String> designationName =
		createColumn(
			"designationName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DesignationsTable, Long> departmentId = createColumn(
		"departmentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DesignationsTable() {
		super("expensio_Designations", DesignationsTable::new);
	}

}