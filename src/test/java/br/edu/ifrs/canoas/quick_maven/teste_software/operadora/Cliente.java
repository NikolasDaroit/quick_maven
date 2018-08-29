package br.edu.ifrs.canoas.quick_maven.teste_software.operadora;

import java.sql.Date;
import java.util.ArrayList;

public class Cliente {
	private int cpf;
	private String nome;
	private String endereco;
	private Date dataNasc;
	private Plano plano;
	private ArrayList<Fatura> faturas;
	private boolean hasCartaoPrePago;
	
	public Cliente(int cpf, String nome, String endereco, Date dataNasc) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.faturas = new ArrayList<>();

	}
	public void comprarCartaoPrePago() {
		this.hasCartaoPrePago = true;
	}
	public void habilitarPlano(int tipoPlano) {
		if (tipoPlano==1) {
			this.comprarCartaoPrePago();
		}
		this.plano = new Plano(tipoPlano);
	}
	public boolean gerarFatura(Date dataVencimento) {
		for (Fatura fatura : faturas) {
			if (fatura.getDataVenc().equals(dataVencimento)) {
				return false; 
			}
		}
		faturas.add(new Fatura(dataVencimento,  plano.getValor()));
		return true;

	}
	public boolean pagarFatura(Date dataVencimento, Date dataPagamento) {
		for (Fatura fatura : faturas) {
			if (fatura.getDataVenc().equals(dataVencimento)) {
				fatura.setDataPagamento(dataPagamento);
				return true; 
			}
		}
		return false;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	public ArrayList<Fatura> getFaturas() {
		return faturas;
	}
	public Fatura getFatura(Date dataVencimento) {
		for (Fatura fatura : faturas) {
			if (fatura.getDataVenc().equals(dataVencimento)) {
				return fatura;
			}
		}
		return null;
	}
	public void setFaturas(ArrayList<Fatura> faturas) {
		this.faturas = faturas;
	}
	public boolean hasCartaoPrePago() {
		return hasCartaoPrePago;
	}
	public void setHasCartaoPrePago(boolean hasCartaoPrePago) {
		this.hasCartaoPrePago = hasCartaoPrePago;
	}
	
}
