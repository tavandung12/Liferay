/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.tvd.thptty.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.tvd.thptty.model.TYSubjectUserRole;
import org.tvd.thptty.model.TYSubjectUserRoleModel;
import org.tvd.thptty.service.persistence.TYSubjectUserRolePK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the TYSubjectUserRole service. Represents a row in the &quot;TY_TYSubjectUserRole&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.tvd.thptty.model.TYSubjectUserRoleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TYSubjectUserRoleImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a t y subject user role model instance should use the {@link org.tvd.thptty.model.TYSubjectUserRole} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectUserRoleImpl
 * @see org.tvd.thptty.model.TYSubjectUserRole
 * @see org.tvd.thptty.model.TYSubjectUserRoleModel
 * @generated
 */
public class TYSubjectUserRoleModelImpl extends BaseModelImpl<TYSubjectUserRole>
	implements TYSubjectUserRoleModel {
	public static final String TABLE_NAME = "TY_TYSubjectUserRole";
	public static final Object[][] TABLE_COLUMNS = {
			{ "courses", new Integer(Types.INTEGER) },
			{ "subjectId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "roleId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table TY_TYSubjectUserRole (courses INTEGER not null,subjectId LONG not null,userId LONG not null,roleId LONG not null,primary key (courses, subjectId, userId, roleId))";
	public static final String TABLE_SQL_DROP = "drop table TY_TYSubjectUserRole";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.tvd.thptty.model.TYSubjectUserRole"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.tvd.thptty.model.TYSubjectUserRole"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.tvd.thptty.model.TYSubjectUserRole"));

	public TYSubjectUserRoleModelImpl() {
	}

	public TYSubjectUserRolePK getPrimaryKey() {
		return new TYSubjectUserRolePK(_courses, _subjectId, _userId, _roleId);
	}

	public void setPrimaryKey(TYSubjectUserRolePK pk) {
		setCourses(pk.courses);
		setSubjectId(pk.subjectId);
		setUserId(pk.userId);
		setRoleId(pk.roleId);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYSubjectUserRolePK(_courses, _subjectId, _userId, _roleId);
	}

	public int getCourses() {
		return _courses;
	}

	public void setCourses(int courses) {
		if (!_setOriginalCourses) {
			_setOriginalCourses = true;

			_originalCourses = _courses;
		}

		_courses = courses;
	}

	public int getOriginalCourses() {
		return _originalCourses;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		if (!_setOriginalSubjectId) {
			_setOriginalSubjectId = true;

			_originalSubjectId = _subjectId;
		}

		_subjectId = subjectId;
	}

	public long getOriginalSubjectId() {
		return _originalSubjectId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		if (!_setOriginalRoleId) {
			_setOriginalRoleId = true;

			_originalRoleId = _roleId;
		}

		_roleId = roleId;
	}

	public long getOriginalRoleId() {
		return _originalRoleId;
	}

	public TYSubjectUserRole toEscapedModel() {
		if (isEscapedModel()) {
			return (TYSubjectUserRole)this;
		}
		else {
			return (TYSubjectUserRole)Proxy.newProxyInstance(TYSubjectUserRole.class.getClassLoader(),
				new Class[] { TYSubjectUserRole.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYSubjectUserRoleImpl tySubjectUserRoleImpl = new TYSubjectUserRoleImpl();

		tySubjectUserRoleImpl.setCourses(getCourses());

		TYSubjectUserRoleModelImpl tySubjectUserRoleModelImpl = tySubjectUserRoleImpl;

		tySubjectUserRoleModelImpl._originalCourses = tySubjectUserRoleModelImpl._courses;

		tySubjectUserRoleModelImpl._setOriginalCourses = false;
		tySubjectUserRoleImpl.setSubjectId(getSubjectId());

		tySubjectUserRoleModelImpl._originalSubjectId = tySubjectUserRoleModelImpl._subjectId;

		tySubjectUserRoleModelImpl._setOriginalSubjectId = false;
		tySubjectUserRoleImpl.setUserId(getUserId());

		tySubjectUserRoleImpl.setRoleId(getRoleId());

		tySubjectUserRoleModelImpl._originalRoleId = tySubjectUserRoleModelImpl._roleId;

		tySubjectUserRoleModelImpl._setOriginalRoleId = false;

		return tySubjectUserRoleImpl;
	}

	public int compareTo(TYSubjectUserRole tySubjectUserRole) {
		TYSubjectUserRolePK pk = tySubjectUserRole.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYSubjectUserRole tySubjectUserRole = null;

		try {
			tySubjectUserRole = (TYSubjectUserRole)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYSubjectUserRolePK pk = tySubjectUserRole.getPrimaryKey();

		if (getPrimaryKey().equals(pk)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{courses=");
		sb.append(getCourses());
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYSubjectUserRole");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courses</column-name><column-value><![CDATA[");
		sb.append(getCourses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _courses;
	private int _originalCourses;
	private boolean _setOriginalCourses;
	private long _subjectId;
	private long _originalSubjectId;
	private boolean _setOriginalSubjectId;
	private long _userId;
	private String _userUuid;
	private long _roleId;
	private long _originalRoleId;
	private boolean _setOriginalRoleId;
}