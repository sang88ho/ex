package sogang.ip.ex.exchange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exchange")
public class ExchangeController {
	
	@Autowired
	private ExchangeRepository repository;
	
	@RequestMapping(value="/get")
	public @ResponseBody List<Exchange> get() {
		List<Exchange> exchanges = repository.findAll();
		
		System.out.println("print!");
		for (Exchange exchange : exchanges) {
			System.out.println(exchange.getId());
		}
		
		return exchanges;
	}

}
