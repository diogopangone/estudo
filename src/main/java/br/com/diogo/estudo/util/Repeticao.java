package br.com.diogo.estudo.util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        /*int contador = 0;
        while (contador<12){
            System.out.println("Contando " + (contador+1));
            contador++;*/ //comando de repetição (enquanto "While")até o valor desejado

        /*int contador = 0;
        while (contador<12){
            contador++;

            if (contador == 5 || contador == 11){
                continue;
            }
            System.out.println("Contando "+ contador);*/ // comando com "continue" (não mostra o valor e continua)

        /*int contador = 0;
        while (contador<12){
            contador++;

            if (contador == 5 || contador == 9){
                continue;
            } if (contador == 11){
                break;
            }
            System.out.println("Contando "+ contador);*/ //comando "break" (para o contador no valor escolhido)

        /*int contador = 0;
        do{
            System.out.println("Contando: " + contador);
            contador++;

        } while(contador<8);*/ //comando de repitição ( repita "Do") até o valor desejado

        /*int num, soma=0;
        String resposta;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Digite um número que deseje somar: ");
            num = scan.nextInt();
            soma += num;
            System.out.print("Você deseja continuar (S/N)? ");
            resposta = scan.next();

        }while (resposta.equals("S"));
        System.out.print("A soma de todos os valores digitados são: " + soma);*/

        /*for (int contador=0; contador<=8; contador++){
            System.out.println("Contando: " + contador);*/

        /*for (int contador=0; contador<=27; contador+=3){
            System.out.println("Contando: " + contador);*/

            /*for (int contador=89; contador>=27; contador-=2){
                System.out.println("Contando: " + contador);*/

            for (float contador=0; contador<100; contador+=10) {
                System.out.println("Contando: " + contador);

        }

    }
}
