/**
 * 
 */
package com.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.service.WareHouseService;

/**
 * @author maris
 *
 */
@CrossOrigin
@RestController
public class WareHouseController
{
	@Autowired
	private WareHouseService wareHouseService;
	
	@GetMapping("/getAvailableTyres")
	public ResponseEntity<Object> getAvailableTyres(@RequestParam String typeOfVehicle)
	{
		return wareHouseService.getAvailableTyres(typeOfVehicle);
	}
	

}
