package com.nttdata.demo.api.rest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.dto.responses.ClientResponseDto;
import com.nttdata.demo.service.IClientService;
import com.nttdata.demo.util.WrapperResponse;

@ExtendWith(MockitoExtension.class)
class ClientApiRestTest {
	
	@InjectMocks
	ClientApiRest clientApiRest;
	
	@Mock
	IClientService iClientService;

	ClientRequestDto clientRequestDto;
	
	ClientResponseDto clientResponseDto;
	
	@BeforeEach
	void setUp() {
		clientRequestDto = ClientRequestDto.builder().documentType("C").documentNumber("23445322").build();
		clientResponseDto = ClientResponseDto.builder().build();
	}

	@Test
	void testGetClient() {
		when(iClientService.findClient(clientRequestDto)).thenReturn(clientResponseDto);
		
		ResponseEntity<WrapperResponse<ClientResponseDto>> response = clientApiRest.getClient(clientRequestDto);
		assertNotNull(response);
	}
}
