package com.nttdata.demo.validator;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.exception.GeneralServiceException;
import com.nttdata.demo.exception.ValidateServiceException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidatorClient {
	
	public static void validateNullField(ClientRequestDto clientRequestDto) {
		if(clientRequestDto.getDocumentType() == null || clientRequestDto.getDocumentType().trim().isEmpty()) {
			throw new ValidateServiceException("El tipo de documento es requerido");
		}
		else {
			validateSizeDocumentByType(clientRequestDto.getDocumentType());
		}
		if(clientRequestDto.getDocumentNumber() == null || clientRequestDto.getDocumentNumber().trim().isEmpty()) {
			throw new ValidateServiceException("El número de documento es requerido");
		} else {
			validateNumberDocument(clientRequestDto);
		}
	}
	
	public static void validateNumberDocument(ClientRequestDto clientRequestDto) {
		if(!clientRequestDto.getDocumentNumber().equals("23445322")) {
			throw new GeneralServiceException();
		}	
	}
	
	public static void validateSizeDocumentByType(String documentType) {
		switch (documentType) {
		case "C":
			log.info("Es cédula de ciudadanía");
			break;
		case "P":
			log.info("Es pasaporte");
			break;
		default:
			throw new ValidateServiceException("Son únicamente válidos los tipos de documento C y P");
		}
	}
	/*public static String validateSizeDocumentByType(String documentType) { lambda
		switch (documentType) {
			case "C" -> log.info("Es cédula de ciudadanía");
			case "P" -> log.info("Es pasaporte");
			default -> throw new ValidateServiceException("Son únicamente válidos los tipos de documento C y P");
		}
	} */
}
