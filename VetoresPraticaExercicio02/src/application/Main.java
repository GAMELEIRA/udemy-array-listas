package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA:13/02/2020 HORA:17:55 FINALIDADE DO
 * PROGRAMA:
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner dadosString;

		Scanner dadosNumericos;

		Produto produto, vetorProduto[];

		double precoMedioProduto = 0, precoTotalProdutos = 0;

		int quantidadeProdutos;

		dadosString = new Scanner(System.in);

		dadosNumericos = new Scanner(System.in);

		System.out.println("Informe a quantidade de produtos:");

		quantidadeProdutos = dadosNumericos.nextInt();

		vetorProduto = new Produto[quantidadeProdutos];

		for (int i = 0; i < quantidadeProdutos; i++) {

			produto = new Produto();

			System.out.println("Informe o nome:");

			produto.setNome(dadosString.nextLine());

			System.out.println("Informe o preço:");

			produto.setPreco(dadosNumericos.nextDouble());

			vetorProduto[i] = produto;

			precoTotalProdutos += produto.getPreco();

		}

		precoMedioProduto = precoTotalProdutos / quantidadeProdutos;

		System.out.println("Preco médio:" + precoMedioProduto);

	}

}
