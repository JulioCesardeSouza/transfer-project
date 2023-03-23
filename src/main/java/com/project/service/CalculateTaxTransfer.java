package com.project.service;

import com.project.dto.RequestTransferDTO;
import com.project.model.Transfer;

public interface CalculateTaxTransfer {
	
	public boolean deveAplicarPara(Long dias);
	public Transfer executaCalculo(Long dias,RequestTransferDTO transfer);

}
