/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BudgetsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BudgetsLocalService
 * @generated
 */
public class BudgetsLocalServiceWrapper
	implements BudgetsLocalService, ServiceWrapper<BudgetsLocalService> {

	public BudgetsLocalServiceWrapper() {
		this(null);
	}

	public BudgetsLocalServiceWrapper(BudgetsLocalService budgetsLocalService) {
		_budgetsLocalService = budgetsLocalService;
	}

	/**
	 * Adds the budgets to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BudgetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param budgets the budgets
	 * @return the budgets that was added
	 */
	@Override
	public com.expensio.common.data.model.Budgets addBudgets(
		com.expensio.common.data.model.Budgets budgets) {

		return _budgetsLocalService.addBudgets(budgets);
	}

	/**
	 * Creates a new budgets with the primary key. Does not add the budgets to the database.
	 *
	 * @param budgetId the primary key for the new budgets
	 * @return the new budgets
	 */
	@Override
	public com.expensio.common.data.model.Budgets createBudgets(long budgetId) {
		return _budgetsLocalService.createBudgets(budgetId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _budgetsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the budgets from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BudgetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param budgets the budgets
	 * @return the budgets that was removed
	 */
	@Override
	public com.expensio.common.data.model.Budgets deleteBudgets(
		com.expensio.common.data.model.Budgets budgets) {

		return _budgetsLocalService.deleteBudgets(budgets);
	}

	/**
	 * Deletes the budgets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BudgetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets that was removed
	 * @throws PortalException if a budgets with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Budgets deleteBudgets(long budgetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _budgetsLocalService.deleteBudgets(budgetId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _budgetsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _budgetsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _budgetsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _budgetsLocalService.dynamicQuery();
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

		return _budgetsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.BudgetsModelImpl</code>.
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

		return _budgetsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.BudgetsModelImpl</code>.
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

		return _budgetsLocalService.dynamicQuery(
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

		return _budgetsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _budgetsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.expensio.common.data.model.Budgets fetchBudgets(long budgetId) {
		return _budgetsLocalService.fetchBudgets(budgetId);
	}

	/**
	 * Returns the budgets with the matching UUID and company.
	 *
	 * @param uuid the budgets's UUID
	 * @param companyId the primary key of the company
	 * @return the matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	@Override
	public com.expensio.common.data.model.Budgets
		fetchBudgetsByUuidAndCompanyId(String uuid, long companyId) {

		return _budgetsLocalService.fetchBudgetsByUuidAndCompanyId(
			uuid, companyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _budgetsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the budgets with the primary key.
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets
	 * @throws PortalException if a budgets with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Budgets getBudgets(long budgetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _budgetsLocalService.getBudgets(budgetId);
	}

	/**
	 * Returns the budgets with the matching UUID and company.
	 *
	 * @param uuid the budgets's UUID
	 * @param companyId the primary key of the company
	 * @return the matching budgets
	 * @throws PortalException if a matching budgets could not be found
	 */
	@Override
	public com.expensio.common.data.model.Budgets getBudgetsByUuidAndCompanyId(
			String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _budgetsLocalService.getBudgetsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of all the budgetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @return the range of budgetses
	 */
	@Override
	public java.util.List<com.expensio.common.data.model.Budgets> getBudgetses(
		int start, int end) {

		return _budgetsLocalService.getBudgetses(start, end);
	}

	/**
	 * Returns the number of budgetses.
	 *
	 * @return the number of budgetses
	 */
	@Override
	public int getBudgetsesCount() {
		return _budgetsLocalService.getBudgetsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _budgetsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _budgetsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _budgetsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _budgetsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the budgets in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BudgetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param budgets the budgets
	 * @return the budgets that was updated
	 */
	@Override
	public com.expensio.common.data.model.Budgets updateBudgets(
		com.expensio.common.data.model.Budgets budgets) {

		return _budgetsLocalService.updateBudgets(budgets);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _budgetsLocalService.getBasePersistence();
	}

	@Override
	public BudgetsLocalService getWrappedService() {
		return _budgetsLocalService;
	}

	@Override
	public void setWrappedService(BudgetsLocalService budgetsLocalService) {
		_budgetsLocalService = budgetsLocalService;
	}

	private BudgetsLocalService _budgetsLocalService;

}