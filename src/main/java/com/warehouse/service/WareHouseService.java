/**
 * 
 */
package com.warehouse.service;

import org.springframework.http.ResponseEntity;

/**
 * @author maris
 *
 */
public interface WareHouseService {

	public ResponseEntity<Object> getAvailableTyres(String typeOfVehicle);

}
