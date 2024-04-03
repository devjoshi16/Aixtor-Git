/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExpensesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExpensesLocalService
 * @generated
 */
public class ExpensesLocalServiceWrapper
	implements ExpensesLocalService, ServiceWrapper<ExpensesLocalService> {

	public ExpensesLocalServiceWrapper() {
		this(null);
	}

	public ExpensesLocalServiceWrapper(
		ExpensesLocalService expensesLocalService) {

		_expensesLocalService = expensesLocalService;
	}

	/**
	 * Adds the expenses to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param expenses the expenses
	 * @return the expenses that was added
	 */
	@Override
	public com.expensio.common.data.model.Expenses addExpenses(
		com.expensio.common.data.model.Expenses expenses) {

		return _expensesLocalService.addExpenses(expenses);
	}

	/**
	 * Creates a new expenses with the primary key. Does not add the expenses to the database.
	 *
	 * @param expenseId the primary key for the new expenses
	 * @return the new expenses
	 */
	@Override
	public com.expensio.common.data.model.Expenses createExpenses(
		long expenseId) {

		return _expensesLocalService.createExpenses(expenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _expensesLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the expenses from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param expenses the expenses
	 * @return the expenses that was removed
	 */
	@Override
	public com.expensio.common.data.model.Expenses deleteExpenses(
		com.expensio.common.data.model.Expenses expenses) {

		return _expensesLocalService.deleteExpenses(expenses);
	}

	/**
	 * Deletes the expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses that was removed
	 * @throws PortalException if a expenses with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Expenses deleteExpenses(
			long expenseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _expensesLocalService.deleteExpenses(expenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _expensesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _expensesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _expensesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _expensesLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _expensesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _expensesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _expensesLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _expensesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _expensesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.expensio.common.data.model.Expenses fetchExpenses(
		long expenseId) {

		return _expensesLocalService.fetchExpenses(expenseId);
	}

	/**
	 * Returns the expenses with the matching UUID and company.
	 *
	 * @param uuid the expenses's UUID
	 * @param companyId the primary key of the company
	 * @return the matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	@Override
	public com.expensio.common.data.model.Expenses
		fetchExpensesByUuidAndCompanyId(String uuid, long companyId) {

		return _expensesLocalService.fetchExpensesByUuidAndCompanyId(
			uuid, companyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _expensesLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the expenses with the primary key.
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses
	 * @throws PortalException if a expenses with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Expenses getExpenses(long expenseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _expensesLocalService.getExpenses(expenseId);
	}

	/**
	 * Returns the expenses with the matching UUID and company.
	 *
	 * @param uuid the expenses's UUID
	 * @param companyId the primary key of the company
	 * @return the matching expenses
	 * @throws PortalException if a matching expenses could not be found
	 */
	@Override
	public com.expensio.common.data.model.Expenses
			getExpensesByUuidAndCompanyId(String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _expensesLocalService.getExpensesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of all the expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @return the range of expenseses
	 */
	@Override
	public java.util.List<com.expensio.common.data.model.Expenses>
		getExpenseses(int start, int end) {

		return _expensesLocalService.getExpenseses(start, end);
	}

	/**
	 * Returns the number of expenseses.
	 *
	 * @return the number of expenseses
	 */
	@Override
	public int getExpensesesCount() {
		return _expensesLocalService.getExpensesesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _expensesLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _expensesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _expensesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _expensesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the expenses in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param expenses the expenses
	 * @return the expenses that was updated
	 */
	@Override
	public com.expensio.common.data.model.Expenses updateExpenses(
		com.expensio.common.data.model.Expenses expenses) {

		return _expensesLocalService.updateExpenses(expenses);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _expensesLocalService.getBasePersistence();
	}

	@Override
	public ExpensesLocalService getWrappedService() {
		return _expensesLocalService;
	}

	@Override
	public void setWrappedService(ExpensesLocalService expensesLocalService) {
		_expensesLocalService = expensesLocalService;
	}

	private ExpensesLocalService _expensesLocalService;

}