package com.nttdata.demo.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientRequestDto implements Serializable{
	
	private static final long serialVersionUID = 569664274092759641L;

	private String documentType;
	
	private String documentNumber;
}
