package br.ufrpe.habitact.negocio.beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario {
	private String genero;
	private double peso;
	private double altura;
	private double imc;
	private boolean jaFazExercicio;
	private ArrayList<Exercicio> exercicios;

	public Cliente(String nome, String email, String senha, LocalDate dtNascimento, String genero, double peso,
			double altura, boolean jaFazExercicio) {
		super(nome, email, senha, dtNascimento);
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.jaFazExercicio = jaFazExercicio;
		if (this.jaFazExercicio) {
			this.exercicios = new ArrayList<>();
		}
		this.calcularIMC(peso, altura);
	}

	private void calcularIMC(double peso, double altura) {
		this.imc = peso / (altura * altura);
	}
	
	private int calcularIdade(LocalDate dtNascimento) {
		return 0;
	}
	
	public double beberAgua(double peso) {
		return this.peso * 0.05;
	}
}
