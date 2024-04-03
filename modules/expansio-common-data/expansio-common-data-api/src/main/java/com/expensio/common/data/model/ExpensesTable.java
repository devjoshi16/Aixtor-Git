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
 * The table class for the &quot;expensio_Expenses&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Expenses
 * @generated
 */
public class ExpensesTable extends BaseTable<ExpensesTable> {

	public static final ExpensesTable INSTANCE = new ExpensesTable();

	public final Column<ExpensesTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Long> expenseId = createColumn(
		"expenseId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ExpensesTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Long> expenseAmount = createColumn(
		"expenseAmount", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Long> categoryId = createColumn(
		"categoryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Long> subCategoryId = createColumn(
		"subCategoryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, Long> employeeUserId = createColumn(
		"employeeUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExpensesTable, String> docMedia = createColumn(
		"docMedia", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ExpensesTable() {
		super("expensio_Expenses", ExpensesTable::new);
	}

}