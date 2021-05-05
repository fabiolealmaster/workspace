
public enum DiaSemana {

	
		SEGUNDA("Segunda-feira"),
		TER�A("Ter�a-feira"),
		QUARTA("Quarta-feira"),
		QUINTA("Quinta-feira"),
		SEXTA("Sexta-feira"),
		S�BADO("S�bado"),
		DOMINGO("Domingo");
	private String descricao;

	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
