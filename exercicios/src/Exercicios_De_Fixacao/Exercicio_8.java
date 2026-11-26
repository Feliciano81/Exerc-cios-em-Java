package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que leia três valores inteiros diferentes
 e imprima na tela os valores em ordem decrescente.*/
public class Exercicio_8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o 1° número: ");
        a = entrada.nextInt();
        System.out.println("Digite o 2° número: ");
        b = entrada.nextInt();
        System.out.println("Digite o 3° número: ");
        c = entrada.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(" Menor: " + c + " Médio: " + b + " Maior: " + a);
            }else {
                System.out.println(" Menor: " + b + " Médio: " + c + " Maior: " + a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(" Menor: " + c + " Médio: " + a + " Maior: " + b);
            }else {
                System.out.println(" Menor: " + a + " Médio: " + c + " Maior: " + b);
            }
        } else if (c > a && c > b) {
            if (b > a) {
                System.out.println(" Menor: " + a + " Médio: " + b + " Maior: " + c);
            }else {
                System.out.println(" Menor: " + b + " Médio: " + a + " Maior: " + c);
            }
        }

    }
}
