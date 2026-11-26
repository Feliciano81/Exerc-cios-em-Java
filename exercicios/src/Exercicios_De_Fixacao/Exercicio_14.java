package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que receba um valor A e B,
 e troque o valor de A por B e o valor de B por A e imprima na tela os valores.*/
public class Exercicio_14 {
    public static void main(String[] args) {
        double numA, numB, numC;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número A:");
        numA = entrada.nextDouble();
        System.out.println("Digite o número B:");
        numB = entrada.nextDouble();

        numC = numA;
        numA = numB;
        numB = numC;

        System.out.println("O número A é: " + numA + " e o número B é: " + numB);

    }
}
