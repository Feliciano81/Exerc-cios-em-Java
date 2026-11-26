package Exercicios_De_Fixacao;

import java.util.Scanner;
/*Faça um algoritmo que leia os valores de A, B, C e em seguida
imprima na tela a soma entre A e B é mostre se a soma é menor que C.*/
public class Exercicio_1 {
    public static void main(String[] args) {
        int numeroA;
        int numeroB;
        int numeroC;
        int somaAB;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numeroA = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numeroB = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        numeroC = entrada.nextInt();

        somaAB = numeroA + numeroB;

        System.out.println("A soma do primeiro número pelo segundo é de "+somaAB);
        if (somaAB < numeroC){
            System.out.println("A soma do primeiro pelo segundo é menor que "+ numeroC);
        }else {
            System.out.println("A soma do primeiro pelo segundo é maior que " + numeroC);
        }




    }
}
