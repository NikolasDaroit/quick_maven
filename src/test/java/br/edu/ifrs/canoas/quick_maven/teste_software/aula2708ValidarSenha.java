package br.edu.ifrs.canoas.quick_maven.teste_software;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class aula2708ValidarSenha {
	private String senhaForte = "OKSAiusa2367^&";
	private String senhaCurta = "OSai7^&";
	private String senhaAlta = "oksaiusa2367^&";
	private String senhaBaixa = "OKSAIUSA2367^&";
	private String senhaEspecial = "OKSAiusa23671q";
	
	
	@Test
	void senhaForte() {
		assertThat(validarSenha(senhaForte)).isFalse();
		// deve ter X ou mais caracteres, dois quais pelo menos Y sejam
		//números, ter um ou mais caracteres especiais, ter caracteres maiúsculos e minúsculos
	}
	@Test
	void senhaCurta() {
		assertThat(validarSenha(senhaCurta)).isFalse();
	}
	@Test
	void senhaAlta() {
		assertThat(validarSenha(senhaAlta)).isFalse();
	}@Test
	void senhaBaixa() {
		assertThat(validarSenha(senhaBaixa)).isFalse();
	}@Test
	void senhaEspecial() {
		assertThat(validarSenha(senhaEspecial)).isFalse();
	}
	
	

	private static boolean validarSenha(String str) {
	    char ch;
	    boolean capitalFlag = false;
	    boolean lowerCaseFlag = false;
	    boolean numberFlag = false;
	    boolean isAtLeast8 = str.length() >= 8;
	    boolean hasSpecial = !str.matches("[A-Za-z0-9 ]*");
	    
	    for(int i=0;i < str.length();i++) {
	        ch = str.charAt(i);
	        if( Character.isDigit(ch)) {
	            numberFlag = true;
	        }
	        else if (Character.isUpperCase(ch)) {
	            capitalFlag = true;
	        } else if (Character.isLowerCase(ch)) {
	            lowerCaseFlag = true;
	        }
	        if(numberFlag && capitalFlag && lowerCaseFlag && hasSpecial && isAtLeast8)
	            return true;
	    }
	    println("-------------------");
	    print("capital");  if (!capitalFlag) System.out.println(" X"); else println(" OK");
	    print("lowercase");  if (!lowerCaseFlag) System.out.println(" X"); else println(" OK");
	    print("number");  if (!numberFlag) System.out.println(" X"); else println(" OK");
	    print("special");  if (!hasSpecial) System.out.println(" X"); else println(" OK");
	    print("8+ characters");  if (!isAtLeast8) System.out.println(" X"); else println(" OK");
	    	
	    return false;
	}
	static void println(String s) {
		System.out.println(s);
	}
	static void print(String s) {
		System.out.print(s);
	}
}
