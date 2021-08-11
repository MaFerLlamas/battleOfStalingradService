package org.mariaavila.stalingrad.service.api;

import java.util.List;

import org.mariaavila.stalingrad.commons.GenericServiceAPI;
import org.mariaavila.stalingrad.model.Tank;



/**
 * @autho Maria Avila
 * This class extends GenericServiceAPI, to work with Tanks and utilize the 
 * Generic CRUD operations:
 * Save Tank
 * Delete Tank
 * Get By Id
 * Get All Tanks
 */
public interface TankServiceApi extends GenericServiceAPI<Tank, String>{

}
