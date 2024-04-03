/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.Expenses;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Expenses in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExpensesCacheModel
	implements CacheModel<Expenses>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExpensesCacheModel)) {
			return false;
		}

		ExpensesCacheModel expensesCacheModel = (ExpensesCacheModel)object;

		if (expenseId == expensesCacheModel.expenseId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, expenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", expenseId=");
		sb.append(expenseId);
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
		sb.append(", expenseAmount=");
		sb.append(expenseAmount);
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append(", subCategoryId=");
		sb.append(subCategoryId);
		sb.append(", employeeUserId=");
		sb.append(employeeUserId);
		sb.append(", docMedia=");
		sb.append(docMedia);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Expenses toEntityModel() {
		ExpensesImpl expensesImpl = new ExpensesImpl();

		if (uuid == null) {
			expensesImpl.setUuid("");
		}
		else {
			expensesImpl.setUuid(uuid);
		}

		expensesImpl.setExpenseId(expenseId);
		expensesImpl.setCompanyId(companyId);
		expensesImpl.setUserId(userId);

		if (userName == null) {
			expensesImpl.setUserName("");
		}
		else {
			expensesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			expensesImpl.setCreateDate(null);
		}
		else {
			expensesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			expensesImpl.setModifiedDate(null);
		}
		else {
			expensesImpl.setModifiedDate(new Date(modifiedDate));
		}

		expensesImpl.setExpenseAmount(expenseAmount);
		expensesImpl.setCategoryId(categoryId);
		expensesImpl.setSubCategoryId(subCategoryId);
		expensesImpl.setEmployeeUserId(employeeUserId);

		if (docMedia == null) {
			expensesImpl.setDocMedia("");
		}
		else {
			expensesImpl.setDocMedia(docMedia);
		}

		expensesImpl.resetOriginalValues();

		return expensesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		expenseId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		expenseAmount = objectInput.readLong();

		categoryId = objectInput.readLong();

		subCategoryId = objectInput.readLong();

		employeeUserId = objectInput.readLong();
		docMedia = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(expenseId);

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

		objectOutput.writeLong(expenseAmount);

		objectOutput.writeLong(categoryId);

		objectOutput.writeLong(subCategoryId);

		objectOutput.writeLong(employeeUserId);

		if (docMedia == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docMedia);
		}
	}

	public String uuid;
	public long expenseId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long expenseAmount;
	public long categoryId;
	public long subCategoryId;
	public long employeeUserId;
	public String docMedia;

}