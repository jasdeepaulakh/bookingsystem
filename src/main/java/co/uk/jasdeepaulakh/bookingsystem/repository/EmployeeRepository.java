package co.uk.jasdeepaulakh.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.uk.jasdeepaulakh.bookingsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
