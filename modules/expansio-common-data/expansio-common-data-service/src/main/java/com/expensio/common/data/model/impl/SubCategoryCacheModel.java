/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.SubCategory;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SubCategory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubCategoryCacheModel
	implements CacheModel<SubCategory>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SubCategoryCacheModel)) {
			return false;
		}

		SubCategoryCacheModel subCategoryCacheModel =
			(SubCategoryCacheModel)object;

		if (subCategoryId == subCategoryCacheModel.subCategoryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, subCategoryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", subCategoryId=");
		sb.append(subCategoryId);
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
		sb.append(", subCategoryName=");
		sb.append(subCategoryName);
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SubCategory toEntityModel() {
		SubCategoryImpl subCategoryImpl = new SubCategoryImpl();

		if (uuid == null) {
			subCategoryImpl.setUuid("");
		}
		else {
			subCategoryImpl.setUuid(uuid);
		}

		subCategoryImpl.setSubCategoryId(subCategoryId);
		subCategoryImpl.setCompanyId(companyId);
		subCategoryImpl.setUserId(userId);

		if (userName == null) {
			subCategoryImpl.setUserName("");
		}
		else {
			subCategoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			subCategoryImpl.setCreateDate(null);
		}
		else {
			subCategoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			subCategoryImpl.setModifiedDate(null);
		}
		else {
			subCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (subCategoryName == null) {
			subCategoryImpl.setSubCategoryName("");
		}
		else {
			subCategoryImpl.setSubCategoryName(subCategoryName);
		}

		subCategoryImpl.setCategoryId(categoryId);

		subCategoryImpl.resetOriginalValues();

		return subCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		subCategoryId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		subCategoryName = objectInput.readUTF();

		categoryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(subCategoryId);

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

		if (subCategoryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategoryName);
		}

		objectOutput.writeLong(categoryId);
	}

	public String uuid;
	public long subCategoryId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String subCategoryName;
	public long categoryId;

}