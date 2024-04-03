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
 * The table class for the &quot;expensio_Budgets&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Budgets
 * @generated
 */
public class BudgetsTable extends BaseTable<BudgetsTable> {

	public static final BudgetsTable INSTANCE = new BudgetsTable();

	public final Column<BudgetsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, Long> budgetId = createColumn(
		"budgetId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BudgetsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, Long> budgetAmount = createColumn(
		"budgetAmount", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, Date> budgetDuration = createColumn(
		"budgetDuration", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, String> budgetDescription = createColumn(
		"budgetDescription", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BudgetsTable, Long> budgetDepartmentId = createColumn(
		"budgetDepartmentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private BudgetsTable() {
		super("expensio_Budgets", BudgetsTable::new);
	}

}