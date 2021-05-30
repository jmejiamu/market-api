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
	private long Id;
	private String itemName;
	private String itemDescript;
	private String itemUrl;
	private double price;
	
	public Mentshirt() {}

	public Mentshirt(String itemName, String itemDescript, String itemUrl, double price) {
		super();
		this.itemName = itemName;
		this.itemDescript = itemDescript;
		this.itemUrl = itemUrl;
		this.price = price;
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

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
