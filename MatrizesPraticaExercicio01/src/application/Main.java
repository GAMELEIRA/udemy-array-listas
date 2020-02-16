package application;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:16/02/2020
 * HORA:00:49
 * FINALIDADE DO PROGRAMA:LER UM VALOR QUE IRA DEFINIR AS COLUNAS E LINHAS DE UMA MATRIZ,
 * E MOSTRAR A DIAGONAL PRINCIPAL E O MENOR VALOR
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dados;

		int contNegativos = 0, colunaLinhaMatriz, matriz[][];

		dados = new Scanner(System.in);

		System.out.println("Informe um valor para matriz.");

		colunaLinhaMatriz = dados.nextInt();

		matriz = new int[colunaLinhaMatriz][colunaLinhaMatriz];

		for (int a = 0; a < matriz.length; a++) {

			for (int c = 0; c < matriz[a].length; c++) {
				
				System.out.println("Informe o valor da matriz na linha: " + a + " coluna " + c);

				matriz[a][c] = dados.nextInt();
				
			}
		}

		for (int i = 0; i < colunaLinhaMatriz; i++) {

			System.out.println("Diagonal:");
			
			System.out.print(matriz[i][i]);

		}

		System.out.println("");
		
		
		for (int a = 0; a < matriz.length; a++) {

			for (int c = 0; c < matriz[a].length; c++) {

				contNegativos = (matriz[a][c] < 0) ? ++contNegativos : ++contNegativos - 1;

			}

		}

		System.out.println("Negativos: " + contNegativos);

		dados.close();
	}

}
