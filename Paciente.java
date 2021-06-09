package br.com.generation.poo;
/*
 * Projeto: Estudo de Objetos: Classe Paciente
 * Aluna: D�lis Edwirges
 * Data: 08/06/2021
 */
public class Paciente {

		// atributos

		private String nome;
		private String cpf;
		private String idade;
		private String g�nero;
		private String tcelular;
		private String email;
		private String diagnostico;
		private String ala;
		private String quarto;
		private String endere�o;
		
		//metodos
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getIdade() {
			return idade;
		}
		public void setIdade(String idade) {
			this.idade = idade;
		}
		public String getG�nero() {
			return g�nero;
		}
		public void setG�nero(String g�nero) {
			this.g�nero = g�nero;
		}
		public String getTcelular() {
			return tcelular;
		}
		public void setTcelular(String celular) {
			this.tcelular = celular;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String celular) {
			this.email = celular;
		}
		public String getDiagnostico() {
			return diagnostico;
		}
		public void setDiagnostico(String diagnostico) {
			this.diagnostico = diagnostico;
		}
		public String getQuarto() {
			return quarto;
		}
		public void setQuarto(String quarto) {
			this.quarto = quarto;
		}
		public String getAla() {
			return ala;
		}
		public void setAla(String ala) {
			this.ala = ala;
		}
		public String getEndere�o() {
			return endere�o;
		}
		public void setEndere�o(String endere�o) {
			this.endere�o = endere�o;
		}
		public String getHospital() {
			return hospital;
		}
		public void setHospital(String hospital) {
			this.hospital = hospital;
		}
		private String hospital;
		
		public void Impressao() {
			System.out.println("\t===========Prontu�rio de Paciente===========\n"
					+ "\n\tNome: " + nome + "\n\tCPF: " + cpf + "\n\tIdade: " + idade
					+ "\n\tG�nero: " + g�nero + "\n\tTelefone Celular: " + tcelular 
					+ "\n\tE.mail: " + email + "\n\tDiagn�stico: " + diagnostico 
					+ "\n\tAla: " + ala + "\n\tQuarto: " + quarto 
					+ "\n\tEndere�o: " + endere�o); 
		}
}
