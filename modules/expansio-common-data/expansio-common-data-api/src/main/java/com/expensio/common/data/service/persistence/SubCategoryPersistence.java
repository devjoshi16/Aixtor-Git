/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence;

import com.expensio.common.data.exception.NoSuchSubCategoryException;
import com.expensio.common.data.model.SubCategory;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sub category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubCategoryUtil
 * @generated
 */
@ProviderType
public interface SubCategoryPersistence extends BasePersistence<SubCategory> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SubCategoryUtil} to access the sub category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sub categories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid(String uuid);

	/**
	 * Returns a range of all the sub categories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @return the range of matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the sub categories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sub categories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sub category in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub category
	 * @throws NoSuchSubCategoryException if a matching sub category could not be found
	 */
	public SubCategory findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
				orderByComparator)
		throws NoSuchSubCategoryException;

	/**
	 * Returns the first sub category in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub category, or <code>null</code> if a matching sub category could not be found
	 */
	public SubCategory fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator);

	/**
	 * Returns the last sub category in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub category
	 * @throws NoSuchSubCategoryException if a matching sub category could not be found
	 */
	public SubCategory findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
				orderByComparator)
		throws NoSuchSubCategoryException;

	/**
	 * Returns the last sub category in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub category, or <code>null</code> if a matching sub category could not be found
	 */
	public SubCategory fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator);

	/**
	 * Returns the sub categories before and after the current sub category in the ordered set where uuid = &#63;.
	 *
	 * @param subCategoryId the primary key of the current sub category
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sub category
	 * @throws NoSuchSubCategoryException if a sub category with the primary key could not be found
	 */
	public SubCategory[] findByUuid_PrevAndNext(
			long subCategoryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
				orderByComparator)
		throws NoSuchSubCategoryException;

	/**
	 * Removes all the sub categories where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sub categories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sub categories
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the sub categories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the sub categories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @return the range of matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the sub categories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sub categories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sub categories
	 */
	public java.util.List<SubCategory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sub category in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub category
	 * @throws NoSuchSubCategoryException if a matching sub category could not be found
	 */
	public SubCategory findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
				orderByComparator)
		throws NoSuchSubCategoryException;

	/**
	 * Returns the first sub category in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sub category, or <code>null</code> if a matching sub category could not be found
	 */
	public SubCategory fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator);

	/**
	 * Returns the last sub category in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub category
	 * @throws NoSuchSubCategoryException if a matching sub category could not be found
	 */
	public SubCategory findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
				orderByComparator)
		throws NoSuchSubCategoryException;

	/**
	 * Returns the last sub category in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sub category, or <code>null</code> if a matching sub category could not be found
	 */
	public SubCategory fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator);

	/**
	 * Returns the sub categories before and after the current sub category in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param subCategoryId the primary key of the current sub category
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sub category
	 * @throws NoSuchSubCategoryException if a sub category with the primary key could not be found
	 */
	public SubCategory[] findByUuid_C_PrevAndNext(
			long subCategoryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
				orderByComparator)
		throws NoSuchSubCategoryException;

	/**
	 * Removes all the sub categories where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sub categories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sub categories
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the sub category in the entity cache if it is enabled.
	 *
	 * @param subCategory the sub category
	 */
	public void cacheResult(SubCategory subCategory);

	/**
	 * Caches the sub categories in the entity cache if it is enabled.
	 *
	 * @param subCategories the sub categories
	 */
	public void cacheResult(java.util.List<SubCategory> subCategories);

	/**
	 * Creates a new sub category with the primary key. Does not add the sub category to the database.
	 *
	 * @param subCategoryId the primary key for the new sub category
	 * @return the new sub category
	 */
	public SubCategory create(long subCategoryId);

	/**
	 * Removes the sub category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subCategoryId the primary key of the sub category
	 * @return the sub category that was removed
	 * @throws NoSuchSubCategoryException if a sub category with the primary key could not be found
	 */
	public SubCategory remove(long subCategoryId)
		throws NoSuchSubCategoryException;

	public SubCategory updateImpl(SubCategory subCategory);

	/**
	 * Returns the sub category with the primary key or throws a <code>NoSuchSubCategoryException</code> if it could not be found.
	 *
	 * @param subCategoryId the primary key of the sub category
	 * @return the sub category
	 * @throws NoSuchSubCategoryException if a sub category with the primary key could not be found
	 */
	public SubCategory findByPrimaryKey(long subCategoryId)
		throws NoSuchSubCategoryException;

	/**
	 * Returns the sub category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subCategoryId the primary key of the sub category
	 * @return the sub category, or <code>null</code> if a sub category with the primary key could not be found
	 */
	public SubCategory fetchByPrimaryKey(long subCategoryId);

	/**
	 * Returns all the sub categories.
	 *
	 * @return the sub categories
	 */
	public java.util.List<SubCategory> findAll();

	/**
	 * Returns a range of all the sub categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @return the range of sub categories
	 */
	public java.util.List<SubCategory> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sub categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sub categories
	 */
	public java.util.List<SubCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sub categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sub categories
	 */
	public java.util.List<SubCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubCategory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sub categories from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sub categories.
	 *
	 * @return the number of sub categories
	 */
	public int countAll();

}