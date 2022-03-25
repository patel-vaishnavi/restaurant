/**
 * 
 */
package com.sebone.java.data;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : DishDetails
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide Dish Details
 * Date          : 24/03/2022
 */
public class DishDetails {
	private RestaurantDetails restaurantDetails= new RestaurantDetails();
    private DishData dishData =new DishData();
	/**
	 * @return the restaurantDetails
	 */
	public RestaurantDetails getRestaurantDetails() {
		return restaurantDetails;
	}
	/**
	 * @param restaurantDetails the restaurantDetails to set
	 */
	public void setRestaurantDetails(RestaurantDetails restaurantDetails) {
		this.restaurantDetails = restaurantDetails;
	}
	/**
	 * @return the dishData
	 */
	public DishData getDishData() {
		return dishData;
	}
	/**
	 * @param dishData the dishData to set
	 */
	public void setDishData(DishData dishData) {
		this.dishData = dishData;
	}
    
}
