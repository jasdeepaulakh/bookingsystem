package co.uk.jasdeepaulakh.bookingsystem.controller;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import co.uk.jasdeepaulakh.bookingsystem.entity.Client;
import co.uk.jasdeepaulakh.bookingsystem.repository.ClientRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ClientControllerTest {
	
	//https://www.baeldung.com/spring-boot-testing
	
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	ClientRepository clientRepository;

	@Test
	public void givenClient_whenSave_thenGetOk() {
		Client client = new Client("Jasdeep", "jasdeepaulakh@gmail.com", "01234");
		entityManager.persist(client);
		entityManager.flush();
		
		Optional<Client> client2 = clientRepository.findById(1);
		assertEquals("Jasdeep", client2.get().getClientName());
	}

	

}
