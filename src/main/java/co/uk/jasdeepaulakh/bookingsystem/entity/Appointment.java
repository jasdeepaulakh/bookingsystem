package co.uk.jasdeepaulakh.bookingsystem.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="date_created")
	private Timestamp dateCreated;
	
	@OneToOne(targetEntity = Employee.class, cascade = {CascadeType.ALL})
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@OneToOne(targetEntity = Client.class, cascade = {CascadeType.ALL})
	@JoinColumn(name="client_id")
	private Client client;
	
	@Column(name="start_datetime")
	private Timestamp startDatetime;
	
	@Column(name="end_datetime")
	private Timestamp endDatetime;
	
	@Column(name="price_full")
	private double priceFull;
	
	@Column
	private boolean cancelled;
	
	@Column(name="cancellation_reason")
	private String cancellationReason;
	
	public Appointment() {
		
	}

	public Appointment(Timestamp dateCreated, Employee employee, Client client, Timestamp startDatetime,
			Timestamp endDatetime, double priceFull, boolean cancelled, String cancellationReason) {
		super();
		this.dateCreated = dateCreated;
		this.employee = employee;
		this.client = client;
		this.startDatetime = startDatetime;
		this.endDatetime = endDatetime;
		this.priceFull = priceFull;
		this.cancelled = cancelled;
		this.cancellationReason = cancellationReason;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Timestamp getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(Timestamp startDatetime) {
		this.startDatetime = startDatetime;
	}

	public Timestamp getEndDatetime() {
		return endDatetime;
	}

	public void setEndDatetime(Timestamp endDatetime) {
		this.endDatetime = endDatetime;
	}

	public double getPriceFull() {
		return priceFull;
	}

	public void setPriceFull(double priceFull) {
		this.priceFull = priceFull;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	
	
	
}
