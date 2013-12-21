package sogang.ip.ex.mypage;

import java.security.Principal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sogang.ip.ex.account.Account;
import sogang.ip.ex.account.AccountRepository;

@Controller
public class MypageController {

	@Autowired
	private AccountRepository accountRepository;
	
	@RequestMapping(value="/mypage", method=RequestMethod.GET)
	public String signin(Principal principal, Map<String, Object> map) {
		Account account = accountRepository.findByUsername(principal.getName());
		map.put("lastName", account.getLastName());
		map.put("firstName", account.getFirstName());
		
		return "/account/mypage";
	}
}
