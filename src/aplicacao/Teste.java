package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Filme;
import entidade.Serie;
import entidade.Documentario;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int opcao = 0;
		
		List<Filme> filme = new ArrayList<>();
		List<Serie> serie = new ArrayList<>();
		List<Documentario> documentario = new ArrayList<>();

		do {
			
			System.out.println("------------------------------------------------------------");
			System.out.println("Bem vindo ao catalogo de programas de entretenimento");
			System.out.println("------------------------------------------------------------");

			System.out.println("Insira ao 2 filmes, 2 series e 2 documentarios");
			System.out.println("------------------------------------------------------------");

			System.out.println("Pressione 1 para adicionar um filme");
			System.out.println("Pressione 2 para adicionar uma serie");
			System.out.println("Pressione 3 para adicionar um documentario");
			System.out.println("Pressione 4 para visualizar os programas adicionados");
			System.out.println("Pressione 5 para sair");
			System.out.println();
			System.out.println("------------------------------------------------------------");

			opcao = sc.nextInt();
			switch (opcao){
			
			case 1: {
				
				System.out.println("Quantos filmes deseja adicionar? ");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.print("Digite o nome do filme:");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Digite a categoria do filme:");
					String categoria = sc.nextLine();
					System.out.print("Digite os personagens principais do filme:");
					String personagensPrincipais = sc.nextLine();
					System.out.print("Digite a faixa etaria do filme:");
					int faixaEtaria = sc.nextInt();
					System.out.print("Digite a classificação do filme: ");
					sc.nextLine();
					String classificacao = sc.nextLine();
					System.out.print("Digite a nota de classificação do filme: ");
					double notaClassificacao = sc.nextDouble();
					System.out.print("Digite a duracao do filme: ");
					sc.nextLine();
					String duracao = sc.nextLine();
					System.out.print("Digite a produtora do filme: ");
					String produtora = sc.nextLine();
					System.out.print("Digite o patrocinador do filme: ");
					String patrocinadora = sc.nextLine();
					System.out.println();
		


					Filme filmes = new Filme(nome, categoria, personagensPrincipais, faixaEtaria, classificacao,
							notaClassificacao, duracao, produtora, patrocinadora);
					
					System.out.print("De acordo com a nota do filme ele é classificado como: ");
					filmes.classificarPrograma(notaClassificacao);
					filme.add(filmes);
				}
			break;
			}
			case 2: {
				System.out.print("Quantas series deseja adicionar:  ");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.print("Digite o nome da serie: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Digite a categoria da serie: ");
					String categoria = sc.nextLine();
					System.out.print("Digite os personagens principais da serie: ");
					String personagensPrincipais = sc.nextLine();
					System.out.print("Digite a faixa etaria da serie: ");
					int faixaEtaria = sc.nextInt();
					System.out.print("Digite a classificação da serie: ");
					sc.nextLine();
					String classificacao = sc.nextLine();
					System.out.print("Digite a nota de classificação da serie: ");
					double notaClassificacao = sc.nextDouble();
					System.out.print("Digite a duração da serie: ");
					sc.nextLine();
					String duracao = sc.nextLine();
					System.out.print("Digite o numero de temporadas: ");
					int numTemporadas = sc.nextInt();
					System.out.println("Digite o numero de episodios por temporada: ");
					int qntEpisodioPorTemporada = sc.nextInt();
					System.out.println();
					

					Serie series = new Serie(nome, categoria, personagensPrincipais, faixaEtaria, classificacao,
							notaClassificacao, duracao, numTemporadas, qntEpisodioPorTemporada);
					
					System.out.print("De acordo com a nota da série ela é classificado como: ");
					series.classificarPrograma(notaClassificacao);
					
					serie.add(series);
				}
				break;
			}
			
			case 3: {
				System.out.print("Quantos documentarios deseja adicionar: ");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.print("Digite o nome do documentario: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Digite a categoria do documentario: ");
					String categoria = sc.nextLine();
					System.out.print("Digite os personagens principais do documentario: ");
					String personagensPrincipais = sc.nextLine();
					System.out.print("Digite a faixa etaria do documentario: ");
					int faixaEtaria = sc.nextInt();
					System.out.print("Digite a classificação do documentario: ");
					sc.nextLine();
					String classificacao = sc.nextLine();
					System.out.print("Digite a nota de classificação do documentario: ");
					double notaClassificacao = sc.nextDouble();
					System.out.print("Digite a duração do documentario: ");
					sc.nextLine();
					String duracao = sc.nextLine();
					System.out.print("Digite o nome do narrador do documentario: ");
					String narrador = sc.nextLine();
					System.out.println();
					

					Documentario documentarios = new Documentario(nome, categoria, personagensPrincipais, faixaEtaria,
							classificacao, notaClassificacao, duracao, narrador);
					
					System.out.print("De acordo com a nota do documentario ele é classificado como: ");
					documentarios.classificarPrograma(notaClassificacao);
					
					documentario.add(documentarios);
				}
				break;
			}
			
			case 4: {
				System.out.println("Veja abaixo a lista dos conteudos adicionados no catalago");
				System.out.println("------------------------------------------------------------");
				System.out.println("LISTA DE FILMES:");
				System.out.println();
				for(Filme filmes : filme) {
				System.out.println(filmes);
				}
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.println();
				System.out.println("LISTA DE SERIES:");
				System.out.println();
				for(Serie series : serie) {
				System.out.println(series);
				}
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.println();
				System.out.println("LISTA DE DOCUMENTARIOS");
				System.out.println();
				for(Documentario documentarios : documentario) {
				System.out.println(documentarios);
				}
				System.out.println();
				
					break;
			}
			}
			
		}while(opcao != 5);
		System.out.println("Programa Finalizado!");

		sc.close();
	}

}
