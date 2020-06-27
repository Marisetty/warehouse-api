/**
 * 
 */
package com.warehouse.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author maris
 *
 */
@Service
public class WareHouseServiceImpl implements WareHouseService 
{
	@Override
	public ResponseEntity<Object> getAvailableTyres(String typeOfVehicle) 
	{
		return new ResponseEntity<Object>("Success", HttpStatus.OK);
	}

}
