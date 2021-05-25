package br.com.diogo.estudo.util;

public class ComparacaoString {
    public static void main(String[] args) {

        /*String nome1 = "Diogo";
        String nome2 = "Diogo";
        String nome3 = new String("Diogo");
        String result;
        result = (nome1==nome2)?"Igual":"Diferente";
        System.out.println(result);*/ //Comparação de string

        String nome1 = "Diogo";
        String nome2 = "Diogo";
        String nome3 = new String("Diogo");
        String result;
        result = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(result); //verificação se o conteúdo dos objetos são iguais

    }
}
