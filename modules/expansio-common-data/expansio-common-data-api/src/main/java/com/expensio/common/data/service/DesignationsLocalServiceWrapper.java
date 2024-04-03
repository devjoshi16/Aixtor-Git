/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DesignationsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DesignationsLocalService
 * @generated
 */
public class DesignationsLocalServiceWrapper
	implements DesignationsLocalService,
			   ServiceWrapper<DesignationsLocalService> {

	public DesignationsLocalServiceWrapper() {
		this(null);
	}

	public DesignationsLocalServiceWrapper(
		DesignationsLocalService designationsLocalService) {

		_designationsLocalService = designationsLocalService;
	}

	/**
	 * Adds the designations to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param designations the designations
	 * @return the designations that was added
	 */
	@Override
	public com.expensio.common.data.model.Designations addDesignations(
		com.expensio.common.data.model.Designations designations) {

		return _designationsLocalService.addDesignations(designations);
	}

	/**
	 * Creates a new designations with the primary key. Does not add the designations to the database.
	 *
	 * @param designationId the primary key for the new designations
	 * @return the new designations
	 */
	@Override
	public com.expensio.common.data.model.Designations createDesignations(
		long designationId) {

		return _designationsLocalService.createDesignations(designationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the designations from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param designations the designations
	 * @return the designations that was removed
	 */
	@Override
	public com.expensio.common.data.model.Designations deleteDesignations(
		com.expensio.common.data.model.Designations designations) {

		return _designationsLocalService.deleteDesignations(designations);
	}

	/**
	 * Deletes the designations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations that was removed
	 * @throws PortalException if a designations with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Designations deleteDesignations(
			long designationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationsLocalService.deleteDesignations(designationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _designationsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _designationsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _designationsLocalService.dynamicQuery();
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

		return _designationsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.DesignationsModelImpl</code>.
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

		return _designationsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.DesignationsModelImpl</code>.
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

		return _designationsLocalService.dynamicQuery(
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

		return _designationsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _designationsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.expensio.common.data.model.Designations fetchDesignations(
		long designationId) {

		return _designationsLocalService.fetchDesignations(designationId);
	}

	/**
	 * Returns the designations with the matching UUID and company.
	 *
	 * @param uuid the designations's UUID
	 * @param companyId the primary key of the company
	 * @return the matching designations, or <code>null</code> if a matching designations could not be found
	 */
	@Override
	public com.expensio.common.data.model.Designations
		fetchDesignationsByUuidAndCompanyId(String uuid, long companyId) {

		return _designationsLocalService.fetchDesignationsByUuidAndCompanyId(
			uuid, companyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _designationsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the designations with the primary key.
	 *
	 * @param designationId the primary key of the designations
	 * @return the designations
	 * @throws PortalException if a designations with the primary key could not be found
	 */
	@Override
	public com.expensio.common.data.model.Designations getDesignations(
			long designationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationsLocalService.getDesignations(designationId);
	}

	/**
	 * Returns the designations with the matching UUID and company.
	 *
	 * @param uuid the designations's UUID
	 * @param companyId the primary key of the company
	 * @return the matching designations
	 * @throws PortalException if a matching designations could not be found
	 */
	@Override
	public com.expensio.common.data.model.Designations
			getDesignationsByUuidAndCompanyId(String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationsLocalService.getDesignationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of all the designationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.expensio.common.data.model.impl.DesignationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of designationses
	 * @param end the upper bound of the range of designationses (not inclusive)
	 * @return the range of designationses
	 */
	@Override
	public java.util.List<com.expensio.common.data.model.Designations>
		getDesignationses(int start, int end) {

		return _designationsLocalService.getDesignationses(start, end);
	}

	/**
	 * Returns the number of designationses.
	 *
	 * @return the number of designationses
	 */
	@Override
	public int getDesignationsesCount() {
		return _designationsLocalService.getDesignationsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _designationsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _designationsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _designationsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _designationsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the designations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DesignationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param designations the designations
	 * @return the designations that was updated
	 */
	@Override
	public com.expensio.common.data.model.Designations updateDesignations(
		com.expensio.common.data.model.Designations designations) {

		return _designationsLocalService.updateDesignations(designations);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _designationsLocalService.getBasePersistence();
	}

	@Override
	public DesignationsLocalService getWrappedService() {
		return _designationsLocalService;
	}

	@Override
	public void setWrappedService(
		DesignationsLocalService designationsLocalService) {

		_designationsLocalService = designationsLocalService;
	}

	private DesignationsLocalService _designationsLocalService;

}