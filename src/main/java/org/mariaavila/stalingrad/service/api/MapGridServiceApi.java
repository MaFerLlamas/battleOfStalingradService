package org.mariaavila.stalingrad.service.api;

import org.mariaavila.stalingrad.commons.GenericServiceAPI;

/**
 * @autho Maria Avila
 * This class extends GenericServiceAPI, to work with Maps and utilize the 
 * Generic CRUD operations:
 * Save Map
 * Delete Map
 * Get By Id
 * Get All Maps
 */
import org.mariaavila.stalingrad.model.MapGrid;

public interface MapGridServiceApi extends GenericServiceAPI<MapGrid, String>{

}
