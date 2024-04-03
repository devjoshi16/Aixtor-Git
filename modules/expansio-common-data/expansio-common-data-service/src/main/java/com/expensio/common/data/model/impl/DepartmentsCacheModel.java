/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.Departments;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Departments in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DepartmentsCacheModel
	implements CacheModel<Departments>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DepartmentsCacheModel)) {
			return false;
		}

		DepartmentsCacheModel departmentsCacheModel =
			(DepartmentsCacheModel)object;

		if (departmentId == departmentsCacheModel.departmentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, departmentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", departmentId=");
		sb.append(departmentId);
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
		sb.append(", departmentName=");
		sb.append(departmentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Departments toEntityModel() {
		DepartmentsImpl departmentsImpl = new DepartmentsImpl();

		if (uuid == null) {
			departmentsImpl.setUuid("");
		}
		else {
			departmentsImpl.setUuid(uuid);
		}

		departmentsImpl.setDepartmentId(departmentId);
		departmentsImpl.setCompanyId(companyId);
		departmentsImpl.setUserId(userId);

		if (userName == null) {
			departmentsImpl.setUserName("");
		}
		else {
			departmentsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			departmentsImpl.setCreateDate(null);
		}
		else {
			departmentsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			departmentsImpl.setModifiedDate(null);
		}
		else {
			departmentsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (departmentName == null) {
			departmentsImpl.setDepartmentName("");
		}
		else {
			departmentsImpl.setDepartmentName(departmentName);
		}

		departmentsImpl.resetOriginalValues();

		return departmentsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		departmentId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		departmentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(departmentId);

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

		if (departmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(departmentName);
		}
	}

	public String uuid;
	public long departmentId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String departmentName;

}