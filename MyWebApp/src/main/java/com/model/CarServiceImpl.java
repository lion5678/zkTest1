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
    	if("a".equals(keyword)){
    		list.add(new CarVO(1, "String model1", "String make1", "String description1", "String preview1", 1000));
    	}else if("b".equals(keyword)){
    		list.add(new CarVO(2, "String model2", "String make2", "String description2", "String preview2", 2000));
    	}else{
    		
    	}
    		
    	return list;
    }
    
}
