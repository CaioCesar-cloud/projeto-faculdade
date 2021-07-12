package entidade;

public class Filme extends ProgramaEntretenimento {

	private String produtora;
	private String patrocinadora;

		
	public Filme(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria, String classificacao,
			Double notaClassificacao, String duracao, String produtora, String patrocinadora) {
		super(nome, categoria, personagensPrincipais, faixaEtaria, classificacao, notaClassificacao, duracao);
		this.produtora = produtora;
		this.patrocinadora = patrocinadora;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getPatrocinadora() {
		return patrocinadora;
	}

	public void setPatrocinadora(String patrocinadora) {
		this.patrocinadora = patrocinadora;
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

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCategoria: " + categoria + "\nPersonagens Principais: " + personagensPrincipais
				+ "\nFaixa Etaria: " + faixaEtaria + "\nClassificação: " + classificacao + "\nNota de Classificação: "
				+ notaClassificacao + "\nDuração: " + duracao + "\nProdutora: " + produtora + "\nPatrocinadora: "
				+ patrocinadora + "\n";
	}

}
