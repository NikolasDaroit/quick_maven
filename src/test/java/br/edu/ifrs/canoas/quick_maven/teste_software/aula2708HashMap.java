package br.edu.ifrs.canoas.quick_maven.teste_software;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class aula2708HashMap {

	static HashMap<Integer, String> agenda;
	@BeforeEach
	void setUp() {
		 agenda = new HashMap<>();
	}
	@Test
	void hashMapPutShouldGet() {
		assertThat(agenda.get(1)).isNull();
		agenda.put(1, "Camile");
		assertThat(agenda.get(1)).isEqualToIgnoringCase("camile");
		
	}
	@Test
	void hashMapPutShouldOverride() {
		assertThat(agenda.get(1)).isNull();
		agenda.put(1, "Camile");
		assertThat(agenda.get(1)).isEqualToIgnoringCase("camile");
		agenda.put(1, "Jhony");
		assertThat(agenda.get(1)).isEqualToIgnoringCase("jhony");
		
	}
	@Test
	void hashMapClearShouldClear() {
		agenda.put(1, "Camile");
		agenda.put(2, "Jhony");
		agenda.clear();
		assertThat(agenda).hasSize(0);
	}
	@Test
	void hashMapNullAsKey() {
		agenda.put(null, "Camile");
		assertThat(agenda.get(null)).isEqualToIgnoringCase("camile");
		
	}
}
