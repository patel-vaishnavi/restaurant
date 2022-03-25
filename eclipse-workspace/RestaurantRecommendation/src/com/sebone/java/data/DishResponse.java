package com.sebone.java.data;

import java.util.ArrayList;
/**
 * @author       : Vaishnavi Patel
 * @ClassName    : DishResponse
 * @Methods      : Getters And Setters
 * ClassSpecifier: public
 * Objective     : to provide object of dish list
 * Date          : 24/03/2022
 */
public class DishResponse {
	private boolean isSuccess;
	private ArrayList<DishDetails> dishDetailList;
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
	 * @return the dishDetailList
	 */
	public ArrayList<DishDetails> getDishDetailList() {
		return dishDetailList;
	}
	/**
	 * @param dishDetailList the dishDetailList to set
	 */
	public void setDishDetailList(ArrayList<DishDetails> dishDetailList) {
		this.dishDetailList = dishDetailList;
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
