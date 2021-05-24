package br.com.diogo.estudo.util;

public class IncompatibilidadeN_S {
    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/ //exemplo de numero para String

        /*String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);*/ //Exemplo de string para número inteiro

        String valor = "7.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f", idade);


    }
}
