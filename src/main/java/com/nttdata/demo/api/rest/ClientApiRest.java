package com.nttdata.demo.api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.demo.dto.request.ClientRequestDto;
import com.nttdata.demo.dto.responses.ClientResponseDto;
import com.nttdata.demo.service.IClientService;
import com.nttdata.demo.util.Constant;
import com.nttdata.demo.util.WrapperResponse;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = {Constant.ORIGINS})
@AllArgsConstructor
public class ClientApiRest {

	public IClientService iClientService;
	
	@PostMapping(path = Constant.MAPPING_GET_CLIENT_MC)
	public ResponseEntity<WrapperResponse<ClientResponseDto>> getClient(@RequestBody ClientRequestDto clientRequestDto) {
		return new WrapperResponse<ClientResponseDto>(true, Constant.SUCCESS, 200, iClientService.findClient(clientRequestDto)).createResponse(HttpStatus.OK);
	}
}
