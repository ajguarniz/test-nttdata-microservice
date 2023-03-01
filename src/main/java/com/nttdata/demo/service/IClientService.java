package com.nttdata.demo.service;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.dto.responses.ClientResponseDto;

public interface IClientService {

	public ClientResponseDto findClient(ClientRequestDto clientRequestDto);
}
