/**
 * 
 */
package com.warehouse.dao;

import java.util.List;

import com.warehouse.model.Tyre;

/**
 * @author maris
 *
 */
public interface WareHouseDao 
{
	public List<Tyre> getAvailableTyres();

	public List<Tyre> getByMakeBy(String makeBy);
}
