package com.nttdata.demo.repository.impl;

import org.springframework.stereotype.Component;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.dto.responses.ClientResponseDto;
import com.nttdata.demo.repository.IClientRepository;

@Component
public class ClientRepositoryImpl implements IClientRepository {

	@Override
	public ClientResponseDto findClient(ClientRequestDto clientRequestDto) {
		return ClientResponseDto.builder()
				.firstName("Anderson")
				.secondName("Julian")
				.firstLastName("Guarnizo")
				.secondLastName("Poloche")
				.telephone("6017313996")
				.address("Kr42a #45")
				.cityResidence("Bogota")
				.build();
	}
}
