package entidade;

public class Serie extends ProgramaEntretenimento {

	private Integer numTemporadas;
	private Integer qntEpisodioPorTemporada;

	public Serie(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria, String classificacao,
			Double notaClassificacao, String duracao, Integer numTemporadas, Integer qntEpisodioPorTemporada) {
		super(nome, categoria, personagensPrincipais, faixaEtaria, classificacao, notaClassificacao, duracao);
		this.numTemporadas = numTemporadas;
		this.qntEpisodioPorTemporada = qntEpisodioPorTemporada;
	}

	public Integer getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(Integer numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public Integer getQntEpisodioPorTemporada() {
		return qntEpisodioPorTemporada;
	}

	public void setQntEpisodioPorTemporada(Integer qntEpisodioPorTemporada) {
		this.qntEpisodioPorTemporada = qntEpisodioPorTemporada;
	}

	public void classificarPrograma(double notaClassificacao) {
		if (notaClassificacao <= 4) {
			System.out.println("Ruim");
		} else if (notaClassificacao > 4 && notaClassificacao < 8) {
			System.out.println("Bom");
		} else if (notaClassificacao >= 8) {
			System.out.println("Otimo");
		}
	}

	public int calculaEpisodios() {
		return numTemporadas * qntEpisodioPorTemporada;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCategoria: " + categoria + "\nPersonagens Principais: " + personagensPrincipais
				+ "\nFaixa Etaria: " + faixaEtaria + "\nClassificação: " + classificacao + "\nNota de Classificação: "
				+ notaClassificacao + "\nDuração: " + duracao + "\n";
	}
}
