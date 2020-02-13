package entities;

import java.util.Arrays;

public class Pensao {

	Estudante quartos[];

	public Pensao() {

		quartos = new Estudante[10];

	}

	public Estudante[] getQuartos() {
		return quartos;
	}

	public void percorreQuartos() {

		for (int i = 0; i < quartos.length; i++) {

			if (!(quartos[i] == null)) {

				System.out.println(quartos[i].toString());
				
			}else {
				
				System.out.println("null");
				
			}
			
			
		}

	}

	public boolean ocuparQuartos(Estudante estudante) {

		if (verificaDisponibilidadeQuarto(estudante.getQuarto()) && estudante.getQuarto() >= 0
				&& estudante.getQuarto() < 10) {

			quartos[estudante.getQuarto()] = estudante;

			return true;

		} else {

			return false;

		}

	}

	private boolean verificaDisponibilidadeQuarto(byte numeroQuarto) {

		if (quartos[numeroQuarto] == null) {

			return true;

		} else {

			return false;
		}

	}

	@Override
	public String toString() {
		return "Pensao [quartos=" + Arrays.toString(quartos) + "]";
	}

}
