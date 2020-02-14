package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list;

		list = new ArrayList<String>();

		// ADICIONA ELEMENTOS NA LISTA
		list.add("Gabriel");

		list.add("Gabrielly");

		list.add("Fernanda");

		list.add("Laura");

		list.add("Heloisa");

		list.add("Giovanna");

		list.add(2, "Fabiana");

		// TAMANHO DA LISTA
		list.size();

		// COMPARA VALORES NA LISTA E REMOVE A PRIMEIRA INSTANCIA DA LISTA COM ESSE
		// VALOR
		list.remove("Laura");

		// REMOVE A INSTANCIA NA POSICAO UM
		list.remove(1);

		// EXECUTA COMANDOS PARA CADA ELEMENTO DA LISTA
		for (String nomes : list) {

			System.out.println(nomes);

		}

		System.out.println("+++++++++++++++++++++++++++");

		list.removeIf(x -> x.charAt(0) == 'G');

		for (String a : list) {

			System.out.println(a);

		}

		System.out.println("+================================");

		System.out.println("Indxof:" + list.indexOf("Heloisa"));

		System.out.println("+=================================");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());

		for (String a : result) {

			System.out.println(a);

		}

		// ELEMENTO DA LISTA QUE ATENDA A DETERMINADO PREDICADO
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println(name);
		
	}

}
