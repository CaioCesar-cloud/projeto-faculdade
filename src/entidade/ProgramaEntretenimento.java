package entidade;

public class ProgramaEntretenimento {

	public String nome;
	public String categoria;
	public String personagensPrincipais;
	public Integer faixaEtaria;
	public String classificacao;
	public Double notaClassificacao;
	public String duracao;


	public ProgramaEntretenimento(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria,
			String classificacao, Double notaClassificacao, String duracao) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.personagensPrincipais = personagensPrincipais;
		this.faixaEtaria = faixaEtaria;
		this.classificacao = classificacao;
		this.notaClassificacao = notaClassificacao;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPersonagensPrincipais() {
		return personagensPrincipais;
	}

	public void setPersonagensPrincipais(String personagensPrincipais) {
		this.personagensPrincipais = personagensPrincipais;
	}

	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(Integer faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Double getNotaClassificacao() {
		return notaClassificacao;
	}

	public void setNotaClassificacao(Double notaClassificacao) {
		this.notaClassificacao = notaClassificacao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
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
		return "Nome: " + nome + "\nCategoria: " + categoria + "\nPersonagens Principais: " + personagensPrincipais + "\nFaixa Etaria: " + faixaEtaria +
				"\nClassificação: " + classificacao + "\nNota de Classificação: " + notaClassificacao + "\nDuração: " + duracao; 
	}

}
