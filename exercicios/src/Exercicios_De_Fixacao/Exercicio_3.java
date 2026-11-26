package Exercicios_De_Fixacao;

import java.util.Scanner;

public class Exercicio_3 {
    /*Faça um algoritmo que leia dois valores inteiros A e B,
    se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos
deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.*/
    public static void main(String[] args) {
        int numeroA, numeroB, numeroC;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o 1° número: ");
        numeroA = entrada.nextInt();
        System.out.println("Entre com o 2º número: ");
        numeroB = entrada.nextInt();

        if (numeroA == numeroB){
            numeroC = numeroA + numeroB;
            System.out.println("A soma de " + numeroA + " + " + numeroB + " é: " + numeroC);
        }else {
            numeroC = numeroA * numeroB;
            System.out.println("A multiplicação de " + numeroA + " mais o número " + numeroB + " é: " + numeroC);
        }
    }
}
