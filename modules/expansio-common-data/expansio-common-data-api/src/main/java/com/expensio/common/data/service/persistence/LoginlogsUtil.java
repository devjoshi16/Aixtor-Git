/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.model.Loginlogs;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the loginlogs service. This utility wraps <code>com.expensio.common.data.service.persistence.impl.LoginlogsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LoginlogsPersistence
 * @generated
 */
public class LoginlogsUtil {

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
	public static void clearCache(Loginlogs loginlogs) {
		getPersistence().clearCache(loginlogs);
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
	public static Map<Serializable, Loginlogs> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Loginlogs> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Loginlogs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Loginlogs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Loginlogs> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Loginlogs update(Loginlogs loginlogs) {
		return getPersistence().update(loginlogs);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Loginlogs update(
		Loginlogs loginlogs, ServiceContext serviceContext) {

		return getPersistence().update(loginlogs, serviceContext);
	}

	/**
	 * Returns all the loginlogses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching loginlogses
	 */
	public static List<Loginlogs> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the loginlogses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoginlogsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of loginlogses
	 * @param end the upper bound of the range of loginlogses (not inclusive)
	 * @return the range of matching loginlogses
	 */
	public static List<Loginlogs> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the loginlogses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoginlogsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of loginlogses
	 * @param end the upper bound of the range of loginlogses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loginlogses
	 */
	public static List<Loginlogs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Loginlogs> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the loginlogses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoginlogsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of loginlogses
	 * @param end the upper bound of the range of loginlogses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching loginlogses
	 */
	public static List<Loginlogs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Loginlogs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loginlogs
	 * @throws NoSuchLoginlogsException if a matching loginlogs could not be found
	 */
	public static Loginlogs findByUuid_First(
			String uuid, OrderByComparator<Loginlogs> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchLoginlogsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loginlogs, or <code>null</code> if a matching loginlogs could not be found
	 */
	public static Loginlogs fetchByUuid_First(
		String uuid, OrderByComparator<Loginlogs> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loginlogs
	 * @throws NoSuchLoginlogsException if a matching loginlogs could not be found
	 */
	public static Loginlogs findByUuid_Last(
			String uuid, OrderByComparator<Loginlogs> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchLoginlogsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loginlogs, or <code>null</code> if a matching loginlogs could not be found
	 */
	public static Loginlogs fetchByUuid_Last(
		String uuid, OrderByComparator<Loginlogs> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the loginlogses before and after the current loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param loginLogId the primary key of the current loginlogs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loginlogs
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	public static Loginlogs[] findByUuid_PrevAndNext(
			long loginLogId, String uuid,
			OrderByComparator<Loginlogs> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchLoginlogsException {

		return getPersistence().findByUuid_PrevAndNext(
			loginLogId, uuid, orderByComparator);
	}

	/**
	 * Removes all the loginlogses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of loginlogses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching loginlogses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the loginlogs in the entity cache if it is enabled.
	 *
	 * @param loginlogs the loginlogs
	 */
	public static void cacheResult(Loginlogs loginlogs) {
		getPersistence().cacheResult(loginlogs);
	}

	/**
	 * Caches the loginlogses in the entity cache if it is enabled.
	 *
	 * @param loginlogses the loginlogses
	 */
	public static void cacheResult(List<Loginlogs> loginlogses) {
		getPersistence().cacheResult(loginlogses);
	}

	/**
	 * Creates a new loginlogs with the primary key. Does not add the loginlogs to the database.
	 *
	 * @param loginLogId the primary key for the new loginlogs
	 * @return the new loginlogs
	 */
	public static Loginlogs create(long loginLogId) {
		return getPersistence().create(loginLogId);
	}

	/**
	 * Removes the loginlogs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs that was removed
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	public static Loginlogs remove(long loginLogId)
		throws com.expensio.common.data.exception.NoSuchLoginlogsException {

		return getPersistence().remove(loginLogId);
	}

	public static Loginlogs updateImpl(Loginlogs loginlogs) {
		return getPersistence().updateImpl(loginlogs);
	}

	/**
	 * Returns the loginlogs with the primary key or throws a <code>NoSuchLoginlogsException</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	public static Loginlogs findByPrimaryKey(long loginLogId)
		throws com.expensio.common.data.exception.NoSuchLoginlogsException {

		return getPersistence().findByPrimaryKey(loginLogId);
	}

	/**
	 * Returns the loginlogs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs, or <code>null</code> if a loginlogs with the primary key could not be found
	 */
	public static Loginlogs fetchByPrimaryKey(long loginLogId) {
		return getPersistence().fetchByPrimaryKey(loginLogId);
	}

	/**
	 * Returns all the loginlogses.
	 *
	 * @return the loginlogses
	 */
	public static List<Loginlogs> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the loginlogses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoginlogsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loginlogses
	 * @param end the upper bound of the range of loginlogses (not inclusive)
	 * @return the range of loginlogses
	 */
	public static List<Loginlogs> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the loginlogses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoginlogsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loginlogses
	 * @param end the upper bound of the range of loginlogses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loginlogses
	 */
	public static List<Loginlogs> findAll(
		int start, int end, OrderByComparator<Loginlogs> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the loginlogses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoginlogsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loginlogses
	 * @param end the upper bound of the range of loginlogses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of loginlogses
	 */
	public static List<Loginlogs> findAll(
		int start, int end, OrderByComparator<Loginlogs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the loginlogses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of loginlogses.
	 *
	 * @return the number of loginlogses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LoginlogsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(LoginlogsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile LoginlogsPersistence _persistence;

}