package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:14/02/2020
 * HORA:16:40 
 * FINALIDADE DO PROGRAMA:REALIZAR A ENTRADA DE DADOS DE V�RIOS FUNCION�RIOS E CALCULAR O AUMENTO
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int quantidadeFuncionarios, id, idAumento;

		boolean achouId = false;

		double porcentagemAumento;

		Scanner dadosString, dadosNumericos;

		Funcionario funcionario;

		List<Funcionario> listaFuncionarios;

		dadosString = new Scanner(System.in);

		dadosNumericos = new Scanner(System.in);

		listaFuncionarios = new ArrayList<Funcionario>();

		System.out.println("Informe a quantidade de funcion�rios:");

		quantidadeFuncionarios = dadosNumericos.nextInt();

		for (int i = 1; i <= quantidadeFuncionarios; i++) {

			funcionario = new Funcionario();

			do {

				System.out.println("informe o id:");

				id = dadosNumericos.nextInt();

				for (Funcionario a : listaFuncionarios) {

					achouId = (a.getId() == id) ? true : false;

					if (achouId) {

						break;
					}

				}

			} while (achouId == true);

			funcionario.setId(id);

			System.out.println("Informe o nome do funcion�rio:");

			funcionario.setNome(dadosString.nextLine());

			System.out.println("Informe o salario:");

			funcionario.setSalario(dadosNumericos.nextDouble());

			listaFuncionarios.add(funcionario);

		}

		do {
			
			System.out.println("Informe o id do funcion�rio que ir� receber o aumento:");

			idAumento = dadosNumericos.nextInt();

			for (Funcionario a : listaFuncionarios) {

				achouId = (a.getId() == idAumento) ? true : false;

				if (achouId) {

					System.out.println("Informe a porcentagem do aumento do funcion�rio:");

					porcentagemAumento = dadosNumericos.nextDouble();

					a.setSalario(a.getSalario() + a.getSalario() * (porcentagemAumento / 100));

					break;
				}

			}

			if (!(achouId == true)) {

				System.out.println("O id n�o foi encontrado!");

			}

		} while (!(achouId == true));

		System.out.println(listaFuncionarios.toString());

	}
}
