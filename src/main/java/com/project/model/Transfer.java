package com.project.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_transfer")
public class Transfer implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal valorDeTransferencia;
	private BigDecimal taxaDeTransferencia;
	private Integer contaPrincipal;
	private Integer contaDestino;
	private LocalDate dataTransferencia;
	private LocalDate dataAgendamento;

	public Transfer() {

	}

	public Transfer(Long id, BigDecimal valorDeTransferencia, BigDecimal taxaDeTransferencia, Integer contaPrincipal,
			Integer contaDestino, LocalDate dataTransferencia, LocalDate dataAgendamento) {

		this.id = id;
		this.valorDeTransferencia = valorDeTransferencia;
		this.taxaDeTransferencia = taxaDeTransferencia;
		this.contaPrincipal = contaPrincipal;
		this.contaDestino = contaDestino;
		this.dataTransferencia = dataTransferencia;
		this.dataAgendamento = dataAgendamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
