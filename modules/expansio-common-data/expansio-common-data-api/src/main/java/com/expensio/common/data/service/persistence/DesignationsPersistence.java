/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.exception.NoSuchDesignationsException;
import com.expensio.common.data.model.Designations;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the designations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DesignationsUtil
 * @generated
 */
@ProviderType
public interface DesignationsPersistence extends BasePersistence<Designations> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DesignationsUtil} to access the designations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the designationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching designationses
	 */
	public java.util.List<Designations> findByUuid(String uuid);

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
	public java.util.List<Designations> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Designations> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator);

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
	public java.util.List<Designations> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public Designations findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Designations>
				orderByComparator)
		throws NoSuchDesignationsException;

	/**
	 * Returns the first designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public Designations fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator);

	/**
	 * Returns the last designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public Designations findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Designations>
				orderByComparator)
		throws NoSuchDesignationsException;

	/**
	 * Returns the last designations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public Designations fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator);

	/**
	 * Returns the designationses before and after the current designations in the ordered set where uuid = &#63;.
	 *
	 * @param designationId the primary key of the current designations
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next designations
	 * @throws NoSuchDesignationsException if a designations with the primary key could not be found
	 */
	public Designations[] findByUuid_PrevAndNext(
			long designationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Designations>
				orderByComparator)
		throws NoSuchDesignationsException;

	/**
	 * Removes all the designationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of designationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching designationses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the designationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching designationses
	 */
	public java.util.List<Designations> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Designations> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Designations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator);

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
	public java.util.List<Designations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public Designations findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Designations>
				orderByComparator)
		throws NoSuchDesignationsException;

	/**
	 * Returns the first designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public Designations fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator);

	/**
	 * Returns the last designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations
	 * @throws NoSuchDesignationsException if a matching designations could not be found
	 */
	public Designations findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Designations>
				orderByComparator)
		throws NoSuchDesignationsException;

	/**
	 * Returns the last designations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching designations, or <code>null</code> if a matching designations could not be found
	 */
	public Designations fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator);

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
	public Designations[] findByUuid_C_PrevAndNext(
			long designationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Designations>
				orderByComparator)
		throws NoSuchDesignationsException;

	/**
	 * Removes all the designationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of designationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching designationses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the designations in the entity cache if it is enabled.
	 *
	 * @param designations the designations
	 */
	public void cacheResult(Designations designations);

	/**
	 * Caches the designationses in the entity cache if it is enabled.
	 *
	 * @param designationses the designationses
	 */
	public void cacheResult(java.util.List<Designations> designationses);

	/**
	 * Creates a new designations with the primary key. Does not add the designations to the database.
	 *
	 * @param designationId the primary key for the new designations
	 * @return the new designations
	 */
	public Designations create(long designationId);

	/**
	 * Removes the designations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations that was removed
	 * @throws NoSuchDesignationsException if a designations with the primary key could not be found
	 */
	public Designations remove(long designationId)
		throws NoSuchDesignationsException;

	public Designations updateImpl(Designations designations);

	/**
	 * Returns the designations with the primary key or throws a <code>NoSuchDesignationsException</code> if it could not be found.
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations
	 * @throws NoSuchDesignationsException if a designations with the primary key could not be found
	 */
	public Designations findByPrimaryKey(long designationId)
		throws NoSuchDesignationsException;

	/**
	 * Returns the designations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations, or <code>null</code> if a designations with the primary key could not be found
	 */
	public Designations fetchByPrimaryKey(long designationId);

	/**
	 * Returns all the designationses.
	 *
	 * @return the designationses
	 */
	public java.util.List<Designations> findAll();

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
	public java.util.List<Designations> findAll(int start, int end);

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
	public java.util.List<Designations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator);

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
	public java.util.List<Designations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Designations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the designationses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of designationses.
	 *
	 * @return the number of designationses
	 */
	public int countAll();

}