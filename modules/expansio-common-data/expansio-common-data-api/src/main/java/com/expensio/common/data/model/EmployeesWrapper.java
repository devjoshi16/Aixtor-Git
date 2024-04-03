/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employees}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employees
 * @generated
 */
public class EmployeesWrapper
	extends BaseModelWrapper<Employees>
	implements Employees, ModelWrapper<Employees> {

	public EmployeesWrapper(Employees employees) {
		super(employees);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("employeeUserId", getEmployeeUserId());
		attributes.put("department", getDepartment());
		attributes.put("designation", getDesignation());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long employeeUserId = (Long)attributes.get("employeeUserId");

		if (employeeUserId != null) {
			setEmployeeUserId(employeeUserId);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Employees cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this employees.
	 *
	 * @return the company ID of this employees
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this employees.
	 *
	 * @return the create date of this employees
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department of this employees.
	 *
	 * @return the department of this employees
	 */
	@Override
	public String getDepartment() {
		return model.getDepartment();
	}

	/**
	 * Returns the designation of this employees.
	 *
	 * @return the designation of this employees
	 */
	@Override
	public String getDesignation() {
		return model.getDesignation();
	}

	/**
	 * Returns the employee ID of this employees.
	 *
	 * @return the employee ID of this employees
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the employee user ID of this employees.
	 *
	 * @return the employee user ID of this employees
	 */
	@Override
	public Long getEmployeeUserId() {
		return model.getEmployeeUserId();
	}

	/**
	 * Returns the modified date of this employees.
	 *
	 * @return the modified date of this employees
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this employees.
	 *
	 * @return the primary key of this employees
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this employees.
	 *
	 * @return the status of this employees
	 */
	@Override
	public Boolean getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this employees.
	 *
	 * @return the user ID of this employees
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this employees.
	 *
	 * @return the user name of this employees
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this employees.
	 *
	 * @return the user uuid of this employees
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this employees.
	 *
	 * @return the uuid of this employees
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this employees.
	 *
	 * @param companyId the company ID of this employees
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this employees.
	 *
	 * @param createDate the create date of this employees
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department of this employees.
	 *
	 * @param department the department of this employees
	 */
	@Override
	public void setDepartment(String department) {
		model.setDepartment(department);
	}

	/**
	 * Sets the designation of this employees.
	 *
	 * @param designation the designation of this employees
	 */
	@Override
	public void setDesignation(String designation) {
		model.setDesignation(designation);
	}

	/**
	 * Sets the employee ID of this employees.
	 *
	 * @param employeeId the employee ID of this employees
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the employee user ID of this employees.
	 *
	 * @param employeeUserId the employee user ID of this employees
	 */
	@Override
	public void setEmployeeUserId(Long employeeUserId) {
		model.setEmployeeUserId(employeeUserId);
	}

	/**
	 * Sets the modified date of this employees.
	 *
	 * @param modifiedDate the modified date of this employees
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this employees.
	 *
	 * @param primaryKey the primary key of this employees
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this employees.
	 *
	 * @param status the status of this employees
	 */
	@Override
	public void setStatus(Boolean status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this employees.
	 *
	 * @param userId the user ID of this employees
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this employees.
	 *
	 * @param userName the user name of this employees
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this employees.
	 *
	 * @param userUuid the user uuid of this employees
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this employees.
	 *
	 * @param uuid the uuid of this employees
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EmployeesWrapper wrap(Employees employees) {
		return new EmployeesWrapper(employees);
	}

}