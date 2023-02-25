package com.BikkatIt.UserManagementApp.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer password;
	
	private String FirstName;
	
	private String LastName;
	
	private String Email;
	
	private long PhoneNo;
	
	private Date Dob;
	
	private String Gender ;
	
	private String Country;
	
	private String State;
	
	private String City;
}
