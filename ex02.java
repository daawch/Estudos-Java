package aula01;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        int dias, meses, ano, result;
        Scanner id = new Scanner (System.in);



        System.out.println("Insira sua idade em dias: ");
        dias=id.nextInt();

        meses=(dias/30);
        ano=(dias/365);
        result=(dias%365);



        System.out.println("Sua idade em anos: "+ano+" Sua idade em meses: "+meses+" Sua idade em dias: "+dias);



    }
    
}