/**
 * 
 */
package com.sebone.java.data;

import java.util.Date;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : RestaurantData
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide restaurant data
 * Date          : 24/03/2022
 */
public class RestaurantData {
	private int restaurantId;
	private String restaurantName;
	private String restaurantEmail;
	private long restaurantContact;
	private String restaurantType;
	private String restaurantImage;
	private String restaurantStatus;
	private String restaurantDescription;
	//private int restaurantOffer;
	private int restauranAvgPrice;
	private Date restaurantOpenTime;
	private Date restaurantCloseTime;
	private Date restaurantCreatedDateTime;
	private Date restaurantModifiedDateTime;
	private int restaurantPincode;
	
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
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}
	/**
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	/**
	 * @return the restaurantEmail
	 */
	public String getRestaurantEmail() {
		return restaurantEmail;
	}
	/**
	 * @param restaurantEmail the restaurantEmail to set
	 */
	public void setRestaurantEmail(String restaurantEmail) {
		this.restaurantEmail = restaurantEmail;
	}
	/**
	 * @return the restaurantContact
	 */
	public long getRestaurantContact() {
		return restaurantContact;
	}
	/**
	 * @param restaurantContact the restaurantContact to set
	 */
	public void setRestaurantContact(long restaurantContact) {
		this.restaurantContact = restaurantContact;
	}
	/**
	 * @return the restaurantType
	 */
	public String getRestaurantType() {
		return restaurantType;
	}
	/**
	 * @param restaurantType the restaurantType to set
	 */
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	/**
	 * @return the restaurantImage
	 */
	public String getRestaurantImage() {
		return restaurantImage;
	}
	/**
	 * @param restaurantImage the restaurantImage to set
	 */
	public void setRestaurantImage(String restaurantImage) {
		this.restaurantImage = restaurantImage;
	}
	/**
	 * @return the restaurantStatus
	 */
	public String getRestaurantStatus() {
		return restaurantStatus;
	}
	/**
	 * @param restaurantStatus the restaurantStatus to set
	 */
	public void setRestaurantStatus(String restaurantStatus) {
		this.restaurantStatus = restaurantStatus;
	}
	/**
	 * @return the restaurantDescription
	 */
	public String getRestaurantDescription() {
		return restaurantDescription;
	}
	/**
	 * @param restaurantDescription the restaurantDescription to set
	 */
	public void setRestaurantDescription(String restaurantDescription) {
		this.restaurantDescription = restaurantDescription;
	}
	/**
	 * @return the restauranAvgPrice
	 */
	public int getRestauranAvgPrice() {
		return restauranAvgPrice;
	}
	/**
	 * @param restauranAvgPrice the restauranAvgPrice to set
	 */
	public void setRestauranAvgPrice(int restauranAvgPrice) {
		this.restauranAvgPrice = restauranAvgPrice;
	}
	/**
	 * @return the restaurantOpenTime
	 */
	
	public int getRestaurantPincode() {
		return restaurantPincode;
	}
	/**
	 * @return the restaurantOpenTime
	 */
	public Date getRestaurantOpenTime() {
		return restaurantOpenTime;
	}
	/**
	 * @param restaurantOpenTime the restaurantOpenTime to set
	 */
	public void setRestaurantOpenTime(Date restaurantOpenTime) {
		this.restaurantOpenTime = restaurantOpenTime;
	}
	/**
	 * @return the restaurantCloseTime
	 */
	public Date getRestaurantCloseTime() {
		return restaurantCloseTime;
	}
	/**
	 * @param restaurantCloseTime the restaurantCloseTime to set
	 */
	public void setRestaurantCloseTime(Date restaurantCloseTime) {
		this.restaurantCloseTime = restaurantCloseTime;
	}
	/**
	 * @return the restaurantCreatedDateTime
	 */
	public Date getRestaurantCreatedDateTime() {
		return restaurantCreatedDateTime;
	}
	/**
	 * @param restaurantCreatedDateTime the restaurantCreatedDateTime to set
	 */
	public void setRestaurantCreatedDateTime(Date restaurantCreatedDateTime) {
		this.restaurantCreatedDateTime = restaurantCreatedDateTime;
	}
	/**
	 * @return the restaurantModifiedDateTime
	 */
	public Date getRestaurantModifiedDateTime() {
		return restaurantModifiedDateTime;
	}
	/**
	 * @param restaurantModifiedDateTime the restaurantModifiedDateTime to set
	 */
	public void setRestaurantModifiedDateTime(Date restaurantModifiedDateTime) {
		this.restaurantModifiedDateTime = restaurantModifiedDateTime;
	}
	/**
	 * @param restaurantPincode the restaurantPincode to set
	 */
	public void setRestaurantPincode(int restaurantPincode) {
		this.restaurantPincode = restaurantPincode;
	}   
}