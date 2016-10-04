package com.model;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarServiceInterface {
    /**
     * Retrieve all cars in the catalog.
     * @return all cars
     */
    public List<CarVO> findAll(){
    	return null;
    }
     
    /**
     * search cars according to keyword in name and company.
     * @param keyword for search
     * @return list of car that match the keyword
     */
    public List<CarVO> search(String keyword){
    	List<CarVO> list = new ArrayList<>();
    	list.add(new CarVO(1, "String model", "String make", "String description", "String preview", 1000));
    	return list;
    }
}
