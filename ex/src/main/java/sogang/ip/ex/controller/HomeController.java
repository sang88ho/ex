package sogang.ip.ex.controller;

import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sogang.ip.ex.exchange.ExchangeFinder;
import sogang.ip.ex.exchange.ExchangeRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	// 추가 //
	private ExchangeFinder finder;
	// 추가 //
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ExchangeRepository repository;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	
	
	public String home(Locale locale, Map<String, Object> map) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		//List<Exchange> exchanges = repository.findAll();
		
		//map.put("exchanges", exchanges);
		map.put("exchanges", finder.getList());
		
		return "/home";
	}
	
}
