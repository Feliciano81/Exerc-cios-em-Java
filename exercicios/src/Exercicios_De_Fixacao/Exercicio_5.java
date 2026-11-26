package Exercicios_De_Fixacao;

import java.util.Scanner;

/*Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e
imprima na tela o resultado. (Base para o Salário mínimo R$ 1.621,00).*/
public class Exercicio_5 {
    public static void main(String[] args) {
        double salario, qtdSalarioMinimo;
        double salarioMinimo = 1621.00;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        salario = entrada.nextInt();
        qtdSalarioMinimo = salario / salarioMinimo;
        double qtdSalarioMinimoArredondado = Math.round(qtdSalarioMinimo * 100.0 ) / 100.0;

        System.out.println("O salário de "+ salario + " equivale à " + qtdSalarioMinimoArredondado + " salários mínimos");

    }
}
