package com.jmejiamu.backend.web;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmejiamu.backend.configuration.SecurityConfiguration;
import com.jmejiamu.backend.domain.CarouseRepository;
import com.jmejiamu.backend.domain.Carousel;
import com.jmejiamu.backend.domain.Cart;
import com.jmejiamu.backend.domain.CartRepository;
import com.jmejiamu.backend.domain.ElectronicItems;
import com.jmejiamu.backend.domain.ElectronicRepository;
import com.jmejiamu.backend.domain.GeneralHttpResponse;
import com.jmejiamu.backend.domain.MenItemRepository;
import com.jmejiamu.backend.domain.MenItems;
import com.jmejiamu.backend.domain.MenWallet;
import com.jmejiamu.backend.domain.MenWalletRepository;
import com.jmejiamu.backend.domain.MensHat;
import com.jmejiamu.backend.domain.MensHatsRepository;
import com.jmejiamu.backend.domain.Mentshirt;
import com.jmejiamu.backend.domain.MentshirtRepository;
import com.jmejiamu.backend.domain.New;
import com.jmejiamu.backend.domain.NewRepository;
import com.jmejiamu.backend.domain.Popular;
import com.jmejiamu.backend.domain.PopularRepository;
import com.jmejiamu.backend.domain.RegisterRepository;
import com.jmejiamu.backend.domain.RegisterUser;
import com.jmejiamu.backend.domain.Watch;
import com.jmejiamu.backend.domain.WatchRepository;
import com.jmejiamu.backend.domain.WomenItem;
import com.jmejiamu.backend.domain.WomenItemRepository;

@RestController
public class HomeController {
	
	// This allows me to print things in the console
	private Logger LOGGER = LoggerFactory.getLogger(getClass());
	
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
	
	@Autowired
	private MensHatsRepository mensHRepository;
	
	@Autowired
	private MentshirtRepository mensTshirRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	private RegisterRepository registerRepository;
	
	@Autowired
	private SecurityConfiguration bCryptPasswordEncoder;
	
	
	@Autowired
	public HomeController(RegisterRepository registerRepository) {
		super();
		this.registerRepository = registerRepository;
	}


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
	
	/*
	 * @return hats item data
	 * 
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/men-hats")
	public Iterable <MensHat> getMenHats(){
		return mensHRepository.findAll();
	}
	
	/*
	 * @return t-shirt item data
	 * 
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/men-tshirt")
	public Iterable <Mentshirt> getMenTshirt(){
		return mensTshirRepository.findAll();
	}
	
	/*
	 * @return cart item data
	 * 
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/cart")
	public Iterable <Cart> getCart(){
		return cartRepository.findAll();
	}
	
	@PostMapping("/newuser")
	public ResponseEntity<GeneralHttpResponse> newUser(@RequestBody RegisterUser newUser) {
		String password = newUser.getPassword();
		LOGGER.info(password);
		String passwordEncode = bCryptPasswordEncoder.passwordEncoder().encode(password);
		newUser.setPassword(passwordEncode);
		GeneralHttpResponse generalHttpResponse =  new GeneralHttpResponse(new Date(), 200, HttpStatus.OK, "ssss", "awaddw");
		
		registerRepository.save(newUser);
		return new ResponseEntity<>(generalHttpResponse, HttpStatus.OK);
	}
	
	
}
