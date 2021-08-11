package org.mariaavila.stalingrad.api;

import java.util.List;

import javax.validation.Valid;

import org.mariaavila.stalingrad.model.MapGrid;
import org.mariaavila.stalingrad.service.api.MapGridServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maria Avila
 * Controller used to define the endpoint for Maps
 * Utilize the MapGridServiceApi Service that is recognized by
 * Spring boot because the @Service Annotation + @Autowired
 *
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")

public class MapsApiController {

    @Autowired
    private MapGridServiceApi mapGridServiceAPI;

    @PostMapping(value = "/maps")
    public ResponseEntity<MapGrid> save(@Valid @RequestBody MapGrid mapGrid) {
    	MapGrid response = mapGridServiceAPI.save(mapGrid);
		return new ResponseEntity<MapGrid>(response, HttpStatus.CREATED);
    }
    
    @GetMapping(value = "/maps")
    public List<MapGrid> getAll() {
    	return mapGridServiceAPI.getAll();
    }
    
    @GetMapping(value = "/maps/{id}")
    public ResponseEntity<MapGrid> findById(@PathVariable String id) {
    	MapGrid response = mapGridServiceAPI.get(id);
    	if (response == null)
    		return new ResponseEntity<MapGrid>(response, HttpStatus.NOT_FOUND);
    	return new ResponseEntity<MapGrid>(response, HttpStatus.OK);
    }
    
    @DeleteMapping(value = "/maps/{id}")
    public ResponseEntity<MapGrid> deleteById(@PathVariable String id) {
    	String response = mapGridServiceAPI.delete(id);
    	if (response == null)
    		return new ResponseEntity<MapGrid>(HttpStatus.NOT_FOUND);
    	return new ResponseEntity<MapGrid>(HttpStatus.NO_CONTENT);
    }


}
