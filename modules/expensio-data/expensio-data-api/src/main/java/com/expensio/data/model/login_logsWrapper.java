/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link login_logs}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see login_logs
 * @generated
 */
public class login_logsWrapper
	extends BaseModelWrapper<login_logs>
	implements login_logs, ModelWrapper<login_logs> {

	public login_logsWrapper(login_logs login_logs) {
		super(login_logs);
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
	public login_logs cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the email of this login_logs.
	 *
	 * @return the email of this login_logs
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the host of this login_logs.
	 *
	 * @return the host of this login_logs
	 */
	@Override
	public String getHost() {
		return model.getHost();
	}

	/**
	 * Returns the ip address of this login_logs.
	 *
	 * @return the ip address of this login_logs
	 */
	@Override
	public String getIpAddress() {
		return model.getIpAddress();
	}

	/**
	 * Returns the login date time of this login_logs.
	 *
	 * @return the login date time of this login_logs
	 */
	@Override
	public Date getLoginDateTime() {
		return model.getLoginDateTime();
	}

	/**
	 * Returns the login log ID of this login_logs.
	 *
	 * @return the login log ID of this login_logs
	 */
	@Override
	public long getLoginLogId() {
		return model.getLoginLogId();
	}

	/**
	 * Returns the primary key of this login_logs.
	 *
	 * @return the primary key of this login_logs
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uri of this login_logs.
	 *
	 * @return the uri of this login_logs
	 */
	@Override
	public String getUri() {
		return model.getUri();
	}

	/**
	 * Returns the user name of this login_logs.
	 *
	 * @return the user name of this login_logs
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the uuid of this login_logs.
	 *
	 * @return the uuid of this login_logs
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
	 * Sets the email of this login_logs.
	 *
	 * @param email the email of this login_logs
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the host of this login_logs.
	 *
	 * @param host the host of this login_logs
	 */
	@Override
	public void setHost(String host) {
		model.setHost(host);
	}

	/**
	 * Sets the ip address of this login_logs.
	 *
	 * @param ipAddress the ip address of this login_logs
	 */
	@Override
	public void setIpAddress(String ipAddress) {
		model.setIpAddress(ipAddress);
	}

	/**
	 * Sets the login date time of this login_logs.
	 *
	 * @param loginDateTime the login date time of this login_logs
	 */
	@Override
	public void setLoginDateTime(Date loginDateTime) {
		model.setLoginDateTime(loginDateTime);
	}

	/**
	 * Sets the login log ID of this login_logs.
	 *
	 * @param loginLogId the login log ID of this login_logs
	 */
	@Override
	public void setLoginLogId(long loginLogId) {
		model.setLoginLogId(loginLogId);
	}

	/**
	 * Sets the primary key of this login_logs.
	 *
	 * @param primaryKey the primary key of this login_logs
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uri of this login_logs.
	 *
	 * @param uri the uri of this login_logs
	 */
	@Override
	public void setUri(String uri) {
		model.setUri(uri);
	}

	/**
	 * Sets the user name of this login_logs.
	 *
	 * @param userName the user name of this login_logs
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the uuid of this login_logs.
	 *
	 * @param uuid the uuid of this login_logs
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
	protected login_logsWrapper wrap(login_logs login_logs) {
		return new login_logsWrapper(login_logs);
	}

}