package org.mariaavila.stalingrad.service.impl;

import org.mariaavila.stalingrad.commons.GenericServiceImpl;
import org.mariaavila.stalingrad.dao.TankRepositoryImpl;
import org.mariaavila.stalingrad.model.MapGrid;
import org.mariaavila.stalingrad.model.Tank;
import org.mariaavila.stalingrad.service.api.TankServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;



/**
 * @author Maria Avila
 * Implements the DAO CRUD methods and utilize connects the repository
 */
@Service
public class TankServiceImpl extends GenericServiceImpl<Tank, String> implements TankServiceApi{
	
	@Autowired
	private TankRepositoryImpl tankRepository;

	@Override
	public TankRepositoryImpl getDao() {
		// TODO Auto-generated method stub
		return tankRepository;
	}

}
