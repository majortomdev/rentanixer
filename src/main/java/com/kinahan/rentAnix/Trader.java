//by JK 23-10-19
package com.kinahan.rentAnix;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

 
public class Trader {
	@Id
	public ObjectId traderId;
	public int yearsTrading;
	public String company;
	public String website;
	public String classification;
	public String biography;
	
	public Trader () {
		
	}
	public Trader(int yearsTrading, String company, String website, String classification, String biography) {
		this.yearsTrading = yearsTrading;
		this.company = company;
		this.website = website;
		this.classification = classification;
		this.biography = biography;
	}

	public String get_id() { return traderId.toHexString(); }
	public void set_id(ObjectId _id) { this.traderId = _id; }
	
	public int getYearsTrading() {
		return yearsTrading;
	}
	public void setYearsTrading(int yearsTrading) {
		this.yearsTrading = yearsTrading;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}

}
