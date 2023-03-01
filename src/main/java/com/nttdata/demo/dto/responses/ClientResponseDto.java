package com.nttdata.demo.dto.responses;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Nombre ClientResponseDto
 * @autor Anderson Guarnizo
 * @version 1.0
 * Fecha creación 26/01/2023.
 * Copyright Sysman Todos los derechos reservados.
 * Esta clase dto contiene una serie de atributos que pueden ser enviados o recuperados desde el servidor en una sola invocación
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponseDto implements Serializable {
	
	private static final long serialVersionUID = 4484519511379876060L;

	private String firstName;
	
	private String secondName;
	
	private String firstLastName;
	
	private String secondLastName;
	
	private String telephone;
	
	private String address;
	
	private String cityResidence;
}
