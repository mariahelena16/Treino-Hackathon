package Hackathon_Ex;

import java.util.Scanner;

public class Evolução {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.print("Insira o nível do seu pokemon para descobrir se pode evoluir: ");
		int nivel = ler.nextInt();
		
System.out.println(nivel < 15 ? "Não pode evoluir" : "Pode evoluir");
	}

}
