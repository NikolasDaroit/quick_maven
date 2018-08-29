package br.edu.ifrs.canoas.quick_maven.teste_software.operadora;

import java.sql.Date;

public class Fatura {
	private Date dataVenc;
	private Date dataPagamento;
	private double valor;
	public Fatura(Date dataVencimento, double valor) {
		this.dataVenc = dataVencimento;
		this.valor = valor;
	}
	public void lancarFaturaCartaoCredito() {
		
	}
	public void emitirBoleto() {
		
	}
	public void verificaAtrasoPagamento() {
		
	}
	public Date getDataVenc() {
		return dataVenc;
	}
	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
