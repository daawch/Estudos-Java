package aula01;

import java.util.Scanner;

public class ex04 
{
public static void main(String[] args) 
	{
		int va, vb, vc;
		double vr, vs, vd;
		Scanner id = new Scanner (System.in);
		
			System.out.println("Escreva um valor para A, B e C: ");
			
			va=id.nextInt();
			
			vb=id.nextInt();
			
			vc=id.nextInt();
			
			vr= (va+vb)^2;
			
			vs= (vb+vc)^2;
			
			vd= (vr+vs)/2;
			
			System.out.print("o resultado é: "+vd);
							
		
	}
	
	
}
