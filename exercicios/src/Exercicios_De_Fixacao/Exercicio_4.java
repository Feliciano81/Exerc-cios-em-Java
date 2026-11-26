package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que receba um número
 inteiro e imprima na tela o seu antecessor e o seu sucessor.*/
public class Exercicio_4 {
    public static void main(String[] args) {
        int numero, antecessor, sucessor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é: " + antecessor + " e o sucessor é : " + sucessor);
    }
}
