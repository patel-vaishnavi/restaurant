/**
 * 
 */
package com.sebone.java.restaurants;

import java.util.ArrayList;

import com.sebone.java.data.RestaurantResponse;
/**
 * @author       : Vaishnavi Patel
 * @InterfaceName    : RestaurantInfo
 * @Methods      : getRestaurantDetails,getRestaurantsByName,filterRestaurantDetails,sortRestaurantDetails
 * ClassSpecifier: public
 * Objective     : to provide methods for restaurant operation
 * Date          : 24/03/2022
 */
public interface RestaurantInfo {
	public RestaurantResponse getRestaurantDetails(int pincode);
	public RestaurantResponse getRestaurantsByName(String name);
	public RestaurantResponse filterRestaurantDetails(int pincode,ArrayList<String> value);
	public RestaurantResponse sortRestaurantDetails(int pincode,ArrayList<String> value);
}