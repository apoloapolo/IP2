package br.ufrpe.habitact.negocio.beans;

import java.time.LocalDateTime;

public class Exercicio {
	private TipoExercicio nome;
	private LocalDateTime horarioInicio;
	private double duracao;
	
	public Exercicio(TipoExercicio nome, LocalDateTime horarioInicio, double duracao) {
		this.nome = nome;
		this.horarioInicio = horarioInicio;
		this.duracao = duracao;
	}
	
	
	
	
	
	
}
