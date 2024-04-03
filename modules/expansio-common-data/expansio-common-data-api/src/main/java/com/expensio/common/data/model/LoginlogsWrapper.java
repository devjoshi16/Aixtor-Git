/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Loginlogs}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Loginlogs
 * @generated
 */
public class LoginlogsWrapper
	extends BaseModelWrapper<Loginlogs>
	implements Loginlogs, ModelWrapper<Loginlogs> {

	public LoginlogsWrapper(Loginlogs loginlogs) {
		super(loginlogs);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("loginLogId", getLoginLogId());
		attributes.put("userName", getUserName());
		attributes.put("email", getEmail());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("uri", getUri());
		attributes.put("host", getHost());
		attributes.put("loginDateTime", getLoginDateTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long loginLogId = (Long)attributes.get("loginLogId");

		if (loginLogId != null) {
			setLoginLogId(loginLogId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		String uri = (String)attributes.get("uri");

		if (uri != null) {
			setUri(uri);
		}

		String host = (String)attributes.get("host");

		if (host != null) {
			setHost(host);
		}

		Date loginDateTime = (Date)attributes.get("loginDateTime");

		if (loginDateTime != null) {
			setLoginDateTime(loginDateTime);
		}
	}

	@Override
	public Loginlogs cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the email of this loginlogs.
	 *
	 * @return the email of this loginlogs
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the host of this loginlogs.
	 *
	 * @return the host of this loginlogs
	 */
	@Override
	public String getHost() {
		return model.getHost();
	}

	/**
	 * Returns the ip address of this loginlogs.
	 *
	 * @return the ip address of this loginlogs
	 */
	@Override
	public String getIpAddress() {
		return model.getIpAddress();
	}

	/**
	 * Returns the login date time of this loginlogs.
	 *
	 * @return the login date time of this loginlogs
	 */
	@Override
	public Date getLoginDateTime() {
		return model.getLoginDateTime();
	}

	/**
	 * Returns the login log ID of this loginlogs.
	 *
	 * @return the login log ID of this loginlogs
	 */
	@Override
	public long getLoginLogId() {
		return model.getLoginLogId();
	}

	/**
	 * Returns the primary key of this loginlogs.
	 *
	 * @return the primary key of this loginlogs
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uri of this loginlogs.
	 *
	 * @return the uri of this loginlogs
	 */
	@Override
	public String getUri() {
		return model.getUri();
	}

	/**
	 * Returns the user name of this loginlogs.
	 *
	 * @return the user name of this loginlogs
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the uuid of this loginlogs.
	 *
	 * @return the uuid of this loginlogs
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the email of this loginlogs.
	 *
	 * @param email the email of this loginlogs
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the host of this loginlogs.
	 *
	 * @param host the host of this loginlogs
	 */
	@Override
	public void setHost(String host) {
		model.setHost(host);
	}

	/**
	 * Sets the ip address of this loginlogs.
	 *
	 * @param ipAddress the ip address of this loginlogs
	 */
	@Override
	public void setIpAddress(String ipAddress) {
		model.setIpAddress(ipAddress);
	}

	/**
	 * Sets the login date time of this loginlogs.
	 *
	 * @param loginDateTime the login date time of this loginlogs
	 */
	@Override
	public void setLoginDateTime(Date loginDateTime) {
		model.setLoginDateTime(loginDateTime);
	}

	/**
	 * Sets the login log ID of this loginlogs.
	 *
	 * @param loginLogId the login log ID of this loginlogs
	 */
	@Override
	public void setLoginLogId(long loginLogId) {
		model.setLoginLogId(loginLogId);
	}

	/**
	 * Sets the primary key of this loginlogs.
	 *
	 * @param primaryKey the primary key of this loginlogs
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uri of this loginlogs.
	 *
	 * @param uri the uri of this loginlogs
	 */
	@Override
	public void setUri(String uri) {
		model.setUri(uri);
	}

	/**
	 * Sets the user name of this loginlogs.
	 *
	 * @param userName the user name of this loginlogs
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the uuid of this loginlogs.
	 *
	 * @param uuid the uuid of this loginlogs
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected LoginlogsWrapper wrap(Loginlogs loginlogs) {
		return new LoginlogsWrapper(loginlogs);
	}

}