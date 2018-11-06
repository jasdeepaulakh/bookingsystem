package co.uk.jasdeepaulakh.bookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String index(@RequestParam(value="name", defaultValue="User") String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}

}
