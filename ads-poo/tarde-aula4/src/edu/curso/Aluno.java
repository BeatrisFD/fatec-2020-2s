package edu.curso;

public class Aluno {
	private String nome;
	public char caracter;
	
	public Aluno(String nome) { 
		System.out.println("Construindo uma inst�ncia do Aluno: " + nome);
		this.nome = nome;
	}
	
	public Aluno() {	
		this("an�nimo");
	}

}
