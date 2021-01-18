package com.jmejiamu.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String itemName;
	private String itemDescrition;
	private String itemUrl;
	
	public Items() {}

	public Items(String itemName, String itemDescrition, String itemUrl) {
		super();
		this.itemName = itemName;
		this.itemDescrition = itemDescrition;
		this.itemUrl = itemUrl;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescrition() {
		return itemDescrition;
	}

	public void setItemDescrition(String itemDescrition) {
		this.itemDescrition = itemDescrition;
	}

	public String getItemUrl() {
		return itemUrl;
	}

	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}
	
	
	
	
	
}
