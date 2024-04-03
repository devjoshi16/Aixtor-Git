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
 * This class is a wrapper for {@link SubCategory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubCategory
 * @generated
 */
public class SubCategoryWrapper
	extends BaseModelWrapper<SubCategory>
	implements ModelWrapper<SubCategory>, SubCategory {

	public SubCategoryWrapper(SubCategory subCategory) {
		super(subCategory);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("subCategoryId", getSubCategoryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("subCategoryName", getSubCategoryName());
		attributes.put("categoryId", getCategoryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long subCategoryId = (Long)attributes.get("subCategoryId");

		if (subCategoryId != null) {
			setSubCategoryId(subCategoryId);
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

		String subCategoryName = (String)attributes.get("subCategoryName");

		if (subCategoryName != null) {
			setSubCategoryName(subCategoryName);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}
	}

	@Override
	public SubCategory cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category ID of this sub category.
	 *
	 * @return the category ID of this sub category
	 */
	@Override
	public Long getCategoryId() {
		return model.getCategoryId();
	}

	/**
	 * Returns the company ID of this sub category.
	 *
	 * @return the company ID of this sub category
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sub category.
	 *
	 * @return the create date of this sub category
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the modified date of this sub category.
	 *
	 * @return the modified date of this sub category
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sub category.
	 *
	 * @return the primary key of this sub category
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sub category ID of this sub category.
	 *
	 * @return the sub category ID of this sub category
	 */
	@Override
	public long getSubCategoryId() {
		return model.getSubCategoryId();
	}

	/**
	 * Returns the sub category name of this sub category.
	 *
	 * @return the sub category name of this sub category
	 */
	@Override
	public String getSubCategoryName() {
		return model.getSubCategoryName();
	}

	/**
	 * Returns the user ID of this sub category.
	 *
	 * @return the user ID of this sub category
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sub category.
	 *
	 * @return the user name of this sub category
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sub category.
	 *
	 * @return the user uuid of this sub category
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this sub category.
	 *
	 * @return the uuid of this sub category
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
	 * Sets the category ID of this sub category.
	 *
	 * @param categoryId the category ID of this sub category
	 */
	@Override
	public void setCategoryId(Long categoryId) {
		model.setCategoryId(categoryId);
	}

	/**
	 * Sets the company ID of this sub category.
	 *
	 * @param companyId the company ID of this sub category
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sub category.
	 *
	 * @param createDate the create date of this sub category
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the modified date of this sub category.
	 *
	 * @param modifiedDate the modified date of this sub category
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sub category.
	 *
	 * @param primaryKey the primary key of this sub category
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sub category ID of this sub category.
	 *
	 * @param subCategoryId the sub category ID of this sub category
	 */
	@Override
	public void setSubCategoryId(long subCategoryId) {
		model.setSubCategoryId(subCategoryId);
	}

	/**
	 * Sets the sub category name of this sub category.
	 *
	 * @param subCategoryName the sub category name of this sub category
	 */
	@Override
	public void setSubCategoryName(String subCategoryName) {
		model.setSubCategoryName(subCategoryName);
	}

	/**
	 * Sets the user ID of this sub category.
	 *
	 * @param userId the user ID of this sub category
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sub category.
	 *
	 * @param userName the user name of this sub category
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sub category.
	 *
	 * @param userUuid the user uuid of this sub category
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this sub category.
	 *
	 * @param uuid the uuid of this sub category
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
	protected SubCategoryWrapper wrap(SubCategory subCategory) {
		return new SubCategoryWrapper(subCategory);
	}

}