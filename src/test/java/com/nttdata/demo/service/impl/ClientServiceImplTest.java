package com.nttdata.demo.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.dto.responses.ClientResponseDto;
import com.nttdata.demo.repository.IClientRepository;

@ExtendWith(MockitoExtension.class)
class ClientServiceImplTest {
	
	@InjectMocks
	ClientServiceImpl iClientServiceImpl;
	
	@Mock
	IClientRepository iClientRepository;
	
	ClientRequestDto clientRequestDto;
	
	ClientResponseDto clientResponseDto;
	
	@BeforeEach
	void setUp() {
		clientRequestDto = ClientRequestDto.builder().documentType("C").documentNumber("23445322").build();
		clientResponseDto = ClientResponseDto.builder().build();
	}
	
	@Test
	void testFindClient() {
		when(iClientRepository.findClient(clientRequestDto)).thenReturn(clientResponseDto);
        assertNotNull(iClientServiceImpl.findClient(clientRequestDto));
        assertEquals("C", clientRequestDto.getDocumentType());
        //assertEquals("23445322", clientRequestDto.getDocumentNumber());
	}
}
