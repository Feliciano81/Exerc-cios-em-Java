package Exercicios_De_Fixacao;

import java.util.Scanner;

public class Exercicio_2 {
/*Faça um algoritmo para receber um número qualquer
 e imprimir na tela se o número é par ou ímpar, positivo ou negativo.*/
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = entrada.nextInt();

        if (num % 2 == 0 ){
            System.out.println("O valor: "+num+ " é par!!!");
        }else {
            System.out.println("O valor: "+num+ " é impar!!!");
        }
        if (num < 0){
            System.out.println("O valor: "+ num + " é negativo!!!");
        }else {
            System.out.println("O valor: "+num+ " é positivo!!!");
        }
    }
}
