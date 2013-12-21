package sogang.ip.ex.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

	@Autowired
	private AccountRepository repository;
	
	@Autowired
	private ShaPasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/signin", method=RequestMethod.GET)
	public String signin() {
		return "/account/signin";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup() {
		return "/account/signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String registerUser(String username, String password, String lastName, String firstName) {
		Account account = new Account(username, passwordEncoder.encodePassword(password, username), lastName, firstName);
		repository.save(account);
		
		return "redirect:/signin";
	}
}
