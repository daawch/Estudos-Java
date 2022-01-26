package aula01;

import java.util.Scanner;

public class ex01 
{
	public static void main(String[] args) 
	{
		int dia, meses, anos, dias;
		Scanner id = new Scanner (System.in);
	
			
		System.out.print("quantos anos você tem?: ");
		
		anos=id.nextInt();
		
		System.out.print("quantos meses você tem: ");
		
		meses=id.nextInt();
		
		System.out.print("quantos dias você tem: ");

		dia=id.nextInt();
		
		dias = dia+(anos*365) + (meses*30);
		
		System.out.print("você tem: "+ dias);
				

	}
}
