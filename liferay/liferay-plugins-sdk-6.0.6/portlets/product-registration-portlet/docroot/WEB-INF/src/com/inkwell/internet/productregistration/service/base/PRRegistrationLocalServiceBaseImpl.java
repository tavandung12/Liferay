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

package com.inkwell.internet.productregistration.service.base;

import com.inkwell.internet.productregistration.model.PRRegistration;
import com.inkwell.internet.productregistration.service.PRProductLocalService;
import com.inkwell.internet.productregistration.service.PRRegistrationLocalService;
import com.inkwell.internet.productregistration.service.PRUserLocalService;
import com.inkwell.internet.productregistration.service.persistence.PRProductPersistence;
import com.inkwell.internet.productregistration.service.persistence.PRRegistrationPersistence;
import com.inkwell.internet.productregistration.service.persistence.PRUserPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.social.service.SocialActivityLocalService;
import com.liferay.portlet.social.service.persistence.SocialActivityPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the p r registration local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.inkwell.internet.productregistration.service.impl.PRRegistrationLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.inkwell.internet.productregistration.service.PRRegistrationLocalServiceUtil} to access the p r registration local service.
 * </p>
 *
 * @author Rich Sezov
 * @see com.inkwell.internet.productregistration.service.impl.PRRegistrationLocalServiceImpl
 * @see com.inkwell.internet.productregistration.service.PRRegistrationLocalServiceUtil
 * @generated
 */
