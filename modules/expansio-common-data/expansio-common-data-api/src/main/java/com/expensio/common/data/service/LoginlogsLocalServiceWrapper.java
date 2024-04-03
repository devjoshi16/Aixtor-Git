/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link LoginlogsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LoginlogsLocalService
 * @generated
 */
public class LoginlogsLocalServiceWrapper
	implements LoginlogsLocalService, ServiceWrapper<LoginlogsLocalService> {

	public LoginlogsLocalServiceWrapper() {
		this(null);
	}

	public LoginlogsLocalServiceWrapper(
		LoginlogsLocalService loginlogsLocalService) {

		_loginlogsLocalService = loginlogsLocalService;
	}

	/**
	 * Adds the loginlogs to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoginlogsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loginlogs the loginlogs
	 * @return the loginlogs that was added
	 */
	@Override
	public com.expensio.common.data.model.Loginlogs addLoginlogs(
		com.expensio.common.data.model.Loginlogs loginlogs) {

		return _loginlogsLocalService.addLoginlogs(loginlogs);
	}

	/**
	 * Creates a new loginlogs with the primary key. Does not add the loginlogs to the database.
	 *
	 * @param loginLogId the primary key for the new loginlogs
	 * @return the new loginlogs
	 */
	@Override
	public com.expensio.common.data.model.Loginlogs createLoginlogs(
		long loginLogId) {

		return _loginlogsLocalService.createLoginlogs(loginLogId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loginlogsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the loginlogs from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoginlogsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loginlogs the loginlogs
	 * @return the loginlogs that was removed
	 */
	@Override
	public com.expensio.common.data.model.Loginlogs deleteLoginlogs(
		com.expensio.common.data.model.Loginlogs loginlogs) {

		return _loginlogsLocalService.deleteLoginlogs(loginlogs);
	}

	/**
	 * Deletes the loginlogs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoginlogsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs that was removed
	 * @throws PortalException if a loginlogs with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Loginlogs deleteLoginlogs(
			long loginLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loginlogsLocalService.deleteLoginlogs(loginLogId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loginlogsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _loginlogsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _loginlogsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loginlogsLocalService.dynamicQuery();
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

		return _loginlogsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.LoginlogsModelImpl</code>.
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

		return _loginlogsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.LoginlogsModelImpl</code>.
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

		return _loginlogsLocalService.dynamicQuery(
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

		return _loginlogsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _loginlogsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.expensio.common.data.model.Loginlogs fetchLoginlogs(
		long loginLogId) {

		return _loginlogsLocalService.fetchLoginlogs(loginLogId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _loginlogsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _loginlogsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the loginlogs with the primary key.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs
	 * @throws PortalException if a loginlogs with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Loginlogs getLoginlogs(
			long loginLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loginlogsLocalService.getLoginlogs(loginLogId);
	}

	/**
	 * Returns a range of all the loginlogses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.LoginlogsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loginlogses
	 * @param end the upper bound of the range of loginlogses (not inclusive)
	 * @return the range of loginlogses
	 */
	@Override
	public java.util.List<com.expensio.common.data.model.Loginlogs>
		getLoginlogses(int start, int end) {

		return _loginlogsLocalService.getLoginlogses(start, end);
	}

	/**
	 * Returns the number of loginlogses.
	 *
	 * @return the number of loginlogses
	 */
	@Override
	public int getLoginlogsesCount() {
		return _loginlogsLocalService.getLoginlogsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _loginlogsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loginlogsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the loginlogs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoginlogsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loginlogs the loginlogs
	 * @return the loginlogs that was updated
	 */
	@Override
	public com.expensio.common.data.model.Loginlogs updateLoginlogs(
		com.expensio.common.data.model.Loginlogs loginlogs) {

		return _loginlogsLocalService.updateLoginlogs(loginlogs);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _loginlogsLocalService.getBasePersistence();
	}

	@Override
	public LoginlogsLocalService getWrappedService() {
		return _loginlogsLocalService;
	}

	@Override
	public void setWrappedService(LoginlogsLocalService loginlogsLocalService) {
		_loginlogsLocalService = loginlogsLocalService;
	}

	private LoginlogsLocalService _loginlogsLocalService;

}