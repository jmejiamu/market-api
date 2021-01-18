package com.jmejiamu.backend.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemsController {
	
	@GetMapping
	public String getItems() {
		return "Get all items";
	}
	
	@PostMapping
	public String addItem() {
		return "Add an items";
	}
	
	@PutMapping
	public String updateItem() {
		return "Update an update";
	}
	
	@DeleteMapping
	public String deleteItem() {
		return "Delete an Item";
	}
}
