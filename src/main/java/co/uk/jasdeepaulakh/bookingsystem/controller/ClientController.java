package co.uk.jasdeepaulakh.bookingsystem.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.uk.jasdeepaulakh.bookingsystem.entity.Client;
import co.uk.jasdeepaulakh.bookingsystem.repository.ClientRepository;

@Controller
public class ClientController {
	
	@Autowired
	ClientRepository clientRepository;
	
	@PostMapping("/client")
	public Client addClient(@RequestBody Map<String,String> body) {
		String name = body.get("name");
		String email = body.get("email");
		String phone = body.get("phone");
		return clientRepository.save(new Client(name, email, phone));
	}
	
	@GetMapping("/client")
	public String addClient() {
		return "index";
	}

}
