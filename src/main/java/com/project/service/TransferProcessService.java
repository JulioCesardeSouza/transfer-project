package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.RequestTransferDTO;
import com.project.dto.ResponseTransferDTO;
import com.project.repository.TransferRepository;

@Service
public class TransferProcessService {
	
	@Autowired
	private TransferRepository transferRepository;
	
	public ResponseTransferDTO criaTransferencia(RequestTransferDTO transferDTO) {
		//transferRepository.save(transfer);
		return null;
	}
	

}
