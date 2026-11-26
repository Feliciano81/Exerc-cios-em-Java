package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.*/
public class Exercicio_6 {
    public static void main(String[] args) {
        double valor, resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("|=====PROGRAMA DE REAJUSTE DE 5%=====|");
        System.out.println("Entre com o um valor numérico:");
        entrada.hasNextDouble();
        while (!entrada.hasNextDouble()) {
            System.out.println("Valor incompatível, utilize um valor numérico: ");
            entrada.nextLine();
        }
        valor = entrada.nextDouble();
        resultado = valor * 1.05;
        System.out.println("O valor reajustado em 5% é de: "+ resultado + " reais");
    }
}
