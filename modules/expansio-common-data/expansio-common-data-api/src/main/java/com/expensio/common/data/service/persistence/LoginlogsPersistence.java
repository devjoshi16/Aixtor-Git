/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.exception.NoSuchLoginlogsException;
import com.expensio.common.data.model.Loginlogs;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the loginlogs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LoginlogsUtil
 * @generated
 */
@ProviderType
public interface LoginlogsPersistence extends BasePersistence<Loginlogs> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoginlogsUtil} to access the loginlogs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the loginlogses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching loginlogses
	 */
	public java.util.List<Loginlogs> findByUuid(String uuid);

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
	public java.util.List<Loginlogs> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Loginlogs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
			orderByComparator);

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
	public java.util.List<Loginlogs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loginlogs
	 * @throws NoSuchLoginlogsException if a matching loginlogs could not be found
	 */
	public Loginlogs findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
				orderByComparator)
		throws NoSuchLoginlogsException;

	/**
	 * Returns the first loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loginlogs, or <code>null</code> if a matching loginlogs could not be found
	 */
	public Loginlogs fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
			orderByComparator);

	/**
	 * Returns the last loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loginlogs
	 * @throws NoSuchLoginlogsException if a matching loginlogs could not be found
	 */
	public Loginlogs findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
				orderByComparator)
		throws NoSuchLoginlogsException;

	/**
	 * Returns the last loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loginlogs, or <code>null</code> if a matching loginlogs could not be found
	 */
	public Loginlogs fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
			orderByComparator);

	/**
	 * Returns the loginlogses before and after the current loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param loginLogId the primary key of the current loginlogs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loginlogs
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	public Loginlogs[] findByUuid_PrevAndNext(
			long loginLogId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
				orderByComparator)
		throws NoSuchLoginlogsException;

	/**
	 * Removes all the loginlogses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of loginlogses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching loginlogses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the loginlogs in the entity cache if it is enabled.
	 *
	 * @param loginlogs the loginlogs
	 */
	public void cacheResult(Loginlogs loginlogs);

	/**
	 * Caches the loginlogses in the entity cache if it is enabled.
	 *
	 * @param loginlogses the loginlogses
	 */
	public void cacheResult(java.util.List<Loginlogs> loginlogses);

	/**
	 * Creates a new loginlogs with the primary key. Does not add the loginlogs to the database.
	 *
	 * @param loginLogId the primary key for the new loginlogs
	 * @return the new loginlogs
	 */
	public Loginlogs create(long loginLogId);

	/**
	 * Removes the loginlogs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs that was removed
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	public Loginlogs remove(long loginLogId) throws NoSuchLoginlogsException;

	public Loginlogs updateImpl(Loginlogs loginlogs);

	/**
	 * Returns the loginlogs with the primary key or throws a <code>NoSuchLoginlogsException</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	public Loginlogs findByPrimaryKey(long loginLogId)
		throws NoSuchLoginlogsException;

	/**
	 * Returns the loginlogs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs, or <code>null</code> if a loginlogs with the primary key could not be found
	 */
	public Loginlogs fetchByPrimaryKey(long loginLogId);

	/**
	 * Returns all the loginlogses.
	 *
	 * @return the loginlogses
	 */
	public java.util.List<Loginlogs> findAll();

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
	public java.util.List<Loginlogs> findAll(int start, int end);

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
	public java.util.List<Loginlogs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
			orderByComparator);

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
	public java.util.List<Loginlogs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loginlogs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the loginlogses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of loginlogses.
	 *
	 * @return the number of loginlogses
	 */
	public int countAll();

}