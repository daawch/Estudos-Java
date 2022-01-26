package aula01;

import java.util.Scanner;

public class ex03
{
	public static void main(String[] args) 
	{
		int seg;
		Scanner id = new Scanner (System.in);
		
		System.out.print("escreva quantos segundos durou o evento da fabrica: ");
		
		seg=id.nextInt();
		
		System.out.print("convertido em horas: "+ (seg/3600) + " minutos: " + (seg/60) + " segundos: " + seg);
		
	}
	
	
	
	
}
