/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SubCategoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubCategoryLocalService
 * @generated
 */
public class SubCategoryLocalServiceWrapper
	implements ServiceWrapper<SubCategoryLocalService>,
			   SubCategoryLocalService {

	public SubCategoryLocalServiceWrapper() {
		this(null);
	}

	public SubCategoryLocalServiceWrapper(
		SubCategoryLocalService subCategoryLocalService) {

		_subCategoryLocalService = subCategoryLocalService;
	}

	/**
	 * Adds the sub category to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subCategory the sub category
	 * @return the sub category that was added
	 */
	@Override
	public com.expensio.common.data.model.SubCategory addSubCategory(
		com.expensio.common.data.model.SubCategory subCategory) {

		return _subCategoryLocalService.addSubCategory(subCategory);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subCategoryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sub category with the primary key. Does not add the sub category to the database.
	 *
	 * @param subCategoryId the primary key for the new sub category
	 * @return the new sub category
	 */
	@Override
	public com.expensio.common.data.model.SubCategory createSubCategory(
		long subCategoryId) {

		return _subCategoryLocalService.createSubCategory(subCategoryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subCategoryLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sub category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subCategoryId the primary key of the sub category
	 * @return the sub category that was removed
	 * @throws PortalException if a sub category with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.SubCategory deleteSubCategory(
			long subCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subCategoryLocalService.deleteSubCategory(subCategoryId);
	}

	/**
	 * Deletes the sub category from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subCategory the sub category
	 * @return the sub category that was removed
	 */
	@Override
	public com.expensio.common.data.model.SubCategory deleteSubCategory(
		com.expensio.common.data.model.SubCategory subCategory) {

		return _subCategoryLocalService.deleteSubCategory(subCategory);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _subCategoryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _subCategoryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subCategoryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _subCategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _subCategoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _subCategoryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _subCategoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _subCategoryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.expensio.common.data.model.SubCategory fetchSubCategory(
		long subCategoryId) {

		return _subCategoryLocalService.fetchSubCategory(subCategoryId);
	}

	/**
	 * Returns the sub category with the matching UUID and company.
	 *
	 * @param uuid the sub category's UUID
	 * @param companyId the primary key of the company
	 * @return the matching sub category, or <code>null</code> if a matching sub category could not be found
	 */
	@Override
	public com.expensio.common.data.model.SubCategory
		fetchSubCategoryByUuidAndCompanyId(String uuid, long companyId) {

		return _subCategoryLocalService.fetchSubCategoryByUuidAndCompanyId(
			uuid, companyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _subCategoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _subCategoryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _subCategoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _subCategoryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subCategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the sub categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.SubCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sub categories
	 * @param end the upper bound of the range of sub categories (not inclusive)
	 * @return the range of sub categories
	 */
	@Override
	public java.util.List<com.expensio.common.data.model.SubCategory>
		getSubCategories(int start, int end) {

		return _subCategoryLocalService.getSubCategories(start, end);
	}

	/**
	 * Returns the number of sub categories.
	 *
	 * @return the number of sub categories
	 */
	@Override
	public int getSubCategoriesCount() {
		return _subCategoryLocalService.getSubCategoriesCount();
	}

	/**
	 * Returns the sub category with the primary key.
	 *
	 * @param subCategoryId the primary key of the sub category
	 * @return the sub category
	 * @throws PortalException if a sub category with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.SubCategory getSubCategory(
			long subCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subCategoryLocalService.getSubCategory(subCategoryId);
	}

	/**
	 * Returns the sub category with the matching UUID and company.
	 *
	 * @param uuid the sub category's UUID
	 * @param companyId the primary key of the company
	 * @return the matching sub category
	 * @throws PortalException if a matching sub category could not be found
	 */
	@Override
	public com.expensio.common.data.model.SubCategory
			getSubCategoryByUuidAndCompanyId(String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subCategoryLocalService.getSubCategoryByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Updates the sub category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subCategory the sub category
	 * @return the sub category that was updated
	 */
	@Override
	public com.expensio.common.data.model.SubCategory updateSubCategory(
		com.expensio.common.data.model.SubCategory subCategory) {

		return _subCategoryLocalService.updateSubCategory(subCategory);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _subCategoryLocalService.getBasePersistence();
	}

	@Override
	public SubCategoryLocalService getWrappedService() {
		return _subCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		SubCategoryLocalService subCategoryLocalService) {

		_subCategoryLocalService = subCategoryLocalService;
	}

	private SubCategoryLocalService _subCategoryLocalService;

}