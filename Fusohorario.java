package Hackathon_Ex;

import java.util.Scanner;

public class Fusohorario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Escreva um horário para descobrir seu fuso horário em relação ao UTC (valores entre -12 e +14): ");
		int horario = ler.nextInt();
		if (horario > 0) {
			System.out.println("Horário adiantado em relação ao UTC 0");
		}
		else if (horario < 0) {
			System.out.println("Horário atrasado em relação ao UTC 0");
		}
		else {
			System.out.println("Horário UTC igual a 0");
		}
		
	}
}

