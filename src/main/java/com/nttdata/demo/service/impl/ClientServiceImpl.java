package com.nttdata.demo.service.impl;

import org.springframework.stereotype.Service;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.dto.responses.ClientResponseDto;
import com.nttdata.demo.repository.IClientRepository;
import com.nttdata.demo.service.IClientService;
import com.nttdata.demo.validator.ValidatorClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService{
	
	private IClientRepository iClientRepository;
	
	@Override
	public ClientResponseDto findClient(ClientRequestDto clientRequestDto) {
		ValidatorClient.validateNullField(clientRequestDto);
		return iClientRepository.findClient(clientRequestDto);
	}

}
