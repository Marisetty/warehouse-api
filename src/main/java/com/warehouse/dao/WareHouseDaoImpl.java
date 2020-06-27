package com.warehouse.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.warehouse.model.Tyre;

@Service
public class WareHouseDaoImpl implements WareHouseDao 
{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<Tyre> getAvailableTyres()
	{
		try
		{
			List<Tyre> availableTyres = mongoTemplate.findAll(Tyre.class, "TwoWheeler_TyreInfo");
			if(availableTyres != null && !availableTyres.isEmpty())
			{
				return availableTyres;
			}
			else
			{
				return new ArrayList<>();	
			}	
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured while Fetching available tyres");
		}
		return new ArrayList<>();
	}

	@Override
	public List<Tyre> getByMakeBy(String makeBy) {
		try
		{
			Query query = new Query();
			query.addCriteria(Criteria.where("makeBy").is(makeBy));
			
			List<Tyre> availableTyres = mongoTemplate.find(query, Tyre.class, "TwoWheeler_TyreInfo");
			
			if(availableTyres != null && !availableTyres.isEmpty())
			{
				return availableTyres;
			}
			else
			{
				return new ArrayList<>();	
			}	
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured while Fetching available tyres");
		}
		return new ArrayList<>();
	}
}
