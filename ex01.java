package aula01;

import java.util.Scanner;

public class ex01 
{
	public static void main(String[] args) 
	{
		int dia, meses, anos, dias;
		Scanner id = new Scanner (System.in);
	
			
		System.out.print("quantos anos voc� tem?: ");
		
		anos=id.nextInt();
		
		System.out.print("quantos meses voc� tem: ");
		
		meses=id.nextInt();
		
		System.out.print("quantos dias voc� tem: ");

		dia=id.nextInt();
		
		dias = dia+(anos*365) + (meses*30);
		
		System.out.print("voc� tem: "+ dias);
				

	}
}
