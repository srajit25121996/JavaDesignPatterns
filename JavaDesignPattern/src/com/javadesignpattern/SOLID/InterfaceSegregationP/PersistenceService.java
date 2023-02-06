package com.javadesignpattern.SOLID.InterfaceSegregationP;

import java.util.List;

public interface PersistenceService<T extends Entity> {

	
	public void save(T entity);

	public void delete(T entity);

	public T finById(Long id);

	
	//if the below method is only required for one class,
	//we can create the method in that specific class and remove it from this interface
	//public List<T> findByName(String name);
}
