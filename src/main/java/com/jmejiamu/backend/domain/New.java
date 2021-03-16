package com.jmejiamu.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * This entity creates a New table
 */
@Entity
public class New {
	/*
	 * This generate an auto increment ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String itemName;
	private String itemDescription;
	private String itemUrl;
	
	public New() {
		
	}
	
	
	public New(String itemName, String itemDescription, String itemUrl) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemUrl = itemUrl;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemUrl() {
		return itemUrl;
	}

	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}
	
	

}
