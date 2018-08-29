package br.edu.ifrs.canoas.quick_maven.teste_software.operadora;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	Cliente cliente;
	
	@BeforeEach
	void setup() {
		 cliente = new Cliente(782394, "TestUser", "Rua", new Date(2001, 1, 1));
	}
	@Test
	void testClienteHabilitaPlano() {
		
		assertThat(cliente.getNome()).containsIgnoringCase("test");
		cliente.habilitarPlano(2);
		assertThat(cliente.getPlano().getTaxa()).isEqualByComparingTo((double) 1);
	}
	@SuppressWarnings("deprecation")
	@Test
	void testClienteGerarFatura() {
		cliente.habilitarPlano(2);
		cliente.gerarFatura(new Date(2001, 1, 1));
		double a = cliente.getFatura(new Date(2001, 1, 1)).getValor();
		assertThat(cliente.getFatura(new Date(2001, 1, 1))).isNotNull();
	}
	@Test
	void testValorFaturaPosPago() {
		cliente.habilitarPlano(2);
		cliente.gerarFatura(new Date(2001, 1, 1));
		double a = cliente.getFatura(new Date(2001, 1, 1)).getValor();

		assertThat(cliente.getFatura(new Date(2001, 1, 1)).getValor()).isEqualTo(2);
	}
	@Test
	void testValorFaturaPrePago() {
		cliente.habilitarPlano(1);
		cliente.gerarFatura(new Date(2001, 1, 1));
		assertThat(cliente.getFatura(new Date(2001, 1, 1)).getValor()).isEqualTo(2.4);
	}
	
	
}
