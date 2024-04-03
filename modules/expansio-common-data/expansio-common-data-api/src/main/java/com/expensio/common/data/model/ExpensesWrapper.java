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
 * This class is a wrapper for {@link Expenses}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Expenses
 * @generated
 */
public class ExpensesWrapper
	extends BaseModelWrapper<Expenses>
	implements Expenses, ModelWrapper<Expenses> {

	public ExpensesWrapper(Expenses expenses) {
		super(expenses);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("expenseId", getExpenseId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("expenseAmount", getExpenseAmount());
		attributes.put("categoryId", getCategoryId());
		attributes.put("subCategoryId", getSubCategoryId());
		attributes.put("employeeUserId", getEmployeeUserId());
		attributes.put("docMedia", getDocMedia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long expenseId = (Long)attributes.get("expenseId");

		if (expenseId != null) {
			setExpenseId(expenseId);
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

		Long expenseAmount = (Long)attributes.get("expenseAmount");

		if (expenseAmount != null) {
			setExpenseAmount(expenseAmount);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		Long subCategoryId = (Long)attributes.get("subCategoryId");

		if (subCategoryId != null) {
			setSubCategoryId(subCategoryId);
		}

		Long employeeUserId = (Long)attributes.get("employeeUserId");

		if (employeeUserId != null) {
			setEmployeeUserId(employeeUserId);
		}

		String docMedia = (String)attributes.get("docMedia");

		if (docMedia != null) {
			setDocMedia(docMedia);
		}
	}

	@Override
	public Expenses cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category ID of this expenses.
	 *
	 * @return the category ID of this expenses
	 */
	@Override
	public Long getCategoryId() {
		return model.getCategoryId();
	}

	/**
	 * Returns the company ID of this expenses.
	 *
	 * @return the company ID of this expenses
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this expenses.
	 *
	 * @return the create date of this expenses
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc media of this expenses.
	 *
	 * @return the doc media of this expenses
	 */
	@Override
	public String getDocMedia() {
		return model.getDocMedia();
	}

	/**
	 * Returns the employee user ID of this expenses.
	 *
	 * @return the employee user ID of this expenses
	 */
	@Override
	public Long getEmployeeUserId() {
		return model.getEmployeeUserId();
	}

	/**
	 * Returns the expense amount of this expenses.
	 *
	 * @return the expense amount of this expenses
	 */
	@Override
	public Long getExpenseAmount() {
		return model.getExpenseAmount();
	}

	/**
	 * Returns the expense ID of this expenses.
	 *
	 * @return the expense ID of this expenses
	 */
	@Override
	public long getExpenseId() {
		return model.getExpenseId();
	}

	/**
	 * Returns the modified date of this expenses.
	 *
	 * @return the modified date of this expenses
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this expenses.
	 *
	 * @return the primary key of this expenses
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sub category ID of this expenses.
	 *
	 * @return the sub category ID of this expenses
	 */
	@Override
	public Long getSubCategoryId() {
		return model.getSubCategoryId();
	}

	/**
	 * Returns the user ID of this expenses.
	 *
	 * @return the user ID of this expenses
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this expenses.
	 *
	 * @return the user name of this expenses
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this expenses.
	 *
	 * @return the user uuid of this expenses
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this expenses.
	 *
	 * @return the uuid of this expenses
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
	 * Sets the category ID of this expenses.
	 *
	 * @param categoryId the category ID of this expenses
	 */
	@Override
	public void setCategoryId(Long categoryId) {
		model.setCategoryId(categoryId);
	}

	/**
	 * Sets the company ID of this expenses.
	 *
	 * @param companyId the company ID of this expenses
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this expenses.
	 *
	 * @param createDate the create date of this expenses
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc media of this expenses.
	 *
	 * @param docMedia the doc media of this expenses
	 */
	@Override
	public void setDocMedia(String docMedia) {
		model.setDocMedia(docMedia);
	}

	/**
	 * Sets the employee user ID of this expenses.
	 *
	 * @param employeeUserId the employee user ID of this expenses
	 */
	@Override
	public void setEmployeeUserId(Long employeeUserId) {
		model.setEmployeeUserId(employeeUserId);
	}

	/**
	 * Sets the expense amount of this expenses.
	 *
	 * @param expenseAmount the expense amount of this expenses
	 */
	@Override
	public void setExpenseAmount(Long expenseAmount) {
		model.setExpenseAmount(expenseAmount);
	}

	/**
	 * Sets the expense ID of this expenses.
	 *
	 * @param expenseId the expense ID of this expenses
	 */
	@Override
	public void setExpenseId(long expenseId) {
		model.setExpenseId(expenseId);
	}

	/**
	 * Sets the modified date of this expenses.
	 *
	 * @param modifiedDate the modified date of this expenses
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this expenses.
	 *
	 * @param primaryKey the primary key of this expenses
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sub category ID of this expenses.
	 *
	 * @param subCategoryId the sub category ID of this expenses
	 */
	@Override
	public void setSubCategoryId(Long subCategoryId) {
		model.setSubCategoryId(subCategoryId);
	}

	/**
	 * Sets the user ID of this expenses.
	 *
	 * @param userId the user ID of this expenses
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this expenses.
	 *
	 * @param userName the user name of this expenses
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this expenses.
	 *
	 * @param userUuid the user uuid of this expenses
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this expenses.
	 *
	 * @param uuid the uuid of this expenses
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
	protected ExpensesWrapper wrap(Expenses expenses) {
		return new ExpensesWrapper(expenses);
	}

}