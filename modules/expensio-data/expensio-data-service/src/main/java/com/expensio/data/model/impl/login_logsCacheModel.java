/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.data.model.impl;

import com.expensio.data.model.login_logs;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing login_logs in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class login_logsCacheModel
	implements CacheModel<login_logs>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof login_logsCacheModel)) {
			return false;
		}

		login_logsCacheModel login_logsCacheModel =
			(login_logsCacheModel)object;

		if (loginLogId == login_logsCacheModel.loginLogId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, loginLogId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", loginLogId=");
		sb.append(loginLogId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", email=");
		sb.append(email);
		sb.append(", ipAddress=");
		sb.append(ipAddress);
		sb.append(", uri=");
		sb.append(uri);
		sb.append(", host=");
		sb.append(host);
		sb.append(", loginDateTime=");
		sb.append(loginDateTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public login_logs toEntityModel() {
		login_logsImpl login_logsImpl = new login_logsImpl();

		if (uuid == null) {
			login_logsImpl.setUuid("");
		}
		else {
			login_logsImpl.setUuid(uuid);
		}

		login_logsImpl.setLoginLogId(loginLogId);

		if (userName == null) {
			login_logsImpl.setUserName("");
		}
		else {
			login_logsImpl.setUserName(userName);
		}

		if (email == null) {
			login_logsImpl.setEmail("");
		}
		else {
			login_logsImpl.setEmail(email);
		}

		if (ipAddress == null) {
			login_logsImpl.setIpAddress("");
		}
		else {
			login_logsImpl.setIpAddress(ipAddress);
		}

		if (uri == null) {
			login_logsImpl.setUri("");
		}
		else {
			login_logsImpl.setUri(uri);
		}

		if (host == null) {
			login_logsImpl.setHost("");
		}
		else {
			login_logsImpl.setHost(host);
		}

		if (loginDateTime == Long.MIN_VALUE) {
			login_logsImpl.setLoginDateTime(null);
		}
		else {
			login_logsImpl.setLoginDateTime(new Date(loginDateTime));
		}

		login_logsImpl.resetOriginalValues();

		return login_logsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		loginLogId = objectInput.readLong();
		userName = objectInput.readUTF();
		email = objectInput.readUTF();
		ipAddress = objectInput.readUTF();
		uri = objectInput.readUTF();
		host = objectInput.readUTF();
		loginDateTime = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(loginLogId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (ipAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ipAddress);
		}

		if (uri == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uri);
		}

		if (host == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(host);
		}

		objectOutput.writeLong(loginDateTime);
	}

	public String uuid;
	public long loginLogId;
	public String userName;
	public String email;
	public String ipAddress;
	public String uri;
	public String host;
	public long loginDateTime;

}