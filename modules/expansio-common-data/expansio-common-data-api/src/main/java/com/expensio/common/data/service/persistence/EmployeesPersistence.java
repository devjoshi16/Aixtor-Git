/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.exception.NoSuchEmployeesException;
import com.expensio.common.data.model.Employees;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the employees service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeesUtil
 * @generated
 */
@ProviderType
public interface EmployeesPersistence extends BasePersistence<Employees> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeesUtil} to access the employees persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the employeeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching employeeses
	 */
	public java.util.List<Employees> findByUuid(String uuid);

	/**
	 * Returns a range of all the employeeses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @return the range of matching employeeses
	 */
	public java.util.List<Employees> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the employeeses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employeeses
	 */
	public java.util.List<Employees> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator);

	/**
	 * Returns an ordered range of all the employeeses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employeeses
	 */
	public java.util.List<Employees> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first employees in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employees
	 * @throws NoSuchEmployeesException if a matching employees could not be found
	 */
	public Employees findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Employees>
				orderByComparator)
		throws NoSuchEmployeesException;

	/**
	 * Returns the first employees in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employees, or <code>null</code> if a matching employees could not be found
	 */
	public Employees fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator);

	/**
	 * Returns the last employees in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employees
	 * @throws NoSuchEmployeesException if a matching employees could not be found
	 */
	public Employees findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Employees>
				orderByComparator)
		throws NoSuchEmployeesException;

	/**
	 * Returns the last employees in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employees, or <code>null</code> if a matching employees could not be found
	 */
	public Employees fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator);

	/**
	 * Returns the employeeses before and after the current employees in the ordered set where uuid = &#63;.
	 *
	 * @param employeeId the primary key of the current employees
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employees
	 * @throws NoSuchEmployeesException if a employees with the primary key could not be found
	 */
	public Employees[] findByUuid_PrevAndNext(
			long employeeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Employees>
				orderByComparator)
		throws NoSuchEmployeesException;

	/**
	 * Removes all the employeeses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of employeeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching employeeses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the employeeses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching employeeses
	 */
	public java.util.List<Employees> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the employeeses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @return the range of matching employeeses
	 */
	public java.util.List<Employees> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the employeeses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employeeses
	 */
	public java.util.List<Employees> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator);

	/**
	 * Returns an ordered range of all the employeeses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employeeses
	 */
	public java.util.List<Employees> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first employees in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employees
	 * @throws NoSuchEmployeesException if a matching employees could not be found
	 */
	public Employees findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Employees>
				orderByComparator)
		throws NoSuchEmployeesException;

	/**
	 * Returns the first employees in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employees, or <code>null</code> if a matching employees could not be found
	 */
	public Employees fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator);

	/**
	 * Returns the last employees in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employees
	 * @throws NoSuchEmployeesException if a matching employees could not be found
	 */
	public Employees findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Employees>
				orderByComparator)
		throws NoSuchEmployeesException;

	/**
	 * Returns the last employees in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employees, or <code>null</code> if a matching employees could not be found
	 */
	public Employees fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator);

	/**
	 * Returns the employeeses before and after the current employees in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param employeeId the primary key of the current employees
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employees
	 * @throws NoSuchEmployeesException if a employees with the primary key could not be found
	 */
	public Employees[] findByUuid_C_PrevAndNext(
			long employeeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Employees>
				orderByComparator)
		throws NoSuchEmployeesException;

	/**
	 * Removes all the employeeses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of employeeses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching employeeses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the employees in the entity cache if it is enabled.
	 *
	 * @param employees the employees
	 */
	public void cacheResult(Employees employees);

	/**
	 * Caches the employeeses in the entity cache if it is enabled.
	 *
	 * @param employeeses the employeeses
	 */
	public void cacheResult(java.util.List<Employees> employeeses);

	/**
	 * Creates a new employees with the primary key. Does not add the employees to the database.
	 *
	 * @param employeeId the primary key for the new employees
	 * @return the new employees
	 */
	public Employees create(long employeeId);

	/**
	 * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the employees
	 * @return the employees that was removed
	 * @throws NoSuchEmployeesException if a employees with the primary key could not be found
	 */
	public Employees remove(long employeeId) throws NoSuchEmployeesException;

	public Employees updateImpl(Employees employees);

	/**
	 * Returns the employees with the primary key or throws a <code>NoSuchEmployeesException</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employees
	 * @return the employees
	 * @throws NoSuchEmployeesException if a employees with the primary key could not be found
	 */
	public Employees findByPrimaryKey(long employeeId)
		throws NoSuchEmployeesException;

	/**
	 * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employees
	 * @return the employees, or <code>null</code> if a employees with the primary key could not be found
	 */
	public Employees fetchByPrimaryKey(long employeeId);

	/**
	 * Returns all the employeeses.
	 *
	 * @return the employeeses
	 */
	public java.util.List<Employees> findAll();

	/**
	 * Returns a range of all the employeeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @return the range of employeeses
	 */
	public java.util.List<Employees> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the employeeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employeeses
	 */
	public java.util.List<Employees> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator);

	/**
	 * Returns an ordered range of all the employeeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employeeses
	 * @param end the upper bound of the range of employeeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of employeeses
	 */
	public java.util.List<Employees> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employees>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the employeeses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of employeeses.
	 *
	 * @return the number of employeeses
	 */
	public int countAll();

}