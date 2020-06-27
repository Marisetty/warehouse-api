/**
 * 
 */
package com.warehouse.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author maris
 *
 */
@Document(collection="TwoWheeler_TyreInfo")
public class Tyre 
{
	private String makeBy;
	private String originOfMake;
	private String size;
	private String bestFitFor;
	
	
	public String getMakeBy() {
		return makeBy;
	}
	public void setMakeBy(String makeBy) {
		this.makeBy = makeBy;
	}
	public String getOriginOfMake() {
		return originOfMake;
	}
	public void setOriginOfMake(String originOfMake) {
		this.originOfMake = originOfMake;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBestFitFor() {
		return bestFitFor;
	}
	public void setBestFitFor(String bestFitFor) {
		this.bestFitFor = bestFitFor;
	}

	@Override
	public String toString() {
		return "Tyre [makeBy=" + makeBy + ", originOfMake=" + originOfMake + ", size=" + size + ", bestFitFor="
				+ bestFitFor + "]";
	}
}
