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

package org.tvd.thptty.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import org.tvd.thptty.service.persistence.TYPrioritySubjectPK;

import java.io.Serializable;

/**
 * The base model interface for the TYPrioritySubject service. Represents a row in the &quot;TY_TYPrioritySubject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.tvd.thptty.model.impl.TYPrioritySubjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.tvd.thptty.model.impl.TYPrioritySubjectImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a t y priority subject model instance should use the {@link TYPrioritySubject} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYPrioritySubject
 * @see org.tvd.thptty.model.impl.TYPrioritySubjectImpl
 * @see org.tvd.thptty.model.impl.TYPrioritySubjectModelImpl
 * @generated
 */
public interface TYPrioritySubjectModel extends BaseModel<TYPrioritySubject> {
	/**
	 * Gets the primary key of this t y priority subject.
	 *
	 * @return the primary key of this t y priority subject
	 */
	public TYPrioritySubjectPK getPrimaryKey();

	/**
	 * Sets the primary key of this t y priority subject
	 *
	 * @param pk the primary key of this t y priority subject
	 */
	public void setPrimaryKey(TYPrioritySubjectPK pk);

	/**
	 * Gets the courses of this t y priority subject.
	 *
	 * @return the courses of this t y priority subject
	 */
	public int getCourses();

	/**
	 * Sets the courses of this t y priority subject.
	 *
	 * @param courses the courses of this t y priority subject
	 */
	public void setCourses(int courses);

	/**
	 * Gets the subject id of this t y priority subject.
	 *
	 * @return the subject id of this t y priority subject
	 */
	public long getSubjectId();

	/**
	 * Sets the subject id of this t y priority subject.
	 *
	 * @param subjectId the subject id of this t y priority subject
	 */
	public void setSubjectId(long subjectId);

	/**
	 * Gets the student id of this t y priority subject.
	 *
	 * @return the student id of this t y priority subject
	 */
	public long getStudentId();

	/**
	 * Sets the student id of this t y priority subject.
	 *
	 * @param studentId the student id of this t y priority subject
	 */
	public void setStudentId(long studentId);

	/**
	 * Gets the is special of this t y priority subject.
	 *
	 * @return the is special of this t y priority subject
	 */
	public boolean getIsSpecial();

	/**
	 * Determines if this t y priority subject is is special.
	 *
	 * @return <code>true</code> if this t y priority subject is is special; <code>false</code> otherwise
	 */
	public boolean isIsSpecial();

	/**
	 * Sets whether this {$entity.humanName} is is special.
	 *
	 * @param isSpecial the is special of this t y priority subject
	 */
	public void setIsSpecial(boolean isSpecial);

	/**
	 * Gets the extra of this t y priority subject.
	 *
	 * @return the extra of this t y priority subject
	 */
	public int getExtra();

	/**
	 * Sets the extra of this t y priority subject.
	 *
	 * @param extra the extra of this t y priority subject
	 */
	public void setExtra(int extra);

	/**
	 * Gets a copy of this t y priority subject as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public TYPrioritySubject toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(TYPrioritySubject tyPrioritySubject);

	public int hashCode();

	public String toString();

	public String toXmlString();
}