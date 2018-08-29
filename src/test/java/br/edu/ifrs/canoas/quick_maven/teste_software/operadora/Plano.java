package br.edu.ifrs.canoas.quick_maven.teste_software.operadora;

import java.util.ArrayList;

public class Plano {
	private int tipo;
	private double valor;
	
	private ArrayList<Servico> servicos;
	private double taxa;
	
	public Plano(int tipo) {
		this.servicos = new ArrayList<>();
		this.tipo = tipo;
		if (tipo == 1) {
			this.taxa = 1.2;
		}else {
			this.taxa = 1; 
		}
		Servico mensagemDeTexto = new MensagemDeTexto(taxa);
		Servico ligacoes= new Ligacoes(taxa);
		servicos.add(mensagemDeTexto);
		servicos.add(ligacoes);
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		double total = 0;
		for (Servico servico : servicos) {
			total += servico.getValor();
		}
		return total;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ArrayList<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
}
