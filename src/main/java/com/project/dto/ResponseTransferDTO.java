
package com.project.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ResponseTransferDTO {

	private BigDecimal valorDeTransferencia;
	private BigDecimal taxaDeTransferencia;
	private Integer contaPrincipal;
	private Integer contaDestino;
	private LocalDate dataTransferencia;
	private LocalDate dataAgendamento;

	public ResponseTransferDTO() {

	}

	public ResponseTransferDTO(BigDecimal valorDeTransferencia, BigDecimal taxaDeTransferencia, Integer contaPrincipal,
			Integer contaDestino, LocalDate dataTransferencia, LocalDate dataAgendamento) {

		this.valorDeTransferencia = valorDeTransferencia;
		this.taxaDeTransferencia = taxaDeTransferencia;

		this.contaPrincipal = contaPrincipal;
		this.contaDestino = contaDestino;
		this.dataTransferencia = dataTransferencia;
		this.dataAgendamento = dataAgendamento;
	}

	public BigDecimal getValorDeTransferencia() {
		return valorDeTransferencia;
	}

	public void setValorDeTransferencia(BigDecimal valorDeTransferencia) {
		this.valorDeTransferencia = valorDeTransferencia;
	}

	public BigDecimal getTaxaDeTransferencia() {
		return taxaDeTransferencia;
	}

	public void setTaxaDeTransferencia(BigDecimal taxaDeTransferencia) {
		this.taxaDeTransferencia = taxaDeTransferencia;
	}

	public Integer getContaPrincipal() {
		return contaPrincipal;
	}

	public void setContaPrincipal(Integer contaPrincipal) {
		this.contaPrincipal = contaPrincipal;
	}

	public Integer getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Integer contaDestino) {
		this.contaDestino = contaDestino;
	}

	public LocalDate getDataTransferencia() {
		return dataTransferencia;
	}

	public void setDataTransferencia(LocalDate dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}

	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

}
