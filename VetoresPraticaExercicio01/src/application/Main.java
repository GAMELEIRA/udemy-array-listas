package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:12/02/2020
 * HORA:17:12
 * FINALIDADE DO PROGRAMA: FAZER UM PROGRAMA QUE LEIA A ALTURA DE N PESSOAS INFORMADAS PELO USUARIO
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int numeroPessoas;

		double alturaMedia = 0, alturaTotal = 0;

		Pessoa pessoa[], gente;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe o número de pessoas:");

		numeroPessoas = dados.nextInt();

		pessoa = new Pessoa[numeroPessoas];

		for (int i = 1; i <= numeroPessoas; i++) {

			int cont = 0;

			System.out.println("Informe a altura da pessoa " + i + ".");

			gente = new Pessoa();

			gente.setAltura(dados.nextDouble());

			pessoa[cont] = gente;

			alturaTotal += pessoa[cont].getAltura();

			cont++;

		}

		alturaMedia = alturaTotal / numeroPessoas;

		System.out.println("Altura média: " + alturaMedia);

		dados.close();

	}

}
