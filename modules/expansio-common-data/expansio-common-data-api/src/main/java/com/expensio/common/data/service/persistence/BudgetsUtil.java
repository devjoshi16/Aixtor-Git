/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.model.Budgets;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the budgets service. This utility wraps <code>com.expensio.common.data.service.persistence.impl.BudgetsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BudgetsPersistence
 * @generated
 */
public class BudgetsUtil {

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
	public static void clearCache(Budgets budgets) {
		getPersistence().clearCache(budgets);
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
	public static Map<Serializable, Budgets> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Budgets> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Budgets> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Budgets> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Budgets update(Budgets budgets) {
		return getPersistence().update(budgets);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Budgets update(
		Budgets budgets, ServiceContext serviceContext) {

		return getPersistence().update(budgets, serviceContext);
	}

	/**
	 * Returns all the budgetses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching budgetses
	 */
	public static List<Budgets> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the budgetses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @return the range of matching budgetses
	 */
	public static List<Budgets> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the budgetses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching budgetses
	 */
	public static List<Budgets> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the budgetses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching budgetses
	 */
	public static List<Budgets> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Budgets> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public static Budgets findByUuid_First(
			String uuid, OrderByComparator<Budgets> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public static Budgets fetchByUuid_First(
		String uuid, OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public static Budgets findByUuid_Last(
			String uuid, OrderByComparator<Budgets> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public static Budgets fetchByUuid_Last(
		String uuid, OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the budgetses before and after the current budgets in the ordered set where uuid = &#63;.
	 *
	 * @param budgetId the primary key of the current budgets
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next budgets
	 * @throws NoSuchBudgetsException if a budgets with the primary key could not be found
	 */
	public static Budgets[] findByUuid_PrevAndNext(
			long budgetId, String uuid,
			OrderByComparator<Budgets> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().findByUuid_PrevAndNext(
			budgetId, uuid, orderByComparator);
	}

	/**
	 * Removes all the budgetses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of budgetses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching budgetses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the budgetses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching budgetses
	 */
	public static List<Budgets> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the budgetses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @return the range of matching budgetses
	 */
	public static List<Budgets> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the budgetses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching budgetses
	 */
	public static List<Budgets> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the budgetses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching budgetses
	 */
	public static List<Budgets> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Budgets> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public static Budgets findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Budgets> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public static Budgets fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public static Budgets findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Budgets> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public static Budgets fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the budgetses before and after the current budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param budgetId the primary key of the current budgets
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next budgets
	 * @throws NoSuchBudgetsException if a budgets with the primary key could not be found
	 */
	public static Budgets[] findByUuid_C_PrevAndNext(
			long budgetId, String uuid, long companyId,
			OrderByComparator<Budgets> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			budgetId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the budgetses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of budgetses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching budgetses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the budgets in the entity cache if it is enabled.
	 *
	 * @param budgets the budgets
	 */
	public static void cacheResult(Budgets budgets) {
		getPersistence().cacheResult(budgets);
	}

	/**
	 * Caches the budgetses in the entity cache if it is enabled.
	 *
	 * @param budgetses the budgetses
	 */
	public static void cacheResult(List<Budgets> budgetses) {
		getPersistence().cacheResult(budgetses);
	}

	/**
	 * Creates a new budgets with the primary key. Does not add the budgets to the database.
	 *
	 * @param budgetId the primary key for the new budgets
	 * @return the new budgets
	 */
	public static Budgets create(long budgetId) {
		return getPersistence().create(budgetId);
	}

	/**
	 * Removes the budgets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets that was removed
	 * @throws NoSuchBudgetsException if a budgets with the primary key could not be found
	 */
	public static Budgets remove(long budgetId)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().remove(budgetId);
	}

	public static Budgets updateImpl(Budgets budgets) {
		return getPersistence().updateImpl(budgets);
	}

	/**
	 * Returns the budgets with the primary key or throws a <code>NoSuchBudgetsException</code> if it could not be found.
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets
	 * @throws NoSuchBudgetsException if a budgets with the primary key could not be found
	 */
	public static Budgets findByPrimaryKey(long budgetId)
		throws com.expensio.common.data.exception.NoSuchBudgetsException {

		return getPersistence().findByPrimaryKey(budgetId);
	}

	/**
	 * Returns the budgets with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets, or <code>null</code> if a budgets with the primary key could not be found
	 */
	public static Budgets fetchByPrimaryKey(long budgetId) {
		return getPersistence().fetchByPrimaryKey(budgetId);
	}

	/**
	 * Returns all the budgetses.
	 *
	 * @return the budgetses
	 */
	public static List<Budgets> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the budgetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @return the range of budgetses
	 */
	public static List<Budgets> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the budgetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of budgetses
	 */
	public static List<Budgets> findAll(
		int start, int end, OrderByComparator<Budgets> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the budgetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BudgetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of budgetses
	 * @param end the upper bound of the range of budgetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of budgetses
	 */
	public static List<Budgets> findAll(
		int start, int end, OrderByComparator<Budgets> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the budgetses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of budgetses.
	 *
	 * @return the number of budgetses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BudgetsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(BudgetsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile BudgetsPersistence _persistence;

}