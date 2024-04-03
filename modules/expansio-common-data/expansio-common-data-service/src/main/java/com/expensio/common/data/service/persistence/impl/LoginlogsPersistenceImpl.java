/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.service.persistence.impl;

import com.expensio.common.data.exception.NoSuchLoginlogsException;
import com.expensio.common.data.model.Loginlogs;
import com.expensio.common.data.model.LoginlogsTable;
import com.expensio.common.data.model.impl.LoginlogsImpl;
import com.expensio.common.data.model.impl.LoginlogsModelImpl;
import com.expensio.common.data.service.persistence.LoginlogsPersistence;
import com.expensio.common.data.service.persistence.LoginlogsUtil;
import com.expensio.common.data.service.persistence.impl.constants.expensioPersistenceConstants;

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
 * The persistence implementation for the loginlogs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = LoginlogsPersistence.class)
public class LoginlogsPersistenceImpl
	extends BasePersistenceImpl<Loginlogs> implements LoginlogsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LoginlogsUtil</code> to access the loginlogs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LoginlogsImpl.class.getName();

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
	 * Returns all the loginlogses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching loginlogses
	 */
	@Override
	public List<Loginlogs> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Loginlogs> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Loginlogs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Loginlogs> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Loginlogs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Loginlogs> orderByComparator,
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

		List<Loginlogs> list = null;

		if (useFinderCache) {
			list = (List<Loginlogs>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Loginlogs loginlogs : list) {
					if (!uuid.equals(loginlogs.getUuid())) {
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

			sb.append(_SQL_SELECT_LOGINLOGS_WHERE);

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
				sb.append(LoginlogsModelImpl.ORDER_BY_JPQL);
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

				list = (List<Loginlogs>)QueryUtil.list(
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
	 * Returns the first loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loginlogs
	 * @throws NoSuchLoginlogsException if a matching loginlogs could not be found
	 */
	@Override
	public Loginlogs findByUuid_First(
			String uuid, OrderByComparator<Loginlogs> orderByComparator)
		throws NoSuchLoginlogsException {

		Loginlogs loginlogs = fetchByUuid_First(uuid, orderByComparator);

		if (loginlogs != null) {
			return loginlogs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchLoginlogsException(sb.toString());
	}

	/**
	 * Returns the first loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loginlogs, or <code>null</code> if a matching loginlogs could not be found
	 */
	@Override
	public Loginlogs fetchByUuid_First(
		String uuid, OrderByComparator<Loginlogs> orderByComparator) {

		List<Loginlogs> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loginlogs
	 * @throws NoSuchLoginlogsException if a matching loginlogs could not be found
	 */
	@Override
	public Loginlogs findByUuid_Last(
			String uuid, OrderByComparator<Loginlogs> orderByComparator)
		throws NoSuchLoginlogsException {

		Loginlogs loginlogs = fetchByUuid_Last(uuid, orderByComparator);

		if (loginlogs != null) {
			return loginlogs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchLoginlogsException(sb.toString());
	}

	/**
	 * Returns the last loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loginlogs, or <code>null</code> if a matching loginlogs could not be found
	 */
	@Override
	public Loginlogs fetchByUuid_Last(
		String uuid, OrderByComparator<Loginlogs> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Loginlogs> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the loginlogses before and after the current loginlogs in the ordered set where uuid = &#63;.
	 *
	 * @param loginLogId the primary key of the current loginlogs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loginlogs
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	@Override
	public Loginlogs[] findByUuid_PrevAndNext(
			long loginLogId, String uuid,
			OrderByComparator<Loginlogs> orderByComparator)
		throws NoSuchLoginlogsException {

		uuid = Objects.toString(uuid, "");

		Loginlogs loginlogs = findByPrimaryKey(loginLogId);

		Session session = null;

		try {
			session = openSession();

			Loginlogs[] array = new LoginlogsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, loginlogs, uuid, orderByComparator, true);

			array[1] = loginlogs;

			array[2] = getByUuid_PrevAndNext(
				session, loginlogs, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Loginlogs getByUuid_PrevAndNext(
		Session session, Loginlogs loginlogs, String uuid,
		OrderByComparator<Loginlogs> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LOGINLOGS_WHERE);

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
			sb.append(LoginlogsModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(loginlogs)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Loginlogs> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the loginlogses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Loginlogs loginlogs :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(loginlogs);
		}
	}

	/**
	 * Returns the number of loginlogses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching loginlogses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LOGINLOGS_WHERE);

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
		"loginlogs.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(loginlogs.uuid IS NULL OR loginlogs.uuid = '')";

	public LoginlogsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Loginlogs.class);

		setModelImplClass(LoginlogsImpl.class);
		setModelPKClass(long.class);

		setTable(LoginlogsTable.INSTANCE);
	}

	/**
	 * Caches the loginlogs in the entity cache if it is enabled.
	 *
	 * @param loginlogs the loginlogs
	 */
	@Override
	public void cacheResult(Loginlogs loginlogs) {
		entityCache.putResult(
			LoginlogsImpl.class, loginlogs.getPrimaryKey(), loginlogs);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the loginlogses in the entity cache if it is enabled.
	 *
	 * @param loginlogses the loginlogses
	 */
	@Override
	public void cacheResult(List<Loginlogs> loginlogses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (loginlogses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Loginlogs loginlogs : loginlogses) {
			if (entityCache.getResult(
					LoginlogsImpl.class, loginlogs.getPrimaryKey()) == null) {

				cacheResult(loginlogs);
			}
		}
	}

	/**
	 * Clears the cache for all loginlogses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LoginlogsImpl.class);

		finderCache.clearCache(LoginlogsImpl.class);
	}

	/**
	 * Clears the cache for the loginlogs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Loginlogs loginlogs) {
		entityCache.removeResult(LoginlogsImpl.class, loginlogs);
	}

	@Override
	public void clearCache(List<Loginlogs> loginlogses) {
		for (Loginlogs loginlogs : loginlogses) {
			entityCache.removeResult(LoginlogsImpl.class, loginlogs);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(LoginlogsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(LoginlogsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new loginlogs with the primary key. Does not add the loginlogs to the database.
	 *
	 * @param loginLogId the primary key for the new loginlogs
	 * @return the new loginlogs
	 */
	@Override
	public Loginlogs create(long loginLogId) {
		Loginlogs loginlogs = new LoginlogsImpl();

		loginlogs.setNew(true);
		loginlogs.setPrimaryKey(loginLogId);

		String uuid = PortalUUIDUtil.generate();

		loginlogs.setUuid(uuid);

		return loginlogs;
	}

	/**
	 * Removes the loginlogs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs that was removed
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	@Override
	public Loginlogs remove(long loginLogId) throws NoSuchLoginlogsException {
		return remove((Serializable)loginLogId);
	}

	/**
	 * Removes the loginlogs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loginlogs
	 * @return the loginlogs that was removed
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	@Override
	public Loginlogs remove(Serializable primaryKey)
		throws NoSuchLoginlogsException {

		Session session = null;

		try {
			session = openSession();

			Loginlogs loginlogs = (Loginlogs)session.get(
				LoginlogsImpl.class, primaryKey);

			if (loginlogs == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLoginlogsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(loginlogs);
		}
		catch (NoSuchLoginlogsException noSuchEntityException) {
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
	protected Loginlogs removeImpl(Loginlogs loginlogs) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(loginlogs)) {
				loginlogs = (Loginlogs)session.get(
					LoginlogsImpl.class, loginlogs.getPrimaryKeyObj());
			}

			if (loginlogs != null) {
				session.delete(loginlogs);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (loginlogs != null) {
			clearCache(loginlogs);
		}

		return loginlogs;
	}

	@Override
	public Loginlogs updateImpl(Loginlogs loginlogs) {
		boolean isNew = loginlogs.isNew();

		if (!(loginlogs instanceof LoginlogsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(loginlogs.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(loginlogs);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in loginlogs proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Loginlogs implementation " +
					loginlogs.getClass());
		}

		LoginlogsModelImpl loginlogsModelImpl = (LoginlogsModelImpl)loginlogs;

		if (Validator.isNull(loginlogs.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			loginlogs.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(loginlogs);
			}
			else {
				loginlogs = (Loginlogs)session.merge(loginlogs);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			LoginlogsImpl.class, loginlogsModelImpl, false, true);

		if (isNew) {
			loginlogs.setNew(false);
		}

		loginlogs.resetOriginalValues();

		return loginlogs;
	}

	/**
	 * Returns the loginlogs with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loginlogs
	 * @return the loginlogs
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	@Override
	public Loginlogs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLoginlogsException {

		Loginlogs loginlogs = fetchByPrimaryKey(primaryKey);

		if (loginlogs == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLoginlogsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return loginlogs;
	}

	/**
	 * Returns the loginlogs with the primary key or throws a <code>NoSuchLoginlogsException</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs
	 * @throws NoSuchLoginlogsException if a loginlogs with the primary key could not be found
	 */
	@Override
	public Loginlogs findByPrimaryKey(long loginLogId)
		throws NoSuchLoginlogsException {

		return findByPrimaryKey((Serializable)loginLogId);
	}

	/**
	 * Returns the loginlogs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loginLogId the primary key of the loginlogs
	 * @return the loginlogs, or <code>null</code> if a loginlogs with the primary key could not be found
	 */
	@Override
	public Loginlogs fetchByPrimaryKey(long loginLogId) {
		return fetchByPrimaryKey((Serializable)loginLogId);
	}

	/**
	 * Returns all the loginlogses.
	 *
	 * @return the loginlogses
	 */
	@Override
	public List<Loginlogs> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Loginlogs> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Loginlogs> findAll(
		int start, int end, OrderByComparator<Loginlogs> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Loginlogs> findAll(
		int start, int end, OrderByComparator<Loginlogs> orderByComparator,
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

		List<Loginlogs> list = null;

		if (useFinderCache) {
			list = (List<Loginlogs>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LOGINLOGS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LOGINLOGS;

				sql = sql.concat(LoginlogsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Loginlogs>)QueryUtil.list(
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
	 * Removes all the loginlogses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Loginlogs loginlogs : findAll()) {
			remove(loginlogs);
		}
	}

	/**
	 * Returns the number of loginlogses.
	 *
	 * @return the number of loginlogses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LOGINLOGS);

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
		return _SQL_SELECT_LOGINLOGS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LoginlogsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the loginlogs persistence.
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

		LoginlogsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		LoginlogsUtil.setPersistence(null);

		entityCache.removeCache(LoginlogsImpl.class.getName());
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

	private static final String _SQL_SELECT_LOGINLOGS =
		"SELECT loginlogs FROM Loginlogs loginlogs";

	private static final String _SQL_SELECT_LOGINLOGS_WHERE =
		"SELECT loginlogs FROM Loginlogs loginlogs WHERE ";

	private static final String _SQL_COUNT_LOGINLOGS =
		"SELECT COUNT(loginlogs) FROM Loginlogs loginlogs";

	private static final String _SQL_COUNT_LOGINLOGS_WHERE =
		"SELECT COUNT(loginlogs) FROM Loginlogs loginlogs WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "loginlogs.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Loginlogs exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Loginlogs exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LoginlogsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}