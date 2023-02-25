package com.BikkatIt.UserManagementApp.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

	private String messege;
	
	private boolean status;
}
