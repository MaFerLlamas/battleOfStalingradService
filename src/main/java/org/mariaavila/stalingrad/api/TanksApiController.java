package org.mariaavila.stalingrad.api;

import java.util.List;

import javax.validation.Valid;

import org.mariaavila.stalingrad.model.Tank;
import org.mariaavila.stalingrad.service.api.TankServiceApi;
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
 * Controller used to define the endpoint for Tanks
 * Utilize the MapGridServiceApi Service that is recognized by
 * Spring boot because the @Service Annotation + @Autowired
 *
 */

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class TanksApiController {

    @Autowired
    private TankServiceApi TankServiceAPI;

    @PostMapping(value = "/tanks")
    public ResponseEntity<Tank> save(@Valid @RequestBody Tank Tank) {
    	Tank response = TankServiceAPI.save(Tank);
		return new ResponseEntity<Tank>(response, HttpStatus.CREATED);
    }
    
    @GetMapping(value = "/tanks")
    public List<Tank> getAll() {
    	return TankServiceAPI.getAll();
    }
    
    @GetMapping(value = "/tanks/{id}")
    public ResponseEntity<Tank> findById(@PathVariable String id) {
    	Tank response = TankServiceAPI.get(id);
    	if (response == null)
    		return new ResponseEntity<Tank>(response, HttpStatus.NOT_FOUND);
    	return new ResponseEntity<Tank>(response, HttpStatus.OK);
    }
    
    @DeleteMapping(value = "/tanks/{id}")
    public ResponseEntity<Tank> deleteById(@PathVariable String id) {
    	String response = TankServiceAPI.delete(id);
    	if (response == null)
    		return new ResponseEntity<Tank>(HttpStatus.NOT_FOUND);
    	return new ResponseEntity<Tank>(HttpStatus.NO_CONTENT);
    }
}
