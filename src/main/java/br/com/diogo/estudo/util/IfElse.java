package br.com.diogo.estudo.util;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        int a, b, c ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor desejado e depois aperte a tecla Enter: ");
        a = scan.nextInt();
        System.out.println("Digite o valor desejado e depois aperte a tecla Enter: ");
        b = scan.nextInt();
        c = a + b;

       if(c > 0) {
           System.out.println("O resultado da operação é " + c + ", sendo assim, o resultado é Positivo");
        } else if(c < 0 ) {
            System.out.println("O resultado da operação é " + c + ", sendo assim, o resultado é Negativo");
        } else {
           System.out.println("O resultado da operação é Zero");
        }
    }
}