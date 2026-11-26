package Exercicios_De_Fixacao;
/* Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
conforme a escolha da forma de pagamento
pelo comprador e imprima na tela o valor final do produto a ser pago.
Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

Tabela de Código de Condições de Pagamento
1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
2 - À Vista no cartão de crédito, recebe 10% de desconto
3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorProduto;
        double valorFinal = 0;
        int formaPagamento;

        System.out.println("Digite o valor do produto:");
        valorProduto = entrada.nextDouble();

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - Crédito à vista (10% de desconto)");
        System.out.println("3 - Cartão em 2 vezes (sem juros)");
        System.out.println("4 - Cartão em 3 vezes ou mais (10% de juros)");

        formaPagamento = entrada.nextInt();

        switch (formaPagamento) {

            case 1:
                valorFinal = valorProduto * 0.85;
                break;

            case 2:
                valorFinal = valorProduto * 0.90;
                break;

            case 3:
                valorFinal = valorProduto;
                break;

            case 4:
                valorFinal = valorProduto * 1.10;
                break;

            default:
                System.out.println("Forma de pagamento inválida!");
                entrada.close();
                return;
        }

        System.out.printf("Valor final do produto: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}



