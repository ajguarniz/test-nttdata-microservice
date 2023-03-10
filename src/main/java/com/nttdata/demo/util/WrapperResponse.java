package com.nttdata.demo.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WrapperResponse<T> { 
	
	private boolean ok;

	private String message;
	
	private Integer code;

	private T body;
	
	public ResponseEntity<WrapperResponse<T>> createResponse(HttpStatus status) {
		return new ResponseEntity<WrapperResponse<T>>(this, status);
	}
}
