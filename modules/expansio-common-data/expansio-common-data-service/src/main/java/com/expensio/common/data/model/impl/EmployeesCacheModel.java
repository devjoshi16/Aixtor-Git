/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.Employees;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employees in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeesCacheModel
	implements CacheModel<Employees>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeesCacheModel)) {
			return false;
		}

		EmployeesCacheModel employeesCacheModel = (EmployeesCacheModel)object;

		if (employeeId == employeesCacheModel.employeeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", employeeId=");
		sb.append(employeeId);
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
		sb.append(", employeeUserId=");
		sb.append(employeeUserId);
		sb.append(", department=");
		sb.append(department);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employees toEntityModel() {
		EmployeesImpl employeesImpl = new EmployeesImpl();

		if (uuid == null) {
			employeesImpl.setUuid("");
		}
		else {
			employeesImpl.setUuid(uuid);
		}

		employeesImpl.setEmployeeId(employeeId);
		employeesImpl.setCompanyId(companyId);
		employeesImpl.setUserId(userId);

		if (userName == null) {
			employeesImpl.setUserName("");
		}
		else {
			employeesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			employeesImpl.setCreateDate(null);
		}
		else {
			employeesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeesImpl.setModifiedDate(null);
		}
		else {
			employeesImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeesImpl.setEmployeeUserId(employeeUserId);

		if (department == null) {
			employeesImpl.setDepartment("");
		}
		else {
			employeesImpl.setDepartment(department);
		}

		if (designation == null) {
			employeesImpl.setDesignation("");
		}
		else {
			employeesImpl.setDesignation(designation);
		}

		employeesImpl.setStatus(status);

		employeesImpl.resetOriginalValues();

		return employeesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		employeeId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		employeeUserId = objectInput.readLong();
		department = objectInput.readUTF();
		designation = objectInput.readUTF();

		status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(employeeId);

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

		objectOutput.writeLong(employeeUserId);

		if (department == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (designation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(designation);
		}

		objectOutput.writeBoolean(status);
	}

	public String uuid;
	public long employeeId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long employeeUserId;
	public String department;
	public String designation;
	public boolean status;

}