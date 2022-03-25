/**
 * 
 */
package com.sebone.java.data;

import java.util.Date;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : DishData
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide Dish Data
 * Date          : 24/03/2022
 */
public class DishData {
	private String DishName;
	private int DishPrice;
	private String DishImage;
	private String DishDescription;
	private String Dishtype;
	private int restaurantId;
	private String DishStatus;
	private Date DishTime;
	private Date DishCreationTime;
	private Date DishModifiedTime;
	private Date DishPreparationTime;
	private int DishId;
	/**
	 * @return the dishId
	 */
	public int getDishId() {
		return DishId;
	}
	/**
	 * @param dishId the dishId to set
	 */
	public void setDishId(int dishId) {
		DishId = dishId;
	}
	/**
	 * @return the dishName
	 */
	public String getDishName() {
		return DishName;
	}
	/**
	 * @param dishName the dishName to set
	 */
	public void setDishName(String dishName) {
		DishName = dishName;
	}
	/**
	 * @return the dishPrice
	 */
	public int getDishPrice() {
		return DishPrice;
	}
	/**
	 * @param dishPrice the dishPrice to set
	 */
	public void setDishPrice(int dishPrice) {
		DishPrice = dishPrice;
	}
	/**
	 * @return the dishImage
	 */
	public String getDishImage() {
		return DishImage;
	}
	/**
	 * @param dishImage the dishImage to set
	 */
	public void setDishImage(String dishImage) {
		DishImage = dishImage;
	}
	/**
	 * @return the dishDescription
	 */
	public String getDishDescription() {
		return DishDescription;
	}
	/**
	 * @param dishDescription the dishDescription to set
	 */
	public void setDishDescription(String dishDescription) {
		DishDescription = dishDescription;
	}
	/**
	 * @return the dishtype
	 */
	public String getDishtype() {
		return Dishtype;
	}
	/**
	 * @param dishtype the dishtype to set
	 */
	public void setDishtype(String dishtype) {
		Dishtype = dishtype;
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
	 * @return the dishStatus
	 */
	public String getDishStatus() {
		return DishStatus;
	}
	/**
	 * @param dishStatus the dishStatus to set
	 */
	public void setDishStatus(String dishStatus) {
		DishStatus = dishStatus;
	}
	/**
	 * @return the dishTime
	 */
	public Date getDishTime() {
		return DishTime;
	}
	/**
	 * @param dishTime the dishTime to set
	 */
	public void setDishTime(Date dishTime) {
		DishTime = dishTime;
	}
	/**
	 * @return the dishCreationTime
	 */
	public Date getDishCreationTime() {
		return DishCreationTime;
	}
	/**
	 * @param dishCreationTime the dishCreationTime to set
	 */
	public void setDishCreationTime(Date dishCreationTime) {
		DishCreationTime = dishCreationTime;
	}
	/**
	 * @return the dishModifiedTime
	 */
	public Date getDishModifiedTime() {
		return DishModifiedTime;
	}
	/**
	 * @param dishModifiedTime the dishModifiedTime to set
	 */
	public void setDishModifiedTime(Date dishModifiedTime) {
		DishModifiedTime = dishModifiedTime;
	}
	/**
	 * @return the dishPreparationTime
	 */
	public Date getDishPreparationTime() {
		return DishPreparationTime;
	}
	/**
	 * @param dishPreparationTime the dishPreparationTime to set
	 */
	public void setDishPreparationTime(Date dishPreparationTime) {
		DishPreparationTime = dishPreparationTime;
	}
	

}
