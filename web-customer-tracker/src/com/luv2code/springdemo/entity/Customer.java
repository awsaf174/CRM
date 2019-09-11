package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Pattern(regexp="^[a-zA-Z]$", message="please only enter alphabets")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name = "first_name")
	private String firstName;
	
	@Pattern(regexp="^[a-zA-Z]$", message="please only enter alphabets")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull(message="is required")
	//@Size(min=1, message="is required")
	@Email(message="not a valid email address")
	@Column(name = "email")
	private String email;
	
	private String address;
	
	private int number;
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
}
