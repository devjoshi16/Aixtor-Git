/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.service.persistence;

import com.expensio.data.exception.NoSuchlogin_logsException;
import com.expensio.data.model.login_logs;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the login_logs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see login_logsUtil
 * @generated
 */
@ProviderType
public interface login_logsPersistence extends BasePersistence<login_logs> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link login_logsUtil} to access the login_logs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the login_logses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching login_logses
	 */
	public java.util.List<login_logs> findByUuid(String uuid);

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
	public java.util.List<login_logs> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<login_logs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<login_logs>
			orderByComparator);

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
	public java.util.List<login_logs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<login_logs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching login_logs
	 * @throws NoSuchlogin_logsException if a matching login_logs could not be found
	 */
	public login_logs findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<login_logs>
				orderByComparator)
		throws NoSuchlogin_logsException;

	/**
	 * Returns the first login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching login_logs, or <code>null</code> if a matching login_logs could not be found
	 */
	public login_logs fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<login_logs>
			orderByComparator);

	/**
	 * Returns the last login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching login_logs
	 * @throws NoSuchlogin_logsException if a matching login_logs could not be found
	 */
	public login_logs findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<login_logs>
				orderByComparator)
		throws NoSuchlogin_logsException;

	/**
	 * Returns the last login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching login_logs, or <code>null</code> if a matching login_logs could not be found
	 */
	public login_logs fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<login_logs>
			orderByComparator);

	/**
	 * Returns the login_logses before and after the current login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param loginLogId the primary key of the current login_logs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next login_logs
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	public login_logs[] findByUuid_PrevAndNext(
			long loginLogId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<login_logs>
				orderByComparator)
		throws NoSuchlogin_logsException;

	/**
	 * Removes all the login_logses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of login_logses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching login_logses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the login_logs in the entity cache if it is enabled.
	 *
	 * @param login_logs the login_logs
	 */
	public void cacheResult(login_logs login_logs);

	/**
	 * Caches the login_logses in the entity cache if it is enabled.
	 *
	 * @param login_logses the login_logses
	 */
	public void cacheResult(java.util.List<login_logs> login_logses);

	/**
	 * Creates a new login_logs with the primary key. Does not add the login_logs to the database.
	 *
	 * @param loginLogId the primary key for the new login_logs
	 * @return the new login_logs
	 */
	public login_logs create(long loginLogId);

	/**
	 * Removes the login_logs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs that was removed
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	public login_logs remove(long loginLogId) throws NoSuchlogin_logsException;

	public login_logs updateImpl(login_logs login_logs);

	/**
	 * Returns the login_logs with the primary key or throws a <code>NoSuchlogin_logsException</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	public login_logs findByPrimaryKey(long loginLogId)
		throws NoSuchlogin_logsException;

	/**
	 * Returns the login_logs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs, or <code>null</code> if a login_logs with the primary key could not be found
	 */
	public login_logs fetchByPrimaryKey(long loginLogId);

	/**
	 * Returns all the login_logses.
	 *
	 * @return the login_logses
	 */
	public java.util.List<login_logs> findAll();

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
	public java.util.List<login_logs> findAll(int start, int end);

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
	public java.util.List<login_logs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<login_logs>
			orderByComparator);

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
	public java.util.List<login_logs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<login_logs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the login_logses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of login_logses.
	 *
	 * @return the number of login_logses
	 */
	public int countAll();

}