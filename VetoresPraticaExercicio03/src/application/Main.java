package application;

import java.util.Scanner;

import entities.Estudante;
import entities.Pensao;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:13/02/2020
 * HORA:18:55
 * FINALIDADE DO PROGRAMA: SIMULAR A ALOCACAO DE PENSOES PARA ESTUDANTES
 */

public class Main {

	public static void main(String[] args) {

		Scanner dadosString, dadosNumericos;

		Estudante estudante;

		Pensao pensao;

		boolean contratoFirmado;

		int quantidadeEstudantes;

		dadosString = new Scanner(System.in);

		dadosNumericos = new Scanner(System.in);

		pensao = new Pensao();

		do {

			System.out.println("Informe a quantidade (1-10) de estudantes:");

			quantidadeEstudantes = dadosNumericos.nextInt();

		} while (quantidadeEstudantes <= 0 || quantidadeEstudantes > 10);

		for (int i = 0; i < quantidadeEstudantes; i++) {

			estudante = new Estudante();

			System.out.println("Informe o nome do estudante:");

			estudante.setNome(dadosString.nextLine());

			System.out.println("Informe o e-mail do estudante:");

			estudante.setEmail(dadosString.nextLine());

			do {

				System.out.println("Informe o quarto que escolhe:");

				estudante.setQuarto(dadosNumericos.nextByte());

				contratoFirmado = pensao.ocuparQuartos(estudante);

				if (contratoFirmado == false) {

					System.out.printf("Imovel está indisponivel para aluguel. %nEscolha outro!%n");

				}

			} while (contratoFirmado == false);

		}

		pensao.percorreQuartos();
		
	}

}
