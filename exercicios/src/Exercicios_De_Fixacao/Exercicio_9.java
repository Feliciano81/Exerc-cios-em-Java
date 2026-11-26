package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua
altura e imprima na tela sua condição de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC



 Abaixo de 18,5   | Abaixo do peso

 Entre 18,6 e 24,9 | Peso ideal (parabéns)

 Entre 25,0 e 29,9 | Levemente acima do peso

 Entre 30,0 e 34,9 | Obesidade grau I

 Entre 35,0 e 39,9 | Obesidade grau II (severa)

 Maior ou igual a 40 | Obesidade grau III (mórbida)*/
public class Exercicio_9 {
    public static void main(String[] args) {
        double altura, peso, IMC;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();
        altura = altura / 100;
        System.out.println("Digite seu peso: ");
        peso = entrada.nextDouble();

        IMC = peso / Math.pow(altura, 2);


        if (IMC <= 18.5){
            System.out.println("Abaixo do peso,seu IMC é de: " + IMC);
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Peso ideal, seu IMC é de: " + IMC);
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Levemente acima do peso,seu IMC é de: " + IMC);
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Obesidade grau 1,seu IMC é de: " + IMC);
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Obesidade grau 2 (severa), seu IMC é de: " + IMC);
        } else if (IMC >= 40) {
            System.out.println("Obesidade grau 3 (mórbida), seu IMC é de: " + IMC);
        }


    }
}
