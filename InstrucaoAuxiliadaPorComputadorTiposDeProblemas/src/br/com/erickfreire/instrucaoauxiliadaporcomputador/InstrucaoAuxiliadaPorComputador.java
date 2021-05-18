package br.com.erickfreire.instrucaoauxiliadaporcomputador;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Programa em Java que ensina matemática
 * 
 * @author Erick Freire
 * @version 1 - Criado em 18-05-2021 as 15:23
 */

public class InstrucaoAuxiliadaPorComputador {
	public static double acertou = 0.0;
	public static double errou = 0.0;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		int operacao;
		SecureRandom numeroAleatorio = new SecureRandom();
		System.out.println("Programa que ajuda aprender Matemática");

		System.out.println("Informe a operação matemática: \n" 
		                  + "1 - Soma\n" 
				          + "2 - Subtração\n" 
		                  + "3 - Multiplicação\n"
		                  + "4 - Divisão\n"
		                  + "5 - Aleatório");
		operacao = entrada.nextInt();

		while (operacao < 1 || operacao > 5) {
			System.out.println("Operação Inválida - Informe a operação matemática: \n" 
	                  + "1 - Soma\n" 
			          + "2 - Subtração\n" 
	                  + "3 - Multiplicação\n"
	                  + "4 - Divisão\n"
	                  + "5 - Aleatório\n");
	        operacao = entrada.nextInt();

		}

		System.out.println("Informe o nível de dificuldade: \n" + "1 - Fácil\n" + "2 - Médio\n" + "3 - Difícil\n");
		opcao = entrada.nextInt();

		while (opcao < 1 || opcao > 3) {
			System.out.println("Opção Inválida - Informe o nível de dificuldade: \n" + "1 - Fácil\n" + "2 - Médio\n"
					+ "3 - Difícil\n");
			opcao = entrada.nextInt();

		}
		
		if(operacao == 5) {
			operacao = 1 + numeroAleatorio.nextInt(5);
		}
        
		if(operacao == 1) {
			for (int i = 1; i <= 10; i++) {
				soma(opcao);
			}
		}
		
		if(operacao == 2) {
			for (int i = 1; i <= 10; i++) {
				subtracao(opcao);
			}
		}
		
		if(operacao == 3) {
			for (int i = 1; i <= 10; i++) {
				multiplicacao(opcao);
			}
		}
		
		if(operacao == 4) {
			for (int i = 1; i <= 10; i++) {
				divisao(opcao);
			}
		}
		

		double resultado = ((acertou / 10) - (errou / 10)) * 100;

