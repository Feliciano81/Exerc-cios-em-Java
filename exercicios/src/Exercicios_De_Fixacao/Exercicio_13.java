package Exercicios_De_Fixacao;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade < 18){
            System.out.println(nome + ", você é menor de idade!!!");
        }else {
            System.out.println("MAIOR DE IDADE!");
        }
    }
}
