package com.jmejiamu.backend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmejiamu.backend.domain.CarouseRepository;
import com.jmejiamu.backend.domain.Carousel;
import com.jmejiamu.backend.domain.ElectronicItems;
import com.jmejiamu.backend.domain.ElectronicRepository;
import com.jmejiamu.backend.domain.MenItemRepository;
import com.jmejiamu.backend.domain.MenItems;
import com.jmejiamu.backend.domain.MenWallet;
import com.jmejiamu.backend.domain.MenWalletRepository;
import com.jmejiamu.backend.domain.New;
import com.jmejiamu.backend.domain.NewRepository;
import com.jmejiamu.backend.domain.Popular;
import com.jmejiamu.backend.domain.PopularRepository;
import com.jmejiamu.backend.domain.Watch;
import com.jmejiamu.backend.domain.WatchRepository;
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
	
	@Autowired
	private CarouseRepository crepository;
	
	@Autowired
	private PopularRepository prepository;
	
	@Autowired
	private NewRepository nrepository;
	
	@Autowired
	private MenWalletRepository mwrepository;
	
	@Autowired
	private WatchRepository mwatchrepository;

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
	
	
	/*
	 * @return carousel data
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/carousel")
	public Iterable<Carousel> getCarousel(){
		return crepository.findAll();
	}
	
	/*
	 * @ return popular data
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/popular")
	public Iterable<Popular> getPopular(){
		return prepository.findAll();
	}
	
	/*
	 * @return new item data
	 * 
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/new")
	public Iterable <New> getNew(){
		return nrepository.findAll();
	}
	
	/*
	 * @return wallet item data
	 * 
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/men-wallet")
	public Iterable <MenWallet> getMenWallet(){
		return mwrepository.findAll();
	}
	
	/*
	 * @return watch item data
	 * 
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/men-watch")
	public Iterable <Watch> getMenWatch(){
		return mwatchrepository.findAll();
	}
}
