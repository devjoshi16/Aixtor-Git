/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.expensio.common.data.model.impl;

import com.expensio.common.data.model.Loginlogs;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Loginlogs in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LoginlogsCacheModel
	implements CacheModel<Loginlogs>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LoginlogsCacheModel)) {
			return false;
		}

		LoginlogsCacheModel loginlogsCacheModel = (LoginlogsCacheModel)object;

		if (loginLogId == loginlogsCacheModel.loginLogId) {
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
	public Loginlogs toEntityModel() {
		LoginlogsImpl loginlogsImpl = new LoginlogsImpl();

		if (uuid == null) {
			loginlogsImpl.setUuid("");
		}
		else {
			loginlogsImpl.setUuid(uuid);
		}

		loginlogsImpl.setLoginLogId(loginLogId);

		if (userName == null) {
			loginlogsImpl.setUserName("");
		}
		else {
			loginlogsImpl.setUserName(userName);
		}

		if (email == null) {
			loginlogsImpl.setEmail("");
		}
		else {
			loginlogsImpl.setEmail(email);
		}

		if (ipAddress == null) {
			loginlogsImpl.setIpAddress("");
		}
		else {
			loginlogsImpl.setIpAddress(ipAddress);
		}

		if (uri == null) {
			loginlogsImpl.setUri("");
		}
		else {
			loginlogsImpl.setUri(uri);
		}

		if (host == null) {
			loginlogsImpl.setHost("");
		}
		else {
			loginlogsImpl.setHost(host);
		}

		if (loginDateTime == Long.MIN_VALUE) {
			loginlogsImpl.setLoginDateTime(null);
		}
		else {
			loginlogsImpl.setLoginDateTime(new Date(loginDateTime));
		}

		loginlogsImpl.resetOriginalValues();

		return loginlogsImpl;
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