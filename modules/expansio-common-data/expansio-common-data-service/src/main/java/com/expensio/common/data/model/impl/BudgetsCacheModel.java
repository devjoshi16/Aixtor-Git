/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.Budgets;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Budgets in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BudgetsCacheModel implements CacheModel<Budgets>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BudgetsCacheModel)) {
			return false;
		}

		BudgetsCacheModel budgetsCacheModel = (BudgetsCacheModel)object;

		if (budgetId == budgetsCacheModel.budgetId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, budgetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", budgetId=");
		sb.append(budgetId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", budgetAmount=");
		sb.append(budgetAmount);
		sb.append(", budgetDuration=");
		sb.append(budgetDuration);
		sb.append(", budgetDescription=");
		sb.append(budgetDescription);
		sb.append(", budgetDepartmentId=");
		sb.append(budgetDepartmentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Budgets toEntityModel() {
		BudgetsImpl budgetsImpl = new BudgetsImpl();

		if (uuid == null) {
			budgetsImpl.setUuid("");
		}
		else {
			budgetsImpl.setUuid(uuid);
		}

		budgetsImpl.setBudgetId(budgetId);
		budgetsImpl.setCompanyId(companyId);
		budgetsImpl.setUserId(userId);

		if (userName == null) {
			budgetsImpl.setUserName("");
		}
		else {
			budgetsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			budgetsImpl.setCreateDate(null);
		}
		else {
			budgetsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			budgetsImpl.setModifiedDate(null);
		}
		else {
			budgetsImpl.setModifiedDate(new Date(modifiedDate));
		}

		budgetsImpl.setBudgetAmount(budgetAmount);

		if (budgetDuration == Long.MIN_VALUE) {
			budgetsImpl.setBudgetDuration(null);
		}
		else {
			budgetsImpl.setBudgetDuration(new Date(budgetDuration));
		}

		if (budgetDescription == null) {
			budgetsImpl.setBudgetDescription("");
		}
		else {
			budgetsImpl.setBudgetDescription(budgetDescription);
		}

		budgetsImpl.setBudgetDepartmentId(budgetDepartmentId);

		budgetsImpl.resetOriginalValues();

		return budgetsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		budgetId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		budgetAmount = objectInput.readLong();
		budgetDuration = objectInput.readLong();
		budgetDescription = objectInput.readUTF();

		budgetDepartmentId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(budgetId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(budgetAmount);
		objectOutput.writeLong(budgetDuration);

		if (budgetDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(budgetDescription);
		}

		objectOutput.writeLong(budgetDepartmentId);
	}

	public String uuid;
	public long budgetId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long budgetAmount;
	public long budgetDuration;
	public String budgetDescription;
	public long budgetDepartmentId;

}