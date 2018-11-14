package co.uk.jasdeepaulakh.bookingsystem.entity;

import java.sql.Timestamp;

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
	
	@OneToOne
	@JoinColumn(name="employee_created")
	private int employeeCreated;
	
	@OneToOne
	@JoinColumn(name="client_id")
	private int clientId;
	
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

	public Appointment(Timestamp dateCreated, int employeeCreated, int clientId, Timestamp startDatetime,
			Timestamp endDatetime, double priceFull, boolean cancelled, String cancellationReason) {
		super();
		this.dateCreated = dateCreated;
		this.employeeCreated = employeeCreated;
		this.clientId = clientId;
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

	public int getEmployeeCreated() {
		return employeeCreated;
	}

	public void setEmployeeCreated(int employeeCreated) {
		this.employeeCreated = employeeCreated;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
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
