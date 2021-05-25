package br.com.diogo.estudo.util;

public class ClasseMath {
    public static void main(String[] args) {

        /*float v = 8.9f;
        int result = (int) Math.floor(v);
        System.out.println(result);*/ //Arredondamento para baixo

          /*float v = 8.9f;
        int result = (int) Math.ceil(v);
        System.out.println(result);*/ //Arredondamento para cima

        /*float v = 8.4f;
        int result = (int) Math.round(v);
        System.out.println(result);*/ //Arredondamento aritmetico

        /*double aleatorio = Math.random();
        System.out.println(aleatorio);*/ //Gerador de números aleatorio entre 0 e 1

        /*double aleatorio = Math.random();
        int ale = (int) (1 + aleatorio * (100-1));
        System.out.println(ale);*/ //garador de número aleatorio entre 1 e 100

        /*int num = 25;
        int result = (int) Math.sqrt(num);
        System.out.println(result);*/ //Calculo da raiz quadrada

        /*int a = 3;
        int b = 5;
        int result = (int) Math.pow(a , b);
        System.out.println("O resultado é: " + result);*/ //Calculo de exponencial

        /*int num = 125;
        int result = (int) Math.cbrt(num);
        System.out.println(result);*/ //Calculo da raiz cubica

        double result = (double) Math.PI;
        System.out.println(result);  //Calculo do valor de PI

    }

}
