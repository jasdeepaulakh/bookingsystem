package co.uk.jasdeepaulakh.bookingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="client_name")
	private String clientName;
	
	@Column(name="client_email")
	private String clientEmail;
	
	@Column(name="client_phone")
	private String clientPhone;
	
	
	public Client() {
	}

	public Client(String clientName, String clientEmail, String clientPhone) {
		super();
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.clientPhone = clientPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}
	
	
	
	

}
