package com.BikkatIt.UserManagementApp.PayLoad;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
	@NotEmpty
	@Size(min = 4, message = "UserFirstname Mustbe min of 4 Characters ")
	private String FirstName;

	@NotEmpty
	@Size(min = 4, message = "UserLastname Mustbe min of 4 Characters ")
	private String LastName;

	@Email
	private String Email;

	@NotEmpty
	@Size(max = 10, message = "UserPhoneNo Mustbe max of 10 Characters ")
	private long PhoneNo;

	@NotEmpty
	private Date Dob;
	
	@NotEmpty
	private String Gender;
	
	@NotEmpty
	private String Country;
	
	@NotEmpty
	private String State;
	
	@NotEmpty
	private String City;
}
