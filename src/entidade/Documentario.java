package entidade;

public class Documentario extends ProgramaEntretenimento {

	private String narrador;

	public Documentario(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria,
			String classificacao, Double notaClassificacao, String duracao, String narrador) {
		super(nome, categoria, personagensPrincipais, faixaEtaria, classificacao, notaClassificacao, duracao);
		this.narrador = narrador;
	}

	public String getNarrador() {
		return narrador;
	}

	public void setNarrador(String narrador) {
		this.narrador = narrador;
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
				+ notaClassificacao + "\nDuração: " + duracao + "\n";
	}
}
