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
 * This class is a wrapper for {@link Budgets}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Budgets
 * @generated
 */
public class BudgetsWrapper
	extends BaseModelWrapper<Budgets>
	implements Budgets, ModelWrapper<Budgets> {

	public BudgetsWrapper(Budgets budgets) {
		super(budgets);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("budgetId", getBudgetId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("budgetAmount", getBudgetAmount());
		attributes.put("budgetDuration", getBudgetDuration());
		attributes.put("budgetDescription", getBudgetDescription());
		attributes.put("budgetDepartmentId", getBudgetDepartmentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long budgetId = (Long)attributes.get("budgetId");

		if (budgetId != null) {
			setBudgetId(budgetId);
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

		Long budgetAmount = (Long)attributes.get("budgetAmount");

		if (budgetAmount != null) {
			setBudgetAmount(budgetAmount);
		}

		Date budgetDuration = (Date)attributes.get("budgetDuration");

		if (budgetDuration != null) {
			setBudgetDuration(budgetDuration);
		}

		String budgetDescription = (String)attributes.get("budgetDescription");

		if (budgetDescription != null) {
			setBudgetDescription(budgetDescription);
		}

		Long budgetDepartmentId = (Long)attributes.get("budgetDepartmentId");

		if (budgetDepartmentId != null) {
			setBudgetDepartmentId(budgetDepartmentId);
		}
	}

	@Override
	public Budgets cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the budget amount of this budgets.
	 *
	 * @return the budget amount of this budgets
	 */
	@Override
	public Long getBudgetAmount() {
		return model.getBudgetAmount();
	}

	/**
	 * Returns the budget department ID of this budgets.
	 *
	 * @return the budget department ID of this budgets
	 */
	@Override
	public Long getBudgetDepartmentId() {
		return model.getBudgetDepartmentId();
	}

	/**
	 * Returns the budget description of this budgets.
	 *
	 * @return the budget description of this budgets
	 */
	@Override
	public String getBudgetDescription() {
		return model.getBudgetDescription();
	}

	/**
	 * Returns the budget duration of this budgets.
	 *
	 * @return the budget duration of this budgets
	 */
	@Override
	public Date getBudgetDuration() {
		return model.getBudgetDuration();
	}

	/**
	 * Returns the budget ID of this budgets.
	 *
	 * @return the budget ID of this budgets
	 */
	@Override
	public long getBudgetId() {
		return model.getBudgetId();
	}

	/**
	 * Returns the company ID of this budgets.
	 *
	 * @return the company ID of this budgets
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this budgets.
	 *
	 * @return the create date of this budgets
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the modified date of this budgets.
	 *
	 * @return the modified date of this budgets
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this budgets.
	 *
	 * @return the primary key of this budgets
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this budgets.
	 *
	 * @return the user ID of this budgets
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this budgets.
	 *
	 * @return the user name of this budgets
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this budgets.
	 *
	 * @return the user uuid of this budgets
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this budgets.
	 *
	 * @return the uuid of this budgets
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
	 * Sets the budget amount of this budgets.
	 *
	 * @param budgetAmount the budget amount of this budgets
	 */
	@Override
	public void setBudgetAmount(Long budgetAmount) {
		model.setBudgetAmount(budgetAmount);
	}

	/**
	 * Sets the budget department ID of this budgets.
	 *
	 * @param budgetDepartmentId the budget department ID of this budgets
	 */
	@Override
	public void setBudgetDepartmentId(Long budgetDepartmentId) {
		model.setBudgetDepartmentId(budgetDepartmentId);
	}

	/**
	 * Sets the budget description of this budgets.
	 *
	 * @param budgetDescription the budget description of this budgets
	 */
	@Override
	public void setBudgetDescription(String budgetDescription) {
		model.setBudgetDescription(budgetDescription);
	}

	/**
	 * Sets the budget duration of this budgets.
	 *
	 * @param budgetDuration the budget duration of this budgets
	 */
	@Override
	public void setBudgetDuration(Date budgetDuration) {
		model.setBudgetDuration(budgetDuration);
	}

	/**
	 * Sets the budget ID of this budgets.
	 *
	 * @param budgetId the budget ID of this budgets
	 */
	@Override
	public void setBudgetId(long budgetId) {
		model.setBudgetId(budgetId);
	}

	/**
	 * Sets the company ID of this budgets.
	 *
	 * @param companyId the company ID of this budgets
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this budgets.
	 *
	 * @param createDate the create date of this budgets
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the modified date of this budgets.
	 *
	 * @param modifiedDate the modified date of this budgets
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this budgets.
	 *
	 * @param primaryKey the primary key of this budgets
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this budgets.
	 *
	 * @param userId the user ID of this budgets
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this budgets.
	 *
	 * @param userName the user name of this budgets
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this budgets.
	 *
	 * @param userUuid the user uuid of this budgets
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this budgets.
	 *
	 * @param uuid the uuid of this budgets
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
	protected BudgetsWrapper wrap(Budgets budgets) {
		return new BudgetsWrapper(budgets);
	}

}