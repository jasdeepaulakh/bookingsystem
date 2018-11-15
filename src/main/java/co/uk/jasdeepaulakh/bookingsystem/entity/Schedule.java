package co.uk.jasdeepaulakh.bookingsystem.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(targetEntity = Employee.class)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name="start_datetime")
	private Date startDatetime;
	
	@Column(name="end_datetime")
	private Date endDatetime;
	
	public Schedule() {
		
	}

	public Schedule(Employee employee, Date startDatetime, Date endDatetime) {
		super();
		this.employee = employee;
		this.startDatetime = startDatetime;
		this.endDatetime = endDatetime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}

	public Date getEndDatetime() {
		return endDatetime;
	}

	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}
	
	

}
