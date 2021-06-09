package br.com.generation.poo;
import java.util.Scanner;
/*
 * Projeto: Estudo de Objetos: Classe Cliente - Folha de Teste e Impressão
 * Aluna: Délis Edwirges
 * Data: 08/06/2021
 */
public class TestaCliente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cliente cli1 = new Cliente();
	
		
		System.out.println("Digite o Nome: ");
		cli1.setNome(scan.nextLine());
		
		System.out.println("Digite o CPF: ");
		cli1.setCpf(scan.nextLine());
		
		System.out.println("Digite o Endereço: ");
		cli1.setEndereço(scan.nextLine());
		
		System.out.println("Digite o Gênero:");
		cli1.setGênero(scan.nextLine()); 
		
		System.out.println("Digite o Telefone Celular:");
		cli1.setCelular(scan.nextLine());
		
		System.out.println("Digite a Idade:");
		cli1.setIdade(scan.nextLine());
		
		System.out.println("Cliente: " + cli1.getNome());
		System.out.println("CPF: " + cli1.getCpf());
		System.out.println("Gênero: " + cli1.getGênero());
		System.out.println("Idade: " + cli1.getIdade());
		System.out.println("Telefone Celular: " + cli1.getCelular());
		System.out.println("Endereço: " + cli1.getEndereço());

	}

	
	
}
