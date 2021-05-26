package br.com.diogo.estudo.util;

public class Repeticao {
    public static void main(String[] args) {

        /*int contador = 0;
        while (contador<12){
            System.out.println("Contando " + (contador+1));
            contador++;*/ //comando de repetição até o valor desejado

        /*int contador = 0;
        while (contador<12){
            contador++;

            if (contador == 5 || contador == 11){
                continue;
            }
            System.out.println("Contando "+ contador);*/ // comando com "continue" (não mostra o valor e continua)

        int contador = 0;
        while (contador<12){
            contador++;

            if (contador == 5 || contador == 9){
                continue;
            } if (contador == 11){
                break;
            }
            System.out.println("Contando "+ contador); //comando "break" (para o contador no valor escolhido)





        }

    }
}
