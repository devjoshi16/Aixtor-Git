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
 * The table class for the &quot;expensio_SubCategory&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SubCategory
 * @generated
 */
public class SubCategoryTable extends BaseTable<SubCategoryTable> {

	public static final SubCategoryTable INSTANCE = new SubCategoryTable();

	public final Column<SubCategoryTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SubCategoryTable, Long> subCategoryId = createColumn(
		"subCategoryId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SubCategoryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SubCategoryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SubCategoryTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SubCategoryTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SubCategoryTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SubCategoryTable, String> subCategoryName =
		createColumn(
			"subCategoryName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubCategoryTable, Long> categoryId = createColumn(
		"categoryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SubCategoryTable() {
		super("expensio_SubCategory", SubCategoryTable::new);
	}

}