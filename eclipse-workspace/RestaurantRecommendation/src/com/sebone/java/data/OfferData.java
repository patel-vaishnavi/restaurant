/**
 * 
 */
package com.sebone.java.data;

import java.util.Date;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : OfferData
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide offer data
 * Date          : 24/03/2022
 */
public class OfferData {
	private int offerId;
	private String offerType;
	private String offerDescription;
	private Date offerStartDateTime;
	private Date offerEndDateTime;
	private String offerStatus;
	private int restaurantId;
	/**
	 * @return the offerId
	 */
	public int getOfferId() {
		return offerId;
	}
	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	/**
	 * @return the offerType
	 */
	public String getOfferType() {
		return offerType;
	}
	/**
	 * @param offerType the offerType to set
	 */
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	/**
	 * @return the offerDescription
	 */
	public String getOfferDescription() {
		return offerDescription;
	}
	/**
	 * @param offerDescription the offerDescription to set
	 */
	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}
	/**
	 * @return the offerStartDateTime
	 */
	public Date getOfferStartDateTime() {
		return offerStartDateTime;
	}
	/**
	 * @param offerStartDateTime the offerStartDateTime to set
	 */
	public void setOfferStartDateTime(Date offerStartDateTime) {
		this.offerStartDateTime = offerStartDateTime;
	}
	/**
	 * @return the offerEndDateTime
	 */
	public Date getOfferEndDateTime() {
		return offerEndDateTime;
	}
	/**
	 * @param offerEndDateTime the offerEndDateTime to set
	 */
	public void setOfferEndDateTime(Date offerEndDateTime) {
		this.offerEndDateTime = offerEndDateTime;
	}
	/**
	 * @return the offerStatus
	 */
	public String getOfferStatus() {
		return offerStatus;
	}
	/**
	 * @param offerStatus the offerStatus to set
	 */
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
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

}

