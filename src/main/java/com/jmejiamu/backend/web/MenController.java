package com.jmejiamu.backend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmejiamu.backend.domain.MenItemRepository;
import com.jmejiamu.backend.domain.MenItems;
import com.jmejiamu.backend.domain.WomenItem;
import com.jmejiamu.backend.domain.WomenItemRepository;

@RestController
public class MenController {
	
	@Autowired
	private MenItemRepository repository;
	
	@Autowired
	private WomenItemRepository wrepository;

	@RequestMapping("/menitems")
	public Iterable<MenItems> getMen(){
		return repository.findAll();
	}
	
	
	@RequestMapping("/womenitems")
	public Iterable<WomenItem> getWomen(){
		return wrepository.findAll();
	}
	
}
