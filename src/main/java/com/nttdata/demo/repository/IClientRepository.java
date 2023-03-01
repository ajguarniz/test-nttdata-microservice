package com.nttdata.demo.repository;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.dto.responses.ClientResponseDto;

public interface IClientRepository {
	ClientResponseDto findClient(ClientRequestDto clientRequestDto);
}
