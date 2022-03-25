/**
 * 
 */
package com.sebone.java.data;

import java.util.ArrayList;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : RestaurantResponse
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide list of restaurants 
 * Date          : 24/03/2022
 */
public class RestaurantResponse {
	private boolean isSuccess;
    private ArrayList<RestaurantDetails> restaurantDetailsList;
    private String message;
	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * @return the restaurantDetailsList
	 */
	public ArrayList<RestaurantDetails> getRestaurantDetailsList() {
		return restaurantDetailsList;
	}
	/**
	 * @param restaurantDetailsList the restaurantDetailsList to set
	 */
	public void setRestaurantDetailsList(ArrayList<RestaurantDetails> restaurantDetailsList) {
		this.restaurantDetailsList = restaurantDetailsList;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
