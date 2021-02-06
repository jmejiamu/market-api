package com.jmejiamu.backend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmejiamu.backend.domain.ElectronicItems;
import com.jmejiamu.backend.domain.ElectronicRepository;
import com.jmejiamu.backend.domain.MenItemRepository;
import com.jmejiamu.backend.domain.MenItems;
import com.jmejiamu.backend.domain.WomenItem;
import com.jmejiamu.backend.domain.WomenItemRepository;

@RestController
public class HomeController {
	
	@Autowired
	private MenItemRepository repository;
	
	@Autowired
	private WomenItemRepository wrepository;
	
	@Autowired
	private ElectronicRepository erepository;

	/*
	 * @return men item from the database
	 */
	
	@CrossOrigin( origins =  "http://localhost:3000")
	@GetMapping("/menitems")
	public Iterable<MenItems> getMen(){
		return repository.findAll();
	}
	
	
	/*
	 * @return women data
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/womenitems")
	public Iterable<WomenItem> getWomen(){
		return wrepository.findAll();
	}
	
	/*
	 * @return women data
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/electronic")
	public Iterable<ElectronicItems> getElectronic(){
		return erepository.findAll();
	}
	
	
}
