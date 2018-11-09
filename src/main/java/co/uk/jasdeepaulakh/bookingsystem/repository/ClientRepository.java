package co.uk.jasdeepaulakh.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.uk.jasdeepaulakh.bookingsystem.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
	

}
