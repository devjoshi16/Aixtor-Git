/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link login_logsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see login_logsLocalService
 * @generated
 */
public class login_logsLocalServiceWrapper
	implements login_logsLocalService, ServiceWrapper<login_logsLocalService> {

	public login_logsLocalServiceWrapper() {
		this(null);
	}

	public login_logsLocalServiceWrapper(
		login_logsLocalService login_logsLocalService) {

		_login_logsLocalService = login_logsLocalService;
	}

	/**
	 * Adds the login_logs to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect login_logsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param login_logs the login_logs
	 * @return the login_logs that was added
	 */
	@Override
	public com.expensio.data.model.login_logs addlogin_logs(
		com.expensio.data.model.login_logs login_logs) {

		return _login_logsLocalService.addlogin_logs(login_logs);
	}

	/**
	 * Creates a new login_logs with the primary key. Does not add the login_logs to the database.
	 *
	 * @param loginLogId the primary key for the new login_logs
	 * @return the new login_logs
	 */
	@Override
	public com.expensio.data.model.login_logs createlogin_logs(
		long loginLogId) {

		return _login_logsLocalService.createlogin_logs(loginLogId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _login_logsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the login_logs from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect login_logsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param login_logs the login_logs
	 * @return the login_logs that was removed
	 */
	@Override
	public com.expensio.data.model.login_logs deletelogin_logs(
		com.expensio.data.model.login_logs login_logs) {

		return _login_logsLocalService.deletelogin_logs(login_logs);
	}

	/**
	 * Deletes the login_logs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect login_logsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs that was removed
	 * @throws PortalException if a login_logs with the primary key could not be found
	 */
	@Override
	public com.expensio.data.model.login_logs deletelogin_logs(long loginLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _login_logsLocalService.deletelogin_logs(loginLogId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _login_logsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _login_logsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _login_logsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _login_logsLocalService.dynamicQuery();
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

		return _login_logsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.data.model.impl.login_logsModelImpl</code>.
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

		return _login_logsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.data.model.impl.login_logsModelImpl</code>.
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

		return _login_logsLocalService.dynamicQuery(
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

		return _login_logsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _login_logsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.expensio.data.model.login_logs fetchlogin_logs(long loginLogId) {
		return _login_logsLocalService.fetchlogin_logs(loginLogId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _login_logsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _login_logsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the login_logs with the primary key.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs
	 * @throws PortalException if a login_logs with the primary key could not be found
	 */
	@Override
	public com.expensio.data.model.login_logs getlogin_logs(long loginLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _login_logsLocalService.getlogin_logs(loginLogId);
	}

	/**
	 * Returns a range of all the login_logses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.data.model.impl.login_logsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of login_logses
	 * @param end the upper bound of the range of login_logses (not inclusive)
	 * @return the range of login_logses
	 */
	@Override
	public java.util.List<com.expensio.data.model.login_logs> getlogin_logses(
		int start, int end) {

		return _login_logsLocalService.getlogin_logses(start, end);
	}

	/**
	 * Returns the number of login_logses.
	 *
	 * @return the number of login_logses
	 */
	@Override
	public int getlogin_logsesCount() {
		return _login_logsLocalService.getlogin_logsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _login_logsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _login_logsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the login_logs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect login_logsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param login_logs the login_logs
	 * @return the login_logs that was updated
	 */
	@Override
	public com.expensio.data.model.login_logs updatelogin_logs(
		com.expensio.data.model.login_logs login_logs) {

		return _login_logsLocalService.updatelogin_logs(login_logs);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _login_logsLocalService.getBasePersistence();
	}

	@Override
	public login_logsLocalService getWrappedService() {
		return _login_logsLocalService;
	}

	@Override
	public void setWrappedService(
		login_logsLocalService login_logsLocalService) {

		_login_logsLocalService = login_logsLocalService;
	}

	private login_logsLocalService _login_logsLocalService;

}