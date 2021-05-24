package br.com.diogo.estudo.util;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        int a, b, c ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valor desejado: ");
        a = scan.nextInt();
        System.out.println("Digite outro valor desejado: ");
        b = scan.nextInt();
        c = a + b;
        System.out.println("O resultado da soma é " + c);


        
    }
}
