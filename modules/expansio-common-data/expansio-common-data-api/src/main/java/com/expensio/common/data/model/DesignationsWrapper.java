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
 * This class is a wrapper for {@link Designations}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Designations
 * @generated
 */
public class DesignationsWrapper
	extends BaseModelWrapper<Designations>
	implements Designations, ModelWrapper<Designations> {

	public DesignationsWrapper(Designations designations) {
		super(designations);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("designationId", getDesignationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("designationName", getDesignationName());
		attributes.put("departmentId", getDepartmentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long designationId = (Long)attributes.get("designationId");

		if (designationId != null) {
			setDesignationId(designationId);
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

		String designationName = (String)attributes.get("designationName");

		if (designationName != null) {
			setDesignationName(designationName);
		}

		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
		}
	}

	@Override
	public Designations cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this designations.
	 *
	 * @return the company ID of this designations
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this designations.
	 *
	 * @return the create date of this designations
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department ID of this designations.
	 *
	 * @return the department ID of this designations
	 */
	@Override
	public Long getDepartmentId() {
		return model.getDepartmentId();
	}

	/**
	 * Returns the designation ID of this designations.
	 *
	 * @return the designation ID of this designations
	 */
	@Override
	public long getDesignationId() {
		return model.getDesignationId();
	}

	/**
	 * Returns the designation name of this designations.
	 *
	 * @return the designation name of this designations
	 */
	@Override
	public String getDesignationName() {
		return model.getDesignationName();
	}

	/**
	 * Returns the modified date of this designations.
	 *
	 * @return the modified date of this designations
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this designations.
	 *
	 * @return the primary key of this designations
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this designations.
	 *
	 * @return the user ID of this designations
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this designations.
	 *
	 * @return the user name of this designations
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this designations.
	 *
	 * @return the user uuid of this designations
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this designations.
	 *
	 * @return the uuid of this designations
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
	 * Sets the company ID of this designations.
	 *
	 * @param companyId the company ID of this designations
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this designations.
	 *
	 * @param createDate the create date of this designations
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department ID of this designations.
	 *
	 * @param departmentId the department ID of this designations
	 */
	@Override
	public void setDepartmentId(Long departmentId) {
		model.setDepartmentId(departmentId);
	}

	/**
	 * Sets the designation ID of this designations.
	 *
	 * @param designationId the designation ID of this designations
	 */
	@Override
	public void setDesignationId(long designationId) {
		model.setDesignationId(designationId);
	}

	/**
	 * Sets the designation name of this designations.
	 *
	 * @param designationName the designation name of this designations
	 */
	@Override
	public void setDesignationName(String designationName) {
		model.setDesignationName(designationName);
	}

	/**
	 * Sets the modified date of this designations.
	 *
	 * @param modifiedDate the modified date of this designations
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this designations.
	 *
	 * @param primaryKey the primary key of this designations
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this designations.
	 *
	 * @param userId the user ID of this designations
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this designations.
	 *
	 * @param userName the user name of this designations
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this designations.
	 *
	 * @param userUuid the user uuid of this designations
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this designations.
	 *
	 * @param uuid the uuid of this designations
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
	protected DesignationsWrapper wrap(Designations designations) {
		return new DesignationsWrapper(designations);
	}

}