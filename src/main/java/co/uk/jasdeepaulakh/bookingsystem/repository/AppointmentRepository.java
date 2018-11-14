package co.uk.jasdeepaulakh.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.uk.jasdeepaulakh.bookingsystem.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
