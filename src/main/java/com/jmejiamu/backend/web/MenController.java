package com.jmejiamu.backend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmejiamu.backend.domain.MenItemRepository;
import com.jmejiamu.backend.domain.MenItems;

@RestController
public class MenController {
	
	@Autowired
	private MenItemRepository repository;

	@RequestMapping("/menitems")
	public Iterable<MenItems> getMen(){
		return repository.findAll();
	}
}
