/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.model.Expenses;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the expenses service. This utility wraps <code>com.expensio.common.data.service.persistence.impl.ExpensesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExpensesPersistence
 * @generated
 */
public class ExpensesUtil {

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
	public static void clearCache(Expenses expenses) {
		getPersistence().clearCache(expenses);
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
	public static Map<Serializable, Expenses> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Expenses> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Expenses> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Expenses> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Expenses update(Expenses expenses) {
		return getPersistence().update(expenses);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Expenses update(
		Expenses expenses, ServiceContext serviceContext) {

		return getPersistence().update(expenses, serviceContext);
	}

	/**
	 * Returns all the expenseses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching expenseses
	 */
	public static List<Expenses> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the expenseses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @return the range of matching expenseses
	 */
	public static List<Expenses> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the expenseses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching expenseses
	 */
	public static List<Expenses> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the expenseses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching expenseses
	 */
	public static List<Expenses> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Expenses> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public static Expenses findByUuid_First(
			String uuid, OrderByComparator<Expenses> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public static Expenses fetchByUuid_First(
		String uuid, OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public static Expenses findByUuid_Last(
			String uuid, OrderByComparator<Expenses> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public static Expenses fetchByUuid_Last(
		String uuid, OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the expenseses before and after the current expenses in the ordered set where uuid = &#63;.
	 *
	 * @param expenseId the primary key of the current expenses
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next expenses
	 * @throws NoSuchExpensesException if a expenses with the primary key could not be found
	 */
	public static Expenses[] findByUuid_PrevAndNext(
			long expenseId, String uuid,
			OrderByComparator<Expenses> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().findByUuid_PrevAndNext(
			expenseId, uuid, orderByComparator);
	}

	/**
	 * Removes all the expenseses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of expenseses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching expenseses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the expenseses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching expenseses
	 */
	public static List<Expenses> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the expenseses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @return the range of matching expenseses
	 */
	public static List<Expenses> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the expenseses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching expenseses
	 */
	public static List<Expenses> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the expenseses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching expenseses
	 */
	public static List<Expenses> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Expenses> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public static Expenses findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Expenses> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public static Expenses fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public static Expenses findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Expenses> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public static Expenses fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the expenseses before and after the current expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param expenseId the primary key of the current expenses
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next expenses
	 * @throws NoSuchExpensesException if a expenses with the primary key could not be found
	 */
	public static Expenses[] findByUuid_C_PrevAndNext(
			long expenseId, String uuid, long companyId,
			OrderByComparator<Expenses> orderByComparator)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			expenseId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the expenseses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of expenseses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching expenseses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the expenses in the entity cache if it is enabled.
	 *
	 * @param expenses the expenses
	 */
	public static void cacheResult(Expenses expenses) {
		getPersistence().cacheResult(expenses);
	}

	/**
	 * Caches the expenseses in the entity cache if it is enabled.
	 *
	 * @param expenseses the expenseses
	 */
	public static void cacheResult(List<Expenses> expenseses) {
		getPersistence().cacheResult(expenseses);
	}

	/**
	 * Creates a new expenses with the primary key. Does not add the expenses to the database.
	 *
	 * @param expenseId the primary key for the new expenses
	 * @return the new expenses
	 */
	public static Expenses create(long expenseId) {
		return getPersistence().create(expenseId);
	}

	/**
	 * Removes the expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses that was removed
	 * @throws NoSuchExpensesException if a expenses with the primary key could not be found
	 */
	public static Expenses remove(long expenseId)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().remove(expenseId);
	}

	public static Expenses updateImpl(Expenses expenses) {
		return getPersistence().updateImpl(expenses);
	}

	/**
	 * Returns the expenses with the primary key or throws a <code>NoSuchExpensesException</code> if it could not be found.
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses
	 * @throws NoSuchExpensesException if a expenses with the primary key could not be found
	 */
	public static Expenses findByPrimaryKey(long expenseId)
		throws com.expensio.common.data.exception.NoSuchExpensesException {

		return getPersistence().findByPrimaryKey(expenseId);
	}

	/**
	 * Returns the expenses with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses, or <code>null</code> if a expenses with the primary key could not be found
	 */
	public static Expenses fetchByPrimaryKey(long expenseId) {
		return getPersistence().fetchByPrimaryKey(expenseId);
	}

	/**
	 * Returns all the expenseses.
	 *
	 * @return the expenseses
	 */
	public static List<Expenses> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @return the range of expenseses
	 */
	public static List<Expenses> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of expenseses
	 */
	public static List<Expenses> findAll(
		int start, int end, OrderByComparator<Expenses> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of expenseses
	 * @param end the upper bound of the range of expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of expenseses
	 */
	public static List<Expenses> findAll(
		int start, int end, OrderByComparator<Expenses> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the expenseses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of expenseses.
	 *
	 * @return the number of expenseses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExpensesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ExpensesPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ExpensesPersistence _persistence;

}