package br.com.generation.poo;
import java.util.Scanner;
/*
 * Projeto: Estudo de Objetos: Classe Paciente - Folha de Teste e Impress�o
 * Aluna: D�lis Edwirges
 * Data: 08/06/2021
 */
public class TestaPaciente {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Paciente paci1 = new Paciente();
		paci1.setNome("Dandara Maria Lopes");
		paci1.setCpf("000.000.000-00");
		paci1.setIdade("34 anos");
		paci1.setG�nero("Feminino");
		paci1.setTcelular("149000-0000");
		paci1.setEmail("dandara_lopes@oemail.com");
		paci1.setDiagnostico("Doadora de Sangue");
		paci1.setAla("Ala 04");
		paci1.setQuarto("Ala 14");
		paci1.setEndere�o("Rio de Janeiro - RJ, \n\tRua de Janeiro n�1234");
		
		paci1.Impressao();
		System.out.println("\t=============================================");
		System.out.println("*Nome e dados f�cticios, qualquer semelhan�a � mera coincid�ncia.");
}
}
