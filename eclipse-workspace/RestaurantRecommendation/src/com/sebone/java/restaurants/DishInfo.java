/**
 * 
 */
package com.sebone.java.restaurants;

import java.util.ArrayList;

import com.sebone.java.data.DishResponse;
/**
 * @author       : Vaishnavi Patel
 * @InterfaceName    : DishInfo
 * @Methods      : getDishesByRestaurant,searchDishesByKeyword,searchByDish,sortDish,filterDish
 * ClassSpecifier: public
 * Objective     : to provide methods for dish operation
 * Date          : 24/03/2022
 */
public interface DishInfo {
	public DishResponse getDishesByRestaurant(int restaurantId);
	public DishResponse searchDishesByKeyword(int restaurantId,String keyword);
	public DishResponse searchByDish(String keyword);
	public DishResponse sortDish(int restaurantId,ArrayList<String> sortvalue);
	public DishResponse filterDish(int restaurantId,ArrayList<String> filters
			);

}
