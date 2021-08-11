package org.mariaavila.stalingrad.dao;


import org.mariaavila.stalingrad.model.MapGrid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Maria Avila
 * MapGrid Repository
 * 
 * a mechanism for encapsulating storage,
 * retrieval, and search behavior which emulates a collection of objects
 * Utilize @Repository so Spring Boot can recognized as a DB component
 */

@Repository
public interface MapGridRepositoryImpl extends MongoRepository<MapGrid, String>{

}
