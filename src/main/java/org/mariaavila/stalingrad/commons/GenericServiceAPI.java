package org.mariaavila.stalingrad.commons;

import java.io.Serializable;
import java.util.List;

/**
 * @author Maria Avila
 *
 * @param <T>
 * @param <ID>
 * 
 * Interface for the Generic Service, It's Implementation can be used 
 * by other Services
 */
public interface GenericServiceAPI<T, ID extends Serializable> {

	T save(T entity);
	
	ID delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
}
