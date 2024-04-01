/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.service.persistence;

import com.expensio.data.model.login_logs;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the login_logs service. This utility wraps <code>com.expensio.data.service.persistence.impl.login_logsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see login_logsPersistence
 * @generated
 */
public class login_logsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(login_logs login_logs) {
		getPersistence().clearCache(login_logs);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, login_logs> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<login_logs> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<login_logs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<login_logs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<login_logs> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static login_logs update(login_logs login_logs) {
		return getPersistence().update(login_logs);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static login_logs update(
		login_logs login_logs, ServiceContext serviceContext) {

		return getPersistence().update(login_logs, serviceContext);
	}

	/**
	 * Returns all the login_logses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching login_logses
	 */
	public static List<login_logs> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the login_logses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>login_logsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of login_logses
	 * @param end the upper bound of the range of login_logses (not inclusive)
	 * @return the range of matching login_logses
	 */
	public static List<login_logs> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the login_logses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>login_logsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of login_logses
	 * @param end the upper bound of the range of login_logses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching login_logses
	 */
	public static List<login_logs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<login_logs> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the login_logses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>login_logsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of login_logses
	 * @param end the upper bound of the range of login_logses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching login_logses
	 */
	public static List<login_logs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<login_logs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching login_logs
	 * @throws NoSuchlogin_logsException if a matching login_logs could not be found
	 */
	public static login_logs findByUuid_First(
			String uuid, OrderByComparator<login_logs> orderByComparator)
		throws com.expensio.data.exception.NoSuchlogin_logsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching login_logs, or <code>null</code> if a matching login_logs could not be found
	 */
	public static login_logs fetchByUuid_First(
		String uuid, OrderByComparator<login_logs> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching login_logs
	 * @throws NoSuchlogin_logsException if a matching login_logs could not be found
	 */
	public static login_logs findByUuid_Last(
			String uuid, OrderByComparator<login_logs> orderByComparator)
		throws com.expensio.data.exception.NoSuchlogin_logsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching login_logs, or <code>null</code> if a matching login_logs could not be found
	 */
	public static login_logs fetchByUuid_Last(
		String uuid, OrderByComparator<login_logs> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the login_logses before and after the current login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param loginLogId the primary key of the current login_logs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next login_logs
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	public static login_logs[] findByUuid_PrevAndNext(
			long loginLogId, String uuid,
			OrderByComparator<login_logs> orderByComparator)
		throws com.expensio.data.exception.NoSuchlogin_logsException {

		return getPersistence().findByUuid_PrevAndNext(
			loginLogId, uuid, orderByComparator);
	}

	/**
	 * Removes all the login_logses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of login_logses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching login_logses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the login_logs in the entity cache if it is enabled.
	 *
	 * @param login_logs the login_logs
	 */
	public static void cacheResult(login_logs login_logs) {
		getPersistence().cacheResult(login_logs);
	}

	/**
	 * Caches the login_logses in the entity cache if it is enabled.
	 *
	 * @param login_logses the login_logses
	 */
	public static void cacheResult(List<login_logs> login_logses) {
		getPersistence().cacheResult(login_logses);
	}

	/**
	 * Creates a new login_logs with the primary key. Does not add the login_logs to the database.
	 *
	 * @param loginLogId the primary key for the new login_logs
	 * @return the new login_logs
	 */
	public static login_logs create(long loginLogId) {
		return getPersistence().create(loginLogId);
	}

	/**
	 * Removes the login_logs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs that was removed
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	public static login_logs remove(long loginLogId)
		throws com.expensio.data.exception.NoSuchlogin_logsException {

		return getPersistence().remove(loginLogId);
	}

	public static login_logs updateImpl(login_logs login_logs) {
		return getPersistence().updateImpl(login_logs);
	}

	/**
	 * Returns the login_logs with the primary key or throws a <code>NoSuchlogin_logsException</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	public static login_logs findByPrimaryKey(long loginLogId)
		throws com.expensio.data.exception.NoSuchlogin_logsException {

		return getPersistence().findByPrimaryKey(loginLogId);
	}

	/**
	 * Returns the login_logs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs, or <code>null</code> if a login_logs with the primary key could not be found
	 */
	public static login_logs fetchByPrimaryKey(long loginLogId) {
		return getPersistence().fetchByPrimaryKey(loginLogId);
	}

	/**
	 * Returns all the login_logses.
	 *
	 * @return the login_logses
	 */
	public static List<login_logs> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the login_logses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>login_logsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of login_logses
	 * @param end the upper bound of the range of login_logses (not inclusive)
	 * @return the range of login_logses
	 */
	public static List<login_logs> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the login_logses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>login_logsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of login_logses
	 * @param end the upper bound of the range of login_logses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of login_logses
	 */
	public static List<login_logs> findAll(
		int start, int end, OrderByComparator<login_logs> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the login_logses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>login_logsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of login_logses
	 * @param end the upper bound of the range of login_logses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of login_logses
	 */
	public static List<login_logs> findAll(
		int start, int end, OrderByComparator<login_logs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the login_logses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of login_logses.
	 *
	 * @return the number of login_logses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static login_logsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(login_logsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile login_logsPersistence _persistence;

}