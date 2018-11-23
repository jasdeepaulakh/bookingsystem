package co.uk.jasdeepaulakh.bookingsystem.controller;

import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.uk.jasdeepaulakh.bookingsystem.entity.Appointment;
import co.uk.jasdeepaulakh.bookingsystem.entity.Client;
import co.uk.jasdeepaulakh.bookingsystem.entity.Employee;
import co.uk.jasdeepaulakh.bookingsystem.repository.AppointmentRepository;
import co.uk.jasdeepaulakh.bookingsystem.repository.ClientRepository;
import co.uk.jasdeepaulakh.bookingsystem.repository.EmployeeRepository;

@Controller
public class BookingController {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	
	//@RequestBody Map<String,String> body
	@PostMapping(value="/book")
	public String addAppointment(@ModelAttribute Appointment appointment) {
		Date date = new Date();
		Timestamp dateCreated = new Timestamp(date.getTime());
		appointment.setDateCreated(dateCreated);
		appointment.setCancelled(false);
		appointment.setCancellationReason("");
		appointmentRepository.save(appointment);

//		Optional<Client> client = clientRepository.findById(Integer.parseInt(body.get("client_id")));
//		Optional<Employee> employee = employeeRepository.findById(Integer.parseInt(body.get("employee_id")));
//		Date date = new Date();
//		Timestamp dateCreated = new Timestamp(date.getTime());
//		double priceFull = Double.parseDouble(body.get("price"));
//		boolean cancelled = false;
//		String cancellationReason = "";
//		Timestamp startDatetime = Timestamp.valueOf(body.get("start_datetime"));
//		Timestamp endDatetime = Timestamp.valueOf(body.get("end_datetime"));
		return "book";
		
	}


	
}
