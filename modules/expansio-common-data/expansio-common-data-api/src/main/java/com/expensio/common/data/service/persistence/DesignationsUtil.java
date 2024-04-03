/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.model.Designations;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the designations service. This utility wraps <code>com.expensio.common.data.service.persistence.impl.DesignationsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DesignationsPersistence
 * @generated
 */
public class DesignationsUtil {

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
	public static void clearCache(Designations designations) {
		getPersistence().clearCache(designations);
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
	public static Map<Serializable, Designations> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Designations> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Designations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Designations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Designations> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Designations update(Designations designations) {
		return getPersistence().update(designations);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Designations update(
		Designations designations, ServiceContext serviceContext) {

		return getPersistence().update(designations, serviceContext);
	}

	/**
	 * Returns all the designationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching designationses
	 */
	public static List<Designations> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the designationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @return the range of matching designationses
	 */
	public static List<Designations> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the designationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching designationses
	 */
	public static List<Designations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Designations> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the designationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching designationses
	 */
	public static List<Designations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Designations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public static Designations findByUuid_First(
			String uuid, OrderByComparator<Designations> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public static Designations fetchByUuid_First(
		String uuid, OrderByComparator<Designations> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public static Designations findByUuid_Last(
			String uuid, OrderByComparator<Designations> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public static Designations fetchByUuid_Last(
		String uuid, OrderByComparator<Designations> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the designationses before and after the current designations in the ordered set where uuid = &#63;.
	 *
	 * @param designationId the primary key of the current designations
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next designations
	 * @throws NoSuchDesignationsException if a designations with the primary key could not be found
	 */
	public static Designations[] findByUuid_PrevAndNext(
			long designationId, String uuid,
			OrderByComparator<Designations> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().findByUuid_PrevAndNext(
			designationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the designationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of designationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching designationses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the designationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching designationses
	 */
	public static List<Designations> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the designationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @return the range of matching designationses
	 */
	public static List<Designations> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the designationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching designationses
	 */
	public static List<Designations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Designations> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the designationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching designationses
	 */
	public static List<Designations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Designations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public static Designations findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Designations> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public static Designations fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Designations> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public static Designations findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Designations> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public static Designations fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Designations> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the designationses before and after the current designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param designationId the primary key of the current designations
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next designations
	 * @throws NoSuchDesignationsException if a designations with the primary key could not be found
	 */
	public static Designations[] findByUuid_C_PrevAndNext(
			long designationId, String uuid, long companyId,
			OrderByComparator<Designations> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			designationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the designationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of designationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching designationses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the designations in the entity cache if it is enabled.
	 *
	 * @param designations the designations
	 */
	public static void cacheResult(Designations designations) {
		getPersistence().cacheResult(designations);
	}

	/**
	 * Caches the designationses in the entity cache if it is enabled.
	 *
	 * @param designationses the designationses
	 */
	public static void cacheResult(List<Designations> designationses) {
		getPersistence().cacheResult(designationses);
	}

	/**
	 * Creates a new designations with the primary key. Does not add the designations to the database.
	 *
	 * @param designationId the primary key for the new designations
	 * @return the new designations
	 */
	public static Designations create(long designationId) {
		return getPersistence().create(designationId);
	}

	/**
	 * Removes the designations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations that was removed
	 * @throws NoSuchDesignationsException if a designations with the primary key could not be found
	 */
	public static Designations remove(long designationId)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().remove(designationId);
	}

	public static Designations updateImpl(Designations designations) {
		return getPersistence().updateImpl(designations);
	}

	/**
	 * Returns the designations with the primary key or throws a <code>NoSuchDesignationsException</code> if it could not be found.
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations
	 * @throws NoSuchDesignationsException if a designations with the primary key could not be found
	 */
	public static Designations findByPrimaryKey(long designationId)
		throws com.expensio.common.data.exception.NoSuchDesignationsException {

		return getPersistence().findByPrimaryKey(designationId);
	}

	/**
	 * Returns the designations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations, or <code>null</code> if a designations with the primary key could not be found
	 */
	public static Designations fetchByPrimaryKey(long designationId) {
		return getPersistence().fetchByPrimaryKey(designationId);
	}

	/**
	 * Returns all the designationses.
	 *
	 * @return the designationses
	 */
	public static List<Designations> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the designationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @return the range of designationses
	 */
	public static List<Designations> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the designationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of designationses
	 */
	public static List<Designations> findAll(
		int start, int end, OrderByComparator<Designations> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the designationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of designationses
	 */
	public static List<Designations> findAll(
		int start, int end, OrderByComparator<Designations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the designationses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of designationses.
	 *
	 * @return the number of designationses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DesignationsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(DesignationsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile DesignationsPersistence _persistence;

}