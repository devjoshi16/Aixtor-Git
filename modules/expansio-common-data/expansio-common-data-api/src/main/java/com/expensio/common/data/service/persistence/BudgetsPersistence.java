/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.exception.NoSuchBudgetsException;
import com.expensio.common.data.model.Budgets;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the budgets service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BudgetsUtil
 * @generated
 */
@ProviderType
public interface BudgetsPersistence extends BasePersistence<Budgets> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BudgetsUtil} to access the budgets persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the budgetses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching budgetses
	 */
	public java.util.List<Budgets> findByUuid(String uuid);

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
	public java.util.List<Budgets> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Budgets> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator);

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
	public java.util.List<Budgets> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public Budgets findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Budgets>
				orderByComparator)
		throws NoSuchBudgetsException;

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public Budgets fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator);

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public Budgets findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Budgets>
				orderByComparator)
		throws NoSuchBudgetsException;

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public Budgets fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator);

	/**
	 * Returns the budgetses before and after the current budgets in the ordered set where uuid = &#63;.
	 *
	 * @param budgetId the primary key of the current budgets
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next budgets
	 * @throws NoSuchBudgetsException if a budgets with the primary key could not be found
	 */
	public Budgets[] findByUuid_PrevAndNext(
			long budgetId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Budgets>
				orderByComparator)
		throws NoSuchBudgetsException;

	/**
	 * Removes all the budgetses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of budgetses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching budgetses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the budgetses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching budgetses
	 */
	public java.util.List<Budgets> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Budgets> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Budgets> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator);

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
	public java.util.List<Budgets> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public Budgets findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Budgets>
				orderByComparator)
		throws NoSuchBudgetsException;

	/**
	 * Returns the first budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public Budgets fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator);

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets
	 * @throws NoSuchBudgetsException if a matching budgets could not be found
	 */
	public Budgets findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Budgets>
				orderByComparator)
		throws NoSuchBudgetsException;

	/**
	 * Returns the last budgets in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching budgets, or <code>null</code> if a matching budgets could not be found
	 */
	public Budgets fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator);

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
	public Budgets[] findByUuid_C_PrevAndNext(
			long budgetId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Budgets>
				orderByComparator)
		throws NoSuchBudgetsException;

	/**
	 * Removes all the budgetses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of budgetses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching budgetses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the budgets in the entity cache if it is enabled.
	 *
	 * @param budgets the budgets
	 */
	public void cacheResult(Budgets budgets);

	/**
	 * Caches the budgetses in the entity cache if it is enabled.
	 *
	 * @param budgetses the budgetses
	 */
	public void cacheResult(java.util.List<Budgets> budgetses);

	/**
	 * Creates a new budgets with the primary key. Does not add the budgets to the database.
	 *
	 * @param budgetId the primary key for the new budgets
	 * @return the new budgets
	 */
	public Budgets create(long budgetId);

	/**
	 * Removes the budgets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets that was removed
	 * @throws NoSuchBudgetsException if a budgets with the primary key could not be found
	 */
	public Budgets remove(long budgetId) throws NoSuchBudgetsException;

	public Budgets updateImpl(Budgets budgets);

	/**
	 * Returns the budgets with the primary key or throws a <code>NoSuchBudgetsException</code> if it could not be found.
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets
	 * @throws NoSuchBudgetsException if a budgets with the primary key could not be found
	 */
	public Budgets findByPrimaryKey(long budgetId)
		throws NoSuchBudgetsException;

	/**
	 * Returns the budgets with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param budgetId the primary key of the budgets
	 * @return the budgets, or <code>null</code> if a budgets with the primary key could not be found
	 */
	public Budgets fetchByPrimaryKey(long budgetId);

	/**
	 * Returns all the budgetses.
	 *
	 * @return the budgetses
	 */
	public java.util.List<Budgets> findAll();

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
	public java.util.List<Budgets> findAll(int start, int end);

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
	public java.util.List<Budgets> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator);

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
	public java.util.List<Budgets> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Budgets>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the budgetses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of budgetses.
	 *
	 * @return the number of budgetses
	 */
	public int countAll();

}