/**
 * 
 */
package com.sebone.java.impl;

import java.util.ArrayList;

import com.sebone.java.data.DishResponse;
import com.sebone.java.restaurants.DishInfo;

/**
 * @author       : Vaishnavi Patel
 * @ClassName    : DishInfoImpl
 * @Methods      : getDishesByRestaurant,searchDishesByKeyword,searchByDish,sortDish,filterDish
 * ClassSpecifier: public
 * Objective     : to provide Dish Data
 * Date          : 24/03/2022
 */
public class DishInfoImpl implements DishInfo {
	/**
	 * @param int
	 * @return object of DishResponse
	 * @Objective     : to get dishes by restaurant
	 * @author Vaishnavi Patel
	 */
	@Override
	public DishResponse getDishesByRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param int,string
	 * @return object of DishResponse
	 * @Objective     : to get dishes by restaurant and keyword
	 * @author Vaishnavi Patel
	 */
	@Override
	public DishResponse searchDishesByKeyword(int restaurantId, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param string
	 * @return object of DishResponse
	 * @Objective     : to get dishes by keyword
	 * @author Vaishnavi Patel
	 */
	@Override
	public DishResponse searchByDish(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param int,Arraylist<string>
	 * @return object of DishResponse
	 * @Objective     : to sort dishes by restaurant and sort values
	 * @author Vaishnavi Patel
	 */
	@Override
	public DishResponse sortDish(int restaurantId, ArrayList<String> sortvalue) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param int,Arraylist<string>
	 * @return object of DishResponse
	 * @Objective     : to filter dishes by restaurant and filter values
	 * @author Vaishnavi Patel
	 */
	@Override
	public DishResponse filterDish(int restaurantId, ArrayList<String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

}
