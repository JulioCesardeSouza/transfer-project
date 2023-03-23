package com.project.enuns;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.dto.RequestTransferDTO;
import com.project.model.Transfer;
import com.project.service.CalculateTaxTransfer;

public enum TypeTaxEnum {
	@Autowired
	private CalculateTaxTransfer calculateTaxTransfer;
	
	private boolean deveAplicarPara(Long dias) {
		return calculateTaxTransfer.deveAplicarPara(dias);
		
	}
	private Transfer executaCalculo(Long dias,RequestTransferDTO transfer) {
		return calculateTaxTransfer.executaCalculo(dias, transfer);
	}
	public static Transfer calculateTaxTransfer(Long dias,RequestTransferDTO transfer) {
		return Arrays.stream(TypeTaxEnum.values())
				.filter(t -> t.deveAplicarPara(dias))
				.findFirst()
				.map(i -> i.executaCalculo(dias, transfer))
				.orElseThrow(() -> new RuntimeException("calculo de taxa nao encontada"))
	}

}
