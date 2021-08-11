package org.mariaavila.stalingrad.dao;


import org.mariaavila.stalingrad.model.Tank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Maria Avila
 * Tank Repository
 * 
 * a mechanism for encapsulating storage,
 * retrieval, and search behavior which emulates a collection of objects
 * Utilize @Repository so Spring Boot can recognized as a DB component 
 */
@Repository
public interface TankRepositoryImpl extends MongoRepository<Tank, String>{

}
