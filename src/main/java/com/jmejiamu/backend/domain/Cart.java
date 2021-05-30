package com.jmejiamu.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String itemName;
	private String itemDescription;
	private String itemUrl;
	private double price;
	
	public Cart() {
	}
	

	public Cart(String itemName, String itemDescription, String itemUrl, double price) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemUrl = itemUrl;
		this.price = price;
	}



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
