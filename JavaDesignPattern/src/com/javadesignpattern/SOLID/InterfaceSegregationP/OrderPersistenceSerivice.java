package com.javadesignpattern.SOLID.InterfaceSegregationP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceSerivice implements PersistenceService<Order> {

	
	private static final Map<Long, Order> ORDERS=new HashMap<>();
	
	@Override
	public void save(Order entity) {
		synchronized (ORDERS) {
	    		
			ORDERS.put(entity.getId(), entity);
		}
		
	}

	@Override
	public void delete(Order entity) {
		synchronized(ORDERS) {
			ORDERS.remove(entity.getId());
		}
		
	}

	@Override
	public Order finById(Long id) {
		synchronized (ORDERS) {
			
			return ORDERS.get(id);
					
		}
	}

	
	//For below method we know the User class doesn't have name field so it not relevant to get data from 
	//User class based on names, hence here the Interface segregation principle is being violated,
	//Because the class user is forced to provide implementation for findByName method of 
	//PersistenceService Interface, hence the below method is commmented
	/*
	 * @Override public List<Order> findByName(String name) { // TODO Auto-generated
	 * method stub throw new
	 * UnsupportedOperationException("Find By name is not supported for this class"
	 * ); }
	 */

	
	
	
}
