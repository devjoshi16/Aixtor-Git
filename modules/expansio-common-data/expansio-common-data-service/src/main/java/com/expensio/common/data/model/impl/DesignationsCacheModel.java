/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.Designations;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Designations in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DesignationsCacheModel
	implements CacheModel<Designations>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DesignationsCacheModel)) {
			return false;
		}

		DesignationsCacheModel designationsCacheModel =
			(DesignationsCacheModel)object;

		if (designationId == designationsCacheModel.designationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, designationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", designationId=");
		sb.append(designationId);
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
		sb.append(", designationName=");
		sb.append(designationName);
		sb.append(", departmentId=");
		sb.append(departmentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Designations toEntityModel() {
		DesignationsImpl designationsImpl = new DesignationsImpl();

		if (uuid == null) {
			designationsImpl.setUuid("");
		}
		else {
			designationsImpl.setUuid(uuid);
		}

		designationsImpl.setDesignationId(designationId);
		designationsImpl.setCompanyId(companyId);
		designationsImpl.setUserId(userId);

		if (userName == null) {
			designationsImpl.setUserName("");
		}
		else {
			designationsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			designationsImpl.setCreateDate(null);
		}
		else {
			designationsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			designationsImpl.setModifiedDate(null);
		}
		else {
			designationsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (designationName == null) {
			designationsImpl.setDesignationName("");
		}
		else {
			designationsImpl.setDesignationName(designationName);
		}

		designationsImpl.setDepartmentId(departmentId);

		designationsImpl.resetOriginalValues();

		return designationsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		designationId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		designationName = objectInput.readUTF();

		departmentId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(designationId);

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

		if (designationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(designationName);
		}

		objectOutput.writeLong(departmentId);
	}

	public String uuid;
	public long designationId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String designationName;
	public long departmentId;

}