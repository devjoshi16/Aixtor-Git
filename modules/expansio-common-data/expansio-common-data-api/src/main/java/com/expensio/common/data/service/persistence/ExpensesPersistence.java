/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.exception.NoSuchExpensesException;
import com.expensio.common.data.model.Expenses;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the expenses service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExpensesUtil
 * @generated
 */
@ProviderType
public interface ExpensesPersistence extends BasePersistence<Expenses> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExpensesUtil} to access the expenses persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the expenseses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching expenseses
	 */
	public java.util.List<Expenses> findByUuid(String uuid);

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
	public java.util.List<Expenses> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Expenses> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator);

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
	public java.util.List<Expenses> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public Expenses findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Expenses>
				orderByComparator)
		throws NoSuchExpensesException;

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public Expenses fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator);

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public Expenses findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Expenses>
				orderByComparator)
		throws NoSuchExpensesException;

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public Expenses fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator);

	/**
	 * Returns the expenseses before and after the current expenses in the ordered set where uuid = &#63;.
	 *
	 * @param expenseId the primary key of the current expenses
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next expenses
	 * @throws NoSuchExpensesException if a expenses with the primary key could not be found
	 */
	public Expenses[] findByUuid_PrevAndNext(
			long expenseId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Expenses>
				orderByComparator)
		throws NoSuchExpensesException;

	/**
	 * Removes all the expenseses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of expenseses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching expenseses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the expenseses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching expenseses
	 */
	public java.util.List<Expenses> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Expenses> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Expenses> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator);

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
	public java.util.List<Expenses> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public Expenses findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Expenses>
				orderByComparator)
		throws NoSuchExpensesException;

	/**
	 * Returns the first expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public Expenses fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator);

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses
	 * @throws NoSuchExpensesException if a matching expenses could not be found
	 */
	public Expenses findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Expenses>
				orderByComparator)
		throws NoSuchExpensesException;

	/**
	 * Returns the last expenses in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching expenses, or <code>null</code> if a matching expenses could not be found
	 */
	public Expenses fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator);

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
	public Expenses[] findByUuid_C_PrevAndNext(
			long expenseId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Expenses>
				orderByComparator)
		throws NoSuchExpensesException;

	/**
	 * Removes all the expenseses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of expenseses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching expenseses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the expenses in the entity cache if it is enabled.
	 *
	 * @param expenses the expenses
	 */
	public void cacheResult(Expenses expenses);

	/**
	 * Caches the expenseses in the entity cache if it is enabled.
	 *
	 * @param expenseses the expenseses
	 */
	public void cacheResult(java.util.List<Expenses> expenseses);

	/**
	 * Creates a new expenses with the primary key. Does not add the expenses to the database.
	 *
	 * @param expenseId the primary key for the new expenses
	 * @return the new expenses
	 */
	public Expenses create(long expenseId);

	/**
	 * Removes the expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses that was removed
	 * @throws NoSuchExpensesException if a expenses with the primary key could not be found
	 */
	public Expenses remove(long expenseId) throws NoSuchExpensesException;

	public Expenses updateImpl(Expenses expenses);

	/**
	 * Returns the expenses with the primary key or throws a <code>NoSuchExpensesException</code> if it could not be found.
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses
	 * @throws NoSuchExpensesException if a expenses with the primary key could not be found
	 */
	public Expenses findByPrimaryKey(long expenseId)
		throws NoSuchExpensesException;

	/**
	 * Returns the expenses with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param expenseId the primary key of the expenses
	 * @return the expenses, or <code>null</code> if a expenses with the primary key could not be found
	 */
	public Expenses fetchByPrimaryKey(long expenseId);

	/**
	 * Returns all the expenseses.
	 *
	 * @return the expenseses
	 */
	public java.util.List<Expenses> findAll();

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
	public java.util.List<Expenses> findAll(int start, int end);

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
	public java.util.List<Expenses> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator);

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
	public java.util.List<Expenses> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Expenses>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the expenseses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of expenseses.
	 *
	 * @return the number of expenseses
	 */
	public int countAll();

}