package br.com.diogo.estudo.util;

import java.time.LocalDate;
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {

        /*int a, b, c;
        a = 4;
        b = 7;
        c = 12;
        boolean r;

        r = (a<b && b<c)?true:false;
        System.out.println(r);*/ //verdadeiro, pois os dois são verdadeiros (&& significa "e")

        /*int a, b, c;
        a = 4;
        b = 7;
        c = 12;
        boolean r;

        r = (a<b && b==c)?true:false;
        System.out.println(r);*/ //false, pois o primeiro é verdadeiro e o segundo False (&& significa "e")

        /*int a, b, c;
        a = 4;
        b = 7;
        c = 12;
        boolean r;

        r = (a<b || b==c)?true:false;
        System.out.println(r);*/ // true, pois o primeiro é verdadeiro e o segundo False (|| significa "ou")

        /*int a, b, c;
        a = 4;
        b = 7;
        c = 12;
        boolean r;

        r = (a<b ^ b==c)?true:false;
        System.out.println(r);*/ // true, pois o primeiro é verdadeiro e o segundo False (^ significa "ou exclusivo")

        int nas;
        int ano = LocalDate.now().getYear();
        int result;
        int c;
        Scanner idade = new Scanner(System.in);
        System.out.print("Qual sua data de nascimento: ");
        nas = idade.nextInt();
        result = ano - nas;


        if (( result>= 16 && result< 18) || (result> 70)) {
            System.out.println("Você tem " + result + " anos e seu voto é opcional!");
        } else if (result<16){
            System.out.println("Você tem " + result + " anos e não tem idade para votar!");
        } else{
            System.out.println("Você tem " + result + " anos e seu voto é obrigatório!");
        }

    }
}
