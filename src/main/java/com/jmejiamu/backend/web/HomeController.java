package com.jmejiamu.backend.web;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
public class HomeController implements RegisterRepository {
	
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
		// Return true if the 2 password matches -  this is just a test
		boolean isPasswordMatch = bCryptPasswordEncoder.passwordEncoder().matches(password, passwordEncode);
		LOGGER.info("Password: " +  password + " Encoded: " + passwordEncode + " match :  " + isPasswordMatch);
		registerRepository.save(newUser);
		return new ResponseEntity<>(generalHttpResponse, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public void signIn(@RequestBody  String userEmail, String userPassword) {
//		String foundEmail =  login.getEmail();
//		
//		RegisterUser e = registerRepository.findByEmail(foundEmail.getEmail());
//		String em  = e.getEmail();
//		if (em.equals(userEmail)) {
//			LOGGER.info("true");
//		}else {
//			LOGGER.info("false");
//		}
//		System.out.println(userEmail);
//		System.out.println(userPassword);
//		System.out.println(foundEmail.getEmail());
//		return  registerRepository.findByEmail("jjj");
//		registerRepository.exists();
//		return new ResponseEntity<>(HttpStatus.OK);
		RegisterUser e = findByEmail(userEmail);
		String n = e.getFirstName();
		System.out.println(n);
	}


	@Override
	public List<RegisterUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<RegisterUser> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<RegisterUser> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends RegisterUser> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends RegisterUser> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteInBatch(Iterable<RegisterUser> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public RegisterUser getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends RegisterUser> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends RegisterUser> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<RegisterUser> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends RegisterUser> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<RegisterUser> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(RegisterUser entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends RegisterUser> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends RegisterUser> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends RegisterUser> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends RegisterUser> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public <S extends RegisterUser> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public RegisterUser findByEmail(String email) {
		// TODO Auto-generated method stub
		return registerRepository.findByEmail(email);
	}
	
	
}
