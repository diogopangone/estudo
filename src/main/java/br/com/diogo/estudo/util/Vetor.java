package br.com.diogo.estudo.util;

import java.util.Arrays;

public class Vetor {
    public static void main(String[] args) {
        /*int vetor[] = {2,5,6,10,8,9,15};
        //System.out.println("O total de casas do Vetor é: " + vetor.length);
        for (int result=0; result<=vetor.length-1; result++){
            System.out.println("Na posicção " + result + " do vetor, o valor é: " + vetor[result]);*/

       /* double vetor[] = {3.5, 2.8, -7.9, 23.5, 34.44};
        Arrays.sort(vetor);
        for (double result:  vetor){
            System.out.println(result + " "); */

       /* int vetor[] = {10, 6, 0, 32, 170, 89};
        int posicao = Arrays.binarySearch(vetor, 170);
        System.out.println("O valor está na posição: " + posicao);*/ //organizar os Numeros que aparece no vetor

        int vetor[] = new int[25];
        Arrays.fill(vetor, 0);
        for (int result : vetor) {
            System.out.println("O valor é " + result); //preencher as posições dos vetores,
                                                                                         // com o mesmo valor

        }
    }
}

