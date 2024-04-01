/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.service.persistence.impl;

import com.expensio.data.exception.NoSuchlogin_logsException;
import com.expensio.data.model.impl.login_logsImpl;
import com.expensio.data.model.impl.login_logsModelImpl;
import com.expensio.data.model.login_logs;
import com.expensio.data.model.login_logsTable;
import com.expensio.data.service.persistence.impl.constants.expensioPersistenceConstants;
import com.expensio.data.service.persistence.login_logsPersistence;
import com.expensio.data.service.persistence.login_logsUtil;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the login_logs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = login_logsPersistence.class)
public class login_logsPersistenceImpl
	extends BasePersistenceImpl<login_logs> implements login_logsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>login_logsUtil</code> to access the login_logs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		login_logsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the login_logses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching login_logses
	 */
	@Override
	public List<login_logs> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<login_logs> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<login_logs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<login_logs> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<login_logs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<login_logs> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<login_logs> list = null;

		if (useFinderCache) {
			list = (List<login_logs>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (login_logs login_logs : list) {
					if (!uuid.equals(login_logs.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_LOGIN_LOGS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(login_logsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<login_logs>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching login_logs
	 * @throws NoSuchlogin_logsException if a matching login_logs could not be found
	 */
	@Override
	public login_logs findByUuid_First(
			String uuid, OrderByComparator<login_logs> orderByComparator)
		throws NoSuchlogin_logsException {

		login_logs login_logs = fetchByUuid_First(uuid, orderByComparator);

		if (login_logs != null) {
			return login_logs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchlogin_logsException(sb.toString());
	}

	/**
	 * Returns the first login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching login_logs, or <code>null</code> if a matching login_logs could not be found
	 */
	@Override
	public login_logs fetchByUuid_First(
		String uuid, OrderByComparator<login_logs> orderByComparator) {

		List<login_logs> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching login_logs
	 * @throws NoSuchlogin_logsException if a matching login_logs could not be found
	 */
	@Override
	public login_logs findByUuid_Last(
			String uuid, OrderByComparator<login_logs> orderByComparator)
		throws NoSuchlogin_logsException {

		login_logs login_logs = fetchByUuid_Last(uuid, orderByComparator);

		if (login_logs != null) {
			return login_logs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchlogin_logsException(sb.toString());
	}

	/**
	 * Returns the last login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching login_logs, or <code>null</code> if a matching login_logs could not be found
	 */
	@Override
	public login_logs fetchByUuid_Last(
		String uuid, OrderByComparator<login_logs> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<login_logs> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the login_logses before and after the current login_logs in the ordered set where uuid = &#63;.
	 *
	 * @param loginLogId the primary key of the current login_logs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next login_logs
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	@Override
	public login_logs[] findByUuid_PrevAndNext(
			long loginLogId, String uuid,
			OrderByComparator<login_logs> orderByComparator)
		throws NoSuchlogin_logsException {

		uuid = Objects.toString(uuid, "");

		login_logs login_logs = findByPrimaryKey(loginLogId);

		Session session = null;

		try {
			session = openSession();

			login_logs[] array = new login_logsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, login_logs, uuid, orderByComparator, true);

			array[1] = login_logs;

			array[2] = getByUuid_PrevAndNext(
				session, login_logs, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected login_logs getByUuid_PrevAndNext(
		Session session, login_logs login_logs, String uuid,
		OrderByComparator<login_logs> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LOGIN_LOGS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(login_logsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(login_logs)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<login_logs> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the login_logses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (login_logs login_logs :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(login_logs);
		}
	}

	/**
	 * Returns the number of login_logses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching login_logses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LOGIN_LOGS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"login_logs.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(login_logs.uuid IS NULL OR login_logs.uuid = '')";

	public login_logsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(login_logs.class);

		setModelImplClass(login_logsImpl.class);
		setModelPKClass(long.class);

		setTable(login_logsTable.INSTANCE);
	}

	/**
	 * Caches the login_logs in the entity cache if it is enabled.
	 *
	 * @param login_logs the login_logs
	 */
	@Override
	public void cacheResult(login_logs login_logs) {
		entityCache.putResult(
			login_logsImpl.class, login_logs.getPrimaryKey(), login_logs);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the login_logses in the entity cache if it is enabled.
	 *
	 * @param login_logses the login_logses
	 */
	@Override
	public void cacheResult(List<login_logs> login_logses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (login_logses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (login_logs login_logs : login_logses) {
			if (entityCache.getResult(
					login_logsImpl.class, login_logs.getPrimaryKey()) == null) {

				cacheResult(login_logs);
			}
		}
	}

	/**
	 * Clears the cache for all login_logses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(login_logsImpl.class);

		finderCache.clearCache(login_logsImpl.class);
	}

	/**
	 * Clears the cache for the login_logs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(login_logs login_logs) {
		entityCache.removeResult(login_logsImpl.class, login_logs);
	}

	@Override
	public void clearCache(List<login_logs> login_logses) {
		for (login_logs login_logs : login_logses) {
			entityCache.removeResult(login_logsImpl.class, login_logs);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(login_logsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(login_logsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new login_logs with the primary key. Does not add the login_logs to the database.
	 *
	 * @param loginLogId the primary key for the new login_logs
	 * @return the new login_logs
	 */
	@Override
	public login_logs create(long loginLogId) {
		login_logs login_logs = new login_logsImpl();

		login_logs.setNew(true);
		login_logs.setPrimaryKey(loginLogId);

		String uuid = PortalUUIDUtil.generate();

		login_logs.setUuid(uuid);

		return login_logs;
	}

	/**
	 * Removes the login_logs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs that was removed
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	@Override
	public login_logs remove(long loginLogId) throws NoSuchlogin_logsException {
		return remove((Serializable)loginLogId);
	}

	/**
	 * Removes the login_logs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the login_logs
	 * @return the login_logs that was removed
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	@Override
	public login_logs remove(Serializable primaryKey)
		throws NoSuchlogin_logsException {

		Session session = null;

		try {
			session = openSession();

			login_logs login_logs = (login_logs)session.get(
				login_logsImpl.class, primaryKey);

			if (login_logs == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlogin_logsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(login_logs);
		}
		catch (NoSuchlogin_logsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected login_logs removeImpl(login_logs login_logs) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(login_logs)) {
				login_logs = (login_logs)session.get(
					login_logsImpl.class, login_logs.getPrimaryKeyObj());
			}

			if (login_logs != null) {
				session.delete(login_logs);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (login_logs != null) {
			clearCache(login_logs);
		}

		return login_logs;
	}

	@Override
	public login_logs updateImpl(login_logs login_logs) {
		boolean isNew = login_logs.isNew();

		if (!(login_logs instanceof login_logsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(login_logs.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(login_logs);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in login_logs proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom login_logs implementation " +
					login_logs.getClass());
		}

		login_logsModelImpl login_logsModelImpl =
			(login_logsModelImpl)login_logs;

		if (Validator.isNull(login_logs.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			login_logs.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(login_logs);
			}
			else {
				login_logs = (login_logs)session.merge(login_logs);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			login_logsImpl.class, login_logsModelImpl, false, true);

		if (isNew) {
			login_logs.setNew(false);
		}

		login_logs.resetOriginalValues();

		return login_logs;
	}

	/**
	 * Returns the login_logs with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the login_logs
	 * @return the login_logs
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	@Override
	public login_logs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlogin_logsException {

		login_logs login_logs = fetchByPrimaryKey(primaryKey);

		if (login_logs == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlogin_logsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return login_logs;
	}

	/**
	 * Returns the login_logs with the primary key or throws a <code>NoSuchlogin_logsException</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs
	 * @throws NoSuchlogin_logsException if a login_logs with the primary key could not be found
	 */
	@Override
	public login_logs findByPrimaryKey(long loginLogId)
		throws NoSuchlogin_logsException {

		return findByPrimaryKey((Serializable)loginLogId);
	}

	/**
	 * Returns the login_logs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the login_logs
	 * @return the login_logs, or <code>null</code> if a login_logs with the primary key could not be found
	 */
	@Override
	public login_logs fetchByPrimaryKey(long loginLogId) {
		return fetchByPrimaryKey((Serializable)loginLogId);
	}

	/**
	 * Returns all the login_logses.
	 *
	 * @return the login_logses
	 */
	@Override
	public List<login_logs> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<login_logs> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<login_logs> findAll(
		int start, int end, OrderByComparator<login_logs> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<login_logs> findAll(
		int start, int end, OrderByComparator<login_logs> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<login_logs> list = null;

		if (useFinderCache) {
			list = (List<login_logs>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LOGIN_LOGS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LOGIN_LOGS;

				sql = sql.concat(login_logsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<login_logs>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the login_logses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (login_logs login_logs : findAll()) {
			remove(login_logs);
		}
	}

	/**
	 * Returns the number of login_logses.
	 *
	 * @return the number of login_logses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LOGIN_LOGS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "loginLogId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LOGIN_LOGS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return login_logsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the login_logs persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		login_logsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		login_logsUtil.setPersistence(null);

		entityCache.removeCache(login_logsImpl.class.getName());
	}

	@Override
	@Reference(
		target = expensioPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = expensioPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = expensioPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LOGIN_LOGS =
		"SELECT login_logs FROM login_logs login_logs";

	private static final String _SQL_SELECT_LOGIN_LOGS_WHERE =
		"SELECT login_logs FROM login_logs login_logs WHERE ";

	private static final String _SQL_COUNT_LOGIN_LOGS =
		"SELECT COUNT(login_logs) FROM login_logs login_logs";

	private static final String _SQL_COUNT_LOGIN_LOGS_WHERE =
		"SELECT COUNT(login_logs) FROM login_logs login_logs WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "login_logs.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No login_logs exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No login_logs exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		login_logsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}