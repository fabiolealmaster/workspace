
public enum DiaSemana {

	
		SEGUNDA("Segunda-feira"),
		TERÇA("Terça-feira"),
		QUARTA("Quarta-feira"),
		QUINTA("Quinta-feira"),
		SEXTA("Sexta-feira"),
		SÁBADO("Sábado"),
		DOMINGO("Domingo");
	private String descricao;

	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
