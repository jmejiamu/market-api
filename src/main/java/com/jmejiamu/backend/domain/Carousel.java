package com.jmejiamu.backend.domain;
/*
 * This entity creates a carousel table
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carousel {
	
	// Generate an auto increment ID 
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String description;
	private String url;
	
	
	public Carousel () {}


	public Carousel(String title, String description, String url) {
		super();
		this.title = title;
		this.description = description;
		this.url = url;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
