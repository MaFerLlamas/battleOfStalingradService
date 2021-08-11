package org.mariaavila.stalingrad.commons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * @author Maria Avila
 *
 * @param <T> Generic
 * @param <ID> Generic
 * Implements Generic CRUD operations that can be used for other Services
 * 
  @ Service Indicates that an annotated class is a "Service", originally defined by Domain-Driven
 * Design (Evans, 2003) as "an operation offered as an interface that stands alone in the
 * model, with no encapsulated state."
 */

@Service
public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericServiceAPI<T, ID> {

	
	/**
	 * Used to save de Generic types
	 */
	@Override
	public T save(T entity) {
		return getDao().save(entity);
	}

	/**
	 * Used to delete By Id
	 */
	@Override
	public ID delete(ID id) {
		Optional<T> obj = getDao().findById(id);
		if (obj.isPresent()) {
			getDao().deleteById(id);
			return id;
		}
		return null;
		
	}

	/**
	 * Used to Get By Id
	 */
	@Override
	public T get(ID id) {
		Optional<T> obj = getDao().findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	/**
	 * Retrieves All the elements
	 */
	@Override
	public List<T> getAll() {
		List<T> returnList = new ArrayList<>();
		getDao().findAll().forEach(obj -> returnList.add(obj));
		return returnList;
	}

	public abstract CrudRepository<T, ID> getDao();

}