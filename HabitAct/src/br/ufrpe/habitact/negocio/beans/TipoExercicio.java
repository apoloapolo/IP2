package br.ufrpe.habitact.negocio.beans;

public enum TipoExercicio {
	CAMINHADA ("Caminhada"), 
	CORRIDA ("Corrida"), 
	NATAÇÃO ("Natação"), 
	CICLISMO ("Ciclismo"), 
	MUSCULAÇÃO ("Musculação"), 
	ARTES_MARCIAIS ("Artes Marciais"), 
	TENIS_DE_MESA ("Tenis de Mesa"), 
	OUTROS ("");
	
    private String nome;

	TipoExercicio(String nome) {
        this.nome = nome;
    }
}
