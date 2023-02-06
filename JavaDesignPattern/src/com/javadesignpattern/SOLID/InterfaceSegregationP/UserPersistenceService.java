package com.javadesignpattern.SOLID.InterfaceSegregationP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserPersistenceService implements PersistenceService<User>{

	private static final Map<Long, User> USERS=new HashMap<>();

	@Override
	public void save(User entity) {
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
		}
		
	}

	@Override
	public void delete(User entity) {
		synchronized (USERS){
			USERS.remove(entity.getId());
		}
		
	}

	@Override
	public User finById(Long id) {
		
		synchronized(USERS) {
			return USERS.get(id);	
		}
		
	}

	//@Override// have to remove this annotation because this method is only applicable to this class hence 
	//was violating the Integration Segregation Principle
	
	/**IMP NOTE :- If this method is required by any other service it can use by referencing this USER service.**/
	public List<User> findByName(String name) {
		synchronized(USERS) {
			return USERS.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
		
	}

	
}
