package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que leia três notas obtidas por um aluno,
 e imprima na tela a média das notas.*/
public class Exercicio_10 {
    public static void main(String[] args) {
        double media = 0;
        double[] notas = new double[3];

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++){
            System.out.println("Entre com a "+ (i + 1) + "° nota: ");
            notas[i] = entrada.nextDouble();
            media += notas[i];
        }
        media = media / notas.length;
        System.out.println("A média é: " + media);

    }
}