		if (resultado < 75.0) {
			System.out.println("\nPeça Ajuda ao seu professor, sua média foi de: " + resultado);
		} else {
			System.out.println("\nParabéns - Sua Média foi de: " + resultado);
		}

	}

	public static void multiplicacao(int o) {

		int numero1 = 0;
		int numero2 = 0;
		int multiplicacao = 0;
		int resposta;
		int correta;
		int incorreta;

		SecureRandom numeroAleatorio = new SecureRandom();
		Scanner entrada = new Scanner(System.in);

		if (o == 1) {
			numero1 = numeroAleatorio.nextInt(10);
			numero2 = numeroAleatorio.nextInt(10);
			multiplicacao = numero1 * numero2;
		} else {
			if (o == 2) {
				numero1 = numeroAleatorio.nextInt(100);
				numero2 = numeroAleatorio.nextInt(100);
				multiplicacao = numero1 * numero2;
			} else {
				if (o == 3) {
					numero1 = numeroAleatorio.nextInt(1000);
					numero2 = numeroAleatorio.nextInt(1000);
					multiplicacao = numero1 * numero2;
				}
			}
		}

		System.out.printf("%nQuanto é %d * %d ?%n", numero1, numero2);
		resposta = entrada.nextInt();

		if (resposta == multiplicacao) {
			correta = 1 + numeroAleatorio.nextInt(4);

			switch (correta) {
			case 1:
				System.out.println("Muito Bom!");
				break;
			case 2:
				System.out.println("Excelente!");
				break;
			case 3:
				System.out.println("Bom Trabalho!");
				break;
			case 4:
				System.out.println("Mantenha um bom trabalho!");
				break;
			default:
				System.out.println("Muito Bem!");
				break;
			}
			acertou++;
		} else {
			while (resposta != multiplicacao) {
				incorreta = 1 + numeroAleatorio.nextInt(4);

				switch (incorreta) {
				case 1:
					System.out.println("Não, por favor tente de novo");
					break;
				case 2:
					System.out.println("Errado. Tente mais uma vez.");
					break;
				case 3:
					System.out.println("Não desista!");
					break;
				case 4:
					System.out.println("Não. Continue tentando.");
					break;
				default:
					System.out.println("Errado!");
					break;
				}

				errou++;
				System.out.printf("%nResposta Incorreta! Tente de novo! Quanto é %d * %d ?%n", numero1, numero2);
				resposta = entrada.nextInt();
			}
			acertou++;
			System.out.println("Muito Bem!");
		}
	}
	
	public static void soma(int o) {

		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		int resposta;
		int correta;
		int incorreta;

		SecureRandom numeroAleatorio = new SecureRandom();
		Scanner entrada = new Scanner(System.in);

		if (o == 1) {
			numero1 = numeroAleatorio.nextInt(10);
			numero2 = numeroAleatorio.nextInt(10);
			soma = numero1 + numero2;
		} else {
			if (o == 2) {
				numero1 = numeroAleatorio.nextInt(100);
				numero2 = numeroAleatorio.nextInt(100);
				soma = numero1 + numero2;
			} else {
				if (o == 3) {
					numero1 = numeroAleatorio.nextInt(1000);
					numero2 = numeroAleatorio.nextInt(1000);
					soma = numero1 + numero2;
				}
			}
		}

		System.out.printf("%nQuanto é %d + %d ?%n", numero1, numero2);
		resposta = entrada.nextInt();

		if (resposta == soma) {
			correta = 1 + numeroAleatorio.nextInt(4);

			switch (correta) {
			case 1:
				System.out.println("Muito Bom!");
				break;
			case 2:
				System.out.println("Excelente!");
				break;
			case 3:
				System.out.println("Bom Trabalho!");
				break;
			case 4:
				System.out.println("Mantenha um bom trabalho!");
				break;
			default:
				System.out.println("Muito Bem!");
				break;
			}
			acertou++;
		} else {
			while (resposta != soma) {
				incorreta = 1 + numeroAleatorio.nextInt(4);

				switch (incorreta) {
				case 1:
					System.out.println("Não, por favor tente de novo");
					break;
				case 2:
					System.out.println("Errado. Tente mais uma vez.");
					break;
				case 3:
					System.out.println("Não desista!");
					break;
				case 4:
					System.out.println("Não. Continue tentando.");
					break;
				default:
					System.out.println("Errado!");
					break;
				}

				errou++;
				System.out.printf("%nResposta Incorreta! Tente de novo! Quanto é %d + %d ?%n", numero1, numero2);
				resposta = entrada.nextInt();
			}
			acertou++;
			System.out.println("Muito Bem!");
		}
	}
	
	public static void subtracao(int o) {

		int numero1 = 0;
		int numero2 = 0;
		int subtracao = 0;
		int resposta;
		int correta;
		int incorreta;

		SecureRandom numeroAleatorio = new SecureRandom();
		Scanner entrada = new Scanner(System.in);

		if (o == 1) {
			numero1 = numeroAleatorio.nextInt(10);
			numero2 = numeroAleatorio.nextInt(10);
			subtracao = numero1 - numero2;
		} else {
			if (o == 2) {
				numero1 = numeroAleatorio.nextInt(100);
				numero2 = numeroAleatorio.nextInt(100);
				subtracao = numero1 - numero2;
			} else {
				if (o == 3) {
					numero1 = numeroAleatorio.nextInt(1000);
					numero2 = numeroAleatorio.nextInt(1000);
					subtracao = numero1 - numero2;
				}
			}
		}

		System.out.printf("%nQuanto é %d - %d ?%n", numero1, numero2);
		resposta = entrada.nextInt();

		if (resposta == subtracao) {
			correta = 1 + numeroAleatorio.nextInt(4);

			switch (correta) {
			case 1:
				System.out.println("Muito Bom!");
				break;
			case 2:
				System.out.println("Excelente!");
				break;
			case 3:
				System.out.println("Bom Trabalho!");
				break;
			case 4:
				System.out.println("Mantenha um bom trabalho!");
				break;
			default:
				System.out.println("Muito Bem!");
				break;
			}
			acertou++;
		} else {
			while (resposta != subtracao) {
				incorreta = 1 + numeroAleatorio.nextInt(4);

				switch (incorreta) {
				case 1:
					System.out.println("Não, por favor tente de novo");
					break;
				case 2:
					System.out.println("Errado. Tente mais uma vez.");
					break;
				case 3:
					System.out.println("Não desista!");
					break;
				case 4:
					System.out.println("Não. Continue tentando.");
					break;
				default:
					System.out.println("Errado!");
					break;
				}

				errou++;
				System.out.printf("%nResposta Incorreta! Tente de novo! Quanto é %d - %d ?%n", numero1, numero2);
				resposta = entrada.nextInt();
			}
			acertou++;
			System.out.println("Muito Bem!");
		}
	}
	
	public static void divisao(int o) {

		int numero1 = 0;
		int numero2 = 0;
		int divisao = 0;
		int resposta;
		int correta;
		int incorreta;

		SecureRandom numeroAleatorio = new SecureRandom();
		Scanner entrada = new Scanner(System.in);

		if (o == 1) {
			numero1 = numeroAleatorio.nextInt(10);
			numero2 = numeroAleatorio.nextInt(10);
			divisao = numero1 / numero2;
		} else {
			if (o == 2) {
				numero1 = numeroAleatorio.nextInt(100);
				numero2 = numeroAleatorio.nextInt(100);
				divisao = numero1 / numero2;
			} else {
				if (o == 3) {
					numero1 = numeroAleatorio.nextInt(1000);
					numero2 = numeroAleatorio.nextInt(1000);
					divisao = numero1 / numero2;
				}
			}
		}

		System.out.printf("%nQuanto é %d / %d ?%n", numero1, numero2);
		resposta = entrada.nextInt();

		if (resposta == divisao) {
			correta = 1 + numeroAleatorio.nextInt(4);

			switch (correta) {
			case 1:
				System.out.println("Muito Bom!");
				break;
			case 2:
				System.out.println("Excelente!");
				break;
			case 3:
				System.out.println("Bom Trabalho!");
				break;
			case 4:
				System.out.println("Mantenha um bom trabalho!");
				break;
			default:
				System.out.println("Muito Bem!");
				break;
			}
			acertou++;
		} else {
			while (resposta != divisao) {
				incorreta = 1 + numeroAleatorio.nextInt(4);

				switch (incorreta) {
				case 1:
					System.out.println("Não, por favor tente de novo");
					break;
				case 2:
					System.out.println("Errado. Tente mais uma vez.");
					break;
				case 3:
					System.out.println("Não desista!");
					break;
				case 4:
					System.out.println("Não. Continue tentando.");
					break;
				default:
					System.out.println("Errado!");
					break;
				}

				errou++;
				System.out.printf("%nResposta Incorreta! Tente de novo! Quanto é %d / %d ?%n", numero1, numero2);
				resposta = entrada.nextInt();
			}
			acertou++;
			System.out.println("Muito Bem!");
		}
	}

}
