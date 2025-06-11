package Hackathon_Ex;

import java.util.Scanner;

public class ForçaPokemon {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Insira a força do seu pokemon para o classificar: ");
		int força = ler.nextInt();
		System.out.println(força > 70? "Pokemon de elite" : "Pokemon comum");

	}

}
