package com.model;

import java.util.List;

public interface CarServiceInterface {

	/**
	 * Retrieve all cars in the catalog.
	 * @return all cars
	 */
	List<CarVO> findAll();

	/**
	 * search cars according to keyword in name and company.
	 * @param keyword for search
	 * @return list of car that match the keyword
	 */
	List<CarVO> search(String keyword);

}