/**
 * 
 */
package com.sebone.java.data;

import java.util.ArrayList;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : RestaurantDetails
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide restaurant details
 * Date          : 24/03/2022
 */
public class RestaurantDetails {
	private RestaurantData restaurantData=new RestaurantData();
	private ArrayList<RatingData> ratingDataList;
    private ArrayList<OfferData> offerDataList;
	/**
	 * @return the restaurantData
	 */
	public RestaurantData getRestaurantData() {
		return restaurantData;
	}
	/**
	 * @param restaurantData the restaurantData to set
	 */
	public void setRestaurantData(RestaurantData restaurantData) {
		this.restaurantData = restaurantData;
	}
	/**
	 * @return the ratingDataList
	 */
	public ArrayList<RatingData> getRatingDataList() {
		return ratingDataList;
	}
	/**
	 * @param ratingDataList the ratingDataList to set
	 */
	public void setRatingDataList(ArrayList<RatingData> ratingDataList) {
		this.ratingDataList = ratingDataList;
	}
	/**
	 * @return the offerDataList
	 */
	public ArrayList<OfferData> getOfferDataList() {
		return offerDataList;
	}
	/**
	 * @param offerDataList the offerDataList to set
	 */
	public void setOfferDataList(ArrayList<OfferData> offerDataList) {
		this.offerDataList = offerDataList;
	}
    
    
}
