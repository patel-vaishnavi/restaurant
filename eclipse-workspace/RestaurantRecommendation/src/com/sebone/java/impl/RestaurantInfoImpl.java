/**
 * 
 */
package com.sebone.java.impl;

import java.util.ArrayList;

import com.sebone.java.data.RestaurantResponse;
import com.sebone.java.restaurants.RestaurantInfo;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : RestaurantInfoImpl
 * @Methods      : getRestaurantDetails,getRestaurantsByName,filterRestaurantDetails,sortRestaurantDetails
 * ClassSpecifier: public
 * Objective     : to provide Dish Data
 * Date          : 24/03/2022
 */
public class RestaurantInfoImpl implements RestaurantInfo{
	/**
	 * @param int
	 * @return object of RestaurantResponse
	 * @Objective     : to get restaurant details by pincode
	 * @author Vaishnavi Patel
	 */
	@Override
	public RestaurantResponse getRestaurantDetails(int pincode) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param string
	 * @return object of RestaurantResponse
	 * @Objective     : to get restaurant details by name
	 * @author Vaishnavi Patel
	 */
	@Override
	public RestaurantResponse getRestaurantsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param int, ArrayList<String>
	 * @return object of RestaurantResponse
	 * @Objective     : to filter restaurant by pincode and filter value
	 * @author Vaishnavi Patel
	 */
	@Override
	public RestaurantResponse filterRestaurantDetails(int pincode, ArrayList<String> value) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param int, ArrayList<String>
	 * @return object of RestaurantResponse
	 * @Objective     : to sort restaurant by pincode and sort value
	 * @author Vaishnavi Patel
	 */
	@Override
	public RestaurantResponse sortRestaurantDetails(int pincode, ArrayList<String> value) {
		// TODO Auto-generated method stub
		return null;
	}

}
