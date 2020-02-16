package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:16/02/2020
 * HORA:11:31
 * FINALIDADE DO PROGRAMA: MONTAR UMA MATRIZ COM COLUNAS E LINHAS MONTADAS CONFORME VALORES
 * INFORMADOS PELO USUARIO E BUSCAR VALORES NA MATRIZ
 */

public class Main {

	public static void main(String[] args) {

		int colunas, linhas, matriz[][], valorBusca;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe a quantidade de linhas:");

		linhas = dados.nextInt();

		System.out.println("Informe a quantidade de colunas:");

		colunas = dados.nextInt();

		matriz = new int[linhas][colunas];

		inserirValorMatriz(matriz);

		System.out.println("Busque um valor na matriz:");

		valorBusca = dados.nextInt();

		buscarValores(matriz, valorBusca);

		dados.close();

	}

	public static void inserirValorMatriz(int matriz[][]) {

		Scanner dados;

		dados = new Scanner(System.in);

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.println("Informe o valor da linha " + linha + "coluna" + coluna);

				matriz[linha][coluna] = dados.nextInt();

			}

		}

	}

	public static void buscarValores(int matriz[][], int valorBusca) {

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				if (matriz[linha][coluna] == valorBusca) {

					if (linha - 1 >= 0 && coluna - 1 >= 0 && linha + 1 < matriz.length
							&& coluna + 1 < matriz[linha].length) {

						System.out.println("Posição: " + linha + "," + coluna);

						System.out.println("Esquerda: " + matriz[linha][coluna - 1]);

						System.out.println("Direita: " + matriz[linha][coluna + 1]);

						System.out.println("Cima: " + matriz[linha - 1][coluna]);

						System.out.println("Baixo: " + matriz[linha + 1][coluna]);

					} else if (linha - 1 >= 0 && coluna - 1 >= 0 && linha + 1 < matriz.length
							&& coluna + 1 >= matriz[linha].length) {

						System.out.println("Posição: " + linha + "," + coluna);
						
						System.out.println("Esquerda: " + matriz[linha][coluna - 1]);

						System.out.println("Cima: " + matriz[linha - 1][coluna]);

						System.out.println("Baixo: " + matriz[linha + 1][coluna]);

					} else if (linha - 1 >= 0 && coluna - 1 < 0 && linha + 1 < matriz.length
							&& coluna + 1 < matriz[linha].length) {
						
						System.out.println("Posição: " + linha + "," + coluna);

						System.out.println("Direita: " + matriz[linha][coluna + 1]);

						System.out.println("Cima: " + matriz[linha - 1][coluna]);

						System.out.println("Baixo: " + matriz[linha + 1][coluna]);

					} else if (linha - 1 < 0 && coluna - 1 >= 0 && linha + 1 < matriz.length
							&& coluna + 1 < matriz[linha].length) {

						System.out.println("Posição: " + linha + "," + coluna);
						
						System.out.println("Esquerda: " + matriz[linha][coluna - 1]);

						System.out.println("Direita: " + matriz[linha][coluna + 1]);

						System.out.println("Baixo: " + matriz[linha + 1][coluna]);

					} else if (linha - 1 >= 0 && coluna - 1 < 0 && linha + 1 >= matriz.length
							&& coluna + 1 >= matriz[linha].length) {

						System.out.println("Posição: " + linha + "," + coluna);
						
						System.out.println("Esquerda: " + matriz[linha][coluna - 1]);

						System.out.println("Direita: " + matriz[linha][coluna + 1]);

						System.out.println("Cima: " + matriz[linha - 1][coluna]);

					}

				}

			}

		}

	}

}