public abstract class PRRegistrationLocalServiceBaseImpl
	implements PRRegistrationLocalService {
	/**
	 * Adds the p r registration to the database. Also notifies the appropriate model listeners.
	 *
	 * @param prRegistration the p r registration to add
	 * @return the p r registration that was added
	 * @throws SystemException if a system exception occurred
	 */
	public PRRegistration addPRRegistration(PRRegistration prRegistration)
		throws SystemException {
		prRegistration.setNew(true);

		return prRegistrationPersistence.update(prRegistration, false);
	}

	/**
	 * Creates a new p r registration with the primary key. Does not add the p r registration to the database.
	 *
	 * @param registrationId the primary key for the new p r registration
	 * @return the new p r registration
	 */
	public PRRegistration createPRRegistration(long registrationId) {
		return prRegistrationPersistence.create(registrationId);
	}

	/**
	 * Deletes the p r registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationId the primary key of the p r registration to delete
	 * @throws PortalException if a p r registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deletePRRegistration(long registrationId)
		throws PortalException, SystemException {
		prRegistrationPersistence.remove(registrationId);
	}

	/**
	 * Deletes the p r registration from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prRegistration the p r registration to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deletePRRegistration(PRRegistration prRegistration)
		throws SystemException {
		prRegistrationPersistence.remove(prRegistration);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return prRegistrationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return prRegistrationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return prRegistrationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return prRegistrationPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the p r registration with the primary key.
	 *
	 * @param registrationId the primary key of the p r registration to get
	 * @return the p r registration
	 * @throws PortalException if a p r registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PRRegistration getPRRegistration(long registrationId)
		throws PortalException, SystemException {
		return prRegistrationPersistence.findByPrimaryKey(registrationId);
	}

	/**
	 * Gets a range of all the p r registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of p r registrations to return
	 * @param end the upper bound of the range of p r registrations to return (not inclusive)
	 * @return the range of p r registrations
	 * @throws SystemException if a system exception occurred
	 */
	public List<PRRegistration> getPRRegistrations(int start, int end)
		throws SystemException {
		return prRegistrationPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of p r registrations.
	 *
	 * @return the number of p r registrations
	 * @throws SystemException if a system exception occurred
	 */
	public int getPRRegistrationsCount() throws SystemException {
		return prRegistrationPersistence.countAll();
	}

	/**
	 * Updates the p r registration in the database. Also notifies the appropriate model listeners.
	 *
	 * @param prRegistration the p r registration to update
	 * @return the p r registration that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public PRRegistration updatePRRegistration(PRRegistration prRegistration)
		throws SystemException {
		prRegistration.setNew(false);

		return prRegistrationPersistence.update(prRegistration, true);
	}

	/**
	 * Updates the p r registration in the database. Also notifies the appropriate model listeners.
	 *
	 * @param prRegistration the p r registration to update
	 * @param merge whether to merge the p r registration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the p r registration that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public PRRegistration updatePRRegistration(PRRegistration prRegistration,
		boolean merge) throws SystemException {
		prRegistration.setNew(false);

		return prRegistrationPersistence.update(prRegistration, merge);
	}

	/**
	 * Gets the p r product local service.
	 *
	 * @return the p r product local service
	 */
	public PRProductLocalService getPRProductLocalService() {
		return prProductLocalService;
	}

	/**
	 * Sets the p r product local service.
	 *
	 * @param prProductLocalService the p r product local service
	 */
	public void setPRProductLocalService(
		PRProductLocalService prProductLocalService) {
		this.prProductLocalService = prProductLocalService;
	}

	/**
	 * Gets the p r product persistence.
	 *
	 * @return the p r product persistence
	 */
	public PRProductPersistence getPRProductPersistence() {
		return prProductPersistence;
	}

	/**
	 * Sets the p r product persistence.
	 *
	 * @param prProductPersistence the p r product persistence
	 */
	public void setPRProductPersistence(
		PRProductPersistence prProductPersistence) {
		this.prProductPersistence = prProductPersistence;
	}

	/**
	 * Gets the p r user local service.
	 *
	 * @return the p r user local service
	 */
	public PRUserLocalService getPRUserLocalService() {
		return prUserLocalService;
	}

	/**
	 * Sets the p r user local service.
	 *
	 * @param prUserLocalService the p r user local service
	 */
	public void setPRUserLocalService(PRUserLocalService prUserLocalService) {
		this.prUserLocalService = prUserLocalService;
	}

	/**
	 * Gets the p r user persistence.
	 *
	 * @return the p r user persistence
	 */
	public PRUserPersistence getPRUserPersistence() {
		return prUserPersistence;
	}

	/**
	 * Sets the p r user persistence.
	 *
	 * @param prUserPersistence the p r user persistence
	 */
	public void setPRUserPersistence(PRUserPersistence prUserPersistence) {
		this.prUserPersistence = prUserPersistence;
	}

	/**
	 * Gets the p r registration local service.
	 *
	 * @return the p r registration local service
	 */
	public PRRegistrationLocalService getPRRegistrationLocalService() {
		return prRegistrationLocalService;
	}

	/**
	 * Sets the p r registration local service.
	 *
	 * @param prRegistrationLocalService the p r registration local service
	 */
	public void setPRRegistrationLocalService(
		PRRegistrationLocalService prRegistrationLocalService) {
		this.prRegistrationLocalService = prRegistrationLocalService;
	}

	/**
	 * Gets the p r registration persistence.
	 *
	 * @return the p r registration persistence
	 */
	public PRRegistrationPersistence getPRRegistrationPersistence() {
		return prRegistrationPersistence;
	}

	/**
	 * Sets the p r registration persistence.
	 *
	 * @param prRegistrationPersistence the p r registration persistence
	 */
	public void setPRRegistrationPersistence(
		PRRegistrationPersistence prRegistrationPersistence) {
		this.prRegistrationPersistence = prRegistrationPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Gets the social activity local service.
	 *
	 * @return the social activity local service
	 */
	public SocialActivityLocalService getSocialActivityLocalService() {
		return socialActivityLocalService;
	}

	/**
	 * Sets the social activity local service.
	 *
	 * @param socialActivityLocalService the social activity local service
	 */
	public void setSocialActivityLocalService(
		SocialActivityLocalService socialActivityLocalService) {
		this.socialActivityLocalService = socialActivityLocalService;
	}

	/**
	 * Gets the social activity persistence.
	 *
	 * @return the social activity persistence
	 */
	public SocialActivityPersistence getSocialActivityPersistence() {
		return socialActivityPersistence;
	}

	/**
	 * Sets the social activity persistence.
	 *
	 * @param socialActivityPersistence the social activity persistence
	 */
	public void setSocialActivityPersistence(
		SocialActivityPersistence socialActivityPersistence) {
		this.socialActivityPersistence = socialActivityPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = prRegistrationPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = PRProductLocalService.class)
	protected PRProductLocalService prProductLocalService;
	@BeanReference(type = PRProductPersistence.class)
	protected PRProductPersistence prProductPersistence;
	@BeanReference(type = PRUserLocalService.class)
	protected PRUserLocalService prUserLocalService;
	@BeanReference(type = PRUserPersistence.class)
	protected PRUserPersistence prUserPersistence;
	@BeanReference(type = PRRegistrationLocalService.class)
	protected PRRegistrationLocalService prRegistrationLocalService;
	@BeanReference(type = PRRegistrationPersistence.class)
	protected PRRegistrationPersistence prRegistrationPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = SocialActivityLocalService.class)
	protected SocialActivityLocalService socialActivityLocalService;
	@BeanReference(type = SocialActivityPersistence.class)
	protected SocialActivityPersistence socialActivityPersistence;
}