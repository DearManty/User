package com.BikkatIt.UserManagementApp.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value=ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceException(ResourceNotFoundException ex){
		String message = ex.getMessage();
		ApiResponse a=new ApiResponse();
		a.setMessege(message);
		a.setStatus(false);
		return new ResponseEntity<ApiResponse>(a,HttpStatus.NOT_FOUND);
		
	}
	
}
