package com.jmejiamu.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * This entity creates an Item Table
 */

@Entity
public class Mentshirt {
	/*
	 * This generate an auto increment ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String itemName;
	private String itemDescript;
	private String itemUrl;
	
	public Mentshirt() {}

	public Mentshirt(String itemName, String itemDescript, String itemUrl) {
		super();
		this.itemName = itemName;
		this.itemDescript = itemDescript;
		this.itemUrl = itemUrl;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescript() {
		return itemDescript;
	}

	public void setItemDescript(String itemDescript) {
		this.itemDescript = itemDescript;
	}

	public String getItemUrl() {
		return itemUrl;
	}

	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}
	
	
}
