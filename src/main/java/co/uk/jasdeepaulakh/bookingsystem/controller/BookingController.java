package co.uk.jasdeepaulakh.bookingsystem.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.uk.jasdeepaulakh.bookingsystem.entity.Appointment;
import co.uk.jasdeepaulakh.bookingsystem.repository.AppointmentRepository;

@Controller
public class BookingController {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@PostMapping(value="/book")
	public Appointment addAppointment(@RequestBody Map<String,String> body) {
		Date date = new Date();
		Timestamp dateCreated = new Timestamp(date.getTime());
		Integer clientId = Integer.getInteger(body.get("client_id"));
		int employeeCreated = 1; 
		double priceFull = Double.parseDouble(body.get("price"));
		boolean cancelled = false;
		String cancellationReason = "";
		Timestamp startDatetime = Timestamp.valueOf(body.get("start_datetime"));
		Timestamp endDatetime = Timestamp.valueOf(body.get("end_datetime"));
		return appointmentRepository.save(new Appointment(dateCreated, employeeCreated, clientId, startDatetime, endDatetime, priceFull, cancelled, cancellationReason));
		
	}


	
}
