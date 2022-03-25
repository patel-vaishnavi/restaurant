/**
 * 
 */
package com.sebone.java.data;

import java.util.Date;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : RatingData
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide rating data
 * Date          : 24/03/2022
 */
public class RatingData {
	private int ratingId;
	private int ratingStars;
	private String ratingDescriptioin;
	private Date ratingTime;
	private String ratingUser;
	private int restaurantId;
	private Date ratingCreatedDateTime;
	private Date modifiedDateTime;
	/**
	 * @return the ratingId
	 */
	public int getRatingId() {
		return ratingId;
	}
	/**
	 * @param ratingId the ratingId to set
	 */
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	/**
	 * @return the ratingStars
	 */
	public int getRatingStars() {
		return ratingStars;
	}
	/**
	 * @param ratingStars the ratingStars to set
	 */
	public void setRatingStars(int ratingStars) {
		this.ratingStars = ratingStars;
	}
	/**
	 * @return the ratingDescriptioin
	 */
	public String getRatingDescriptioin() {
		return ratingDescriptioin;
	}
	/**
	 * @param ratingDescriptioin the ratingDescriptioin to set
	 */
	public void setRatingDescriptioin(String ratingDescriptioin) {
		this.ratingDescriptioin = ratingDescriptioin;
	}
	/**
	 * @return the ratingTime
	 */
	public Date getRatingTime() {
		return ratingTime;
	}
	/**
	 * @param ratingTime the ratingTime to set
	 */
	public void setRatingTime(Date ratingTime) {
		this.ratingTime = ratingTime;
	}
	/**
	 * @return the ratingUser
	 */
	public String getRatingUser() {
		return ratingUser;
	}
	/**
	 * @param ratingUser the ratingUser to set
	 */
	public void setRatingUser(String ratingUser) {
		this.ratingUser = ratingUser;
	}
	/**
	 * @return the restaurantId
	 */
	public int getRestaurantId() {
		return restaurantId;
	}
	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	/**
	 * @return the ratingCreatedDateTime
	 */
	public Date getRatingCreatedDateTime() {
		return ratingCreatedDateTime;
	}
	/**
	 * @param ratingCreatedDateTime the ratingCreatedDateTime to set
	 */
	public void setRatingCreatedDateTime(Date ratingCreatedDateTime) {
		this.ratingCreatedDateTime = ratingCreatedDateTime;
	}
	/**
	 * @return the modifiedDateTime
	 */
	public Date getModifiedDateTime() {
		return modifiedDateTime;
	}
	/**
	 * @param modifiedDateTime the modifiedDateTime to set
	 */
	public void setModifiedDateTime(Date modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}
	
	
}
