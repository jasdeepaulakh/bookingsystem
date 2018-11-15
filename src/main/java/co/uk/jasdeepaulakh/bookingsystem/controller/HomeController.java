package co.uk.jasdeepaulakh.bookingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.uk.jasdeepaulakh.bookingsystem.entity.Client;
import co.uk.jasdeepaulakh.bookingsystem.repository.ClientRepository;

@Controller
public class HomeController {
	
	@Autowired
	ClientRepository clientRepository;
	
	@RequestMapping(value="/")
	public String index(Model model) {
		List<Client> clientList = (List<Client>) clientRepository.findAll();
		model.addAttribute("clientList", clientList);
		return "index";
	}

}
