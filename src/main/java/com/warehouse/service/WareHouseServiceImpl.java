/**
 * 
 */
package com.warehouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.warehouse.dao.WareHouseDao;
import com.warehouse.model.Tyre;

/**
 * @author maris
 *
 */
@Service
public class WareHouseServiceImpl implements WareHouseService 
{
	@Autowired
	private WareHouseDao wareHouseDao;
	
	@Override
	public ResponseEntity<Object> getAvailableTyres() 
	{
		List<Tyre> availableTyres = wareHouseDao.getAvailableTyres();
		if(availableTyres.isEmpty())
		{
			return new ResponseEntity<Object>("No information present for given make ", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(availableTyres, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> getByMakeBy(String makeBy) {
		List<Tyre> availableTyres = wareHouseDao.getByMakeBy(makeBy);
		if(availableTyres.isEmpty())
		{
			return new ResponseEntity<Object>("No information present for given make " + makeBy, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(availableTyres, HttpStatus.OK);
	}

}
