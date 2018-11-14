package co.uk.jasdeepaulakh.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.uk.jasdeepaulakh.bookingsystem.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

}
