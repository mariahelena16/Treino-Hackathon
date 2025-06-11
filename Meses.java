package Hackathon_Ex;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Insira um mês em numeral (1-12) e descubra a estação do ano: ");
        int meses = ler.nextInt();
        
        switch (meses)
        {
        case 12, 1, 2 :
        	System.out.println("Verão");
        break;
        case 3, 4, 5 :
        	System.out.println("Outono");
        break;
        case 6, 7, 8:
        	System.out.println("Inverno");
        break;
        case 9, 10, 11:
        	System.out.println("Primavera");
        break;
        default :
        	System.out.println("Mês inválido");
        break;
	}

}}
