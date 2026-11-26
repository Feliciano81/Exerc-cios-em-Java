package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
 meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.*/
public class Exercicio_15 {
    public static void main(String[] args) {
        int anoAtual = 2026, anoNascimento, qtdAnos, qtdDias, qtdMeses, diasRestantes;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = entrada.nextInt();
        qtdAnos = anoAtual - anoNascimento;
        qtdDias = qtdAnos * 365;
        qtdMeses = qtdDias / 30;
        diasRestantes = qtdDias % 30;

        qtdAnos = qtdMeses / 12;
        qtdMeses = qtdMeses % 12;


        System.out.println("Você já viveu " + qtdAnos + " anos, "+ qtdMeses + " meses e "+ diasRestantes + " dias");

    }
}
