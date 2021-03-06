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

package org.tvd.thptty.service;

/**
 * <p>
 * This class is a wrapper for {@link SemesterService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       SemesterService
 * @generated
 */
public class SemesterServiceWrapper implements SemesterService {
	public SemesterServiceWrapper(SemesterService semesterService) {
		_semesterService = semesterService;
	}

	public org.tvd.thptty.model.Semester addSemster(
		org.tvd.thptty.model.Semester semester)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _semesterService.addSemster(semester);
	}

	public SemesterService getWrappedSemesterService() {
		return _semesterService;
	}

	private SemesterService _semesterService;
}