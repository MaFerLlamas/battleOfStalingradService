package org.mariaavila.stalingrad.service.impl;

import org.mariaavila.stalingrad.commons.GenericServiceImpl;
import org.mariaavila.stalingrad.dao.MapGridRepositoryImpl;
import org.mariaavila.stalingrad.model.MapGrid;
import org.mariaavila.stalingrad.service.api.MapGridServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * @author Maria Avila
 * Implements the DAO CRUD methods and utilize connects the repository
 */
@Service
public class MapGridServiceImpl extends GenericServiceImpl<MapGrid, String> implements MapGridServiceApi{
	
	@Autowired
	private MapGridRepositoryImpl mapGridRepository;

	@Override
	public CrudRepository<MapGrid, String> getDao() {
		// TODO Auto-generated method stub
		return mapGridRepository;
	}

}
