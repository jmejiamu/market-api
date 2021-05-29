package com.jmejiamu.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * This entity creates an MenWallet table
 */

@Entity
public class MenWallet {
	/*
	 * This generate an auto increment ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String itemName;
	private String itemDescription;
	private String itemUrl;
	
	public MenWallet() {}

	public MenWallet(String itemName, String itemDescription, String itemUrl) {
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

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
	
	
	
}
