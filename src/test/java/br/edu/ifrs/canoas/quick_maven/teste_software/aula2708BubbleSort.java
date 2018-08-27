package br.edu.ifrs.canoas.quick_maven.teste_software;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class aula2708BubbleSort {
	/*
	 * https://www.programcreek.com/java-api-examples/index.php?source_dir=adt.reference-master/tests/ie/lyit/adt/tests/algorithms/sorting/BubbleSortTests.java#
	 */
	private BubbleSort bb;
	
	
	@BeforeEach
	public void setup(){
		this.bb = new BubbleSort();
	}

	
	@Test
	void emptyArray() {
		int[] arr = {};
		this.bb.bubbleSortInt(arr);	
	}
	
}
