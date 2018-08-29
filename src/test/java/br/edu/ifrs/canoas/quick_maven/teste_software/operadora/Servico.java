package br.edu.ifrs.canoas.quick_maven.teste_software.operadora;

public abstract class Servico {
	protected boolean isAtivo=true;
	protected double valor;
	protected double taxa;
	
	public void cancelarServico() {
		
	}
	public void ativarServico() {
		
	}


	public abstract void operacao();
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
}
