package br.com.diogo.estudo.util;

public class VetorMes {
    public static void main(String[] args) {

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago",
        "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int result=0; result< mes.length; result++){
            System.out.println("O mês de " + mes[result] + " tem " +dias[result] + " dias.");

        }
    }
}
